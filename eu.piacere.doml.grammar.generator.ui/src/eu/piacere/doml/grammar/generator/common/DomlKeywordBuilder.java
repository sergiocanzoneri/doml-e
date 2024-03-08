package eu.piacere.doml.grammar.generator.common;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergio Canzoneri, Politecnico di Milano
 * 
 * A static class used to build keywords starting from the class, attribute or reference name.
 */
public final class DomlKeywordBuilder {
	
	// Pattern used to find sequences of upper-case letters.
    private final static Pattern uppercasePattern = Pattern.compile("[A-Z]+");

    // Returns the built keyword enclosed by apostrophes (used in Xtext).
	public static String buildKeyword(String name) {
		String keyword;
		// If the name only contains capital letters, then simply make it lower-case.
		if(isUppercase(name)) {
			keyword = "'" + name.toLowerCase() + "'";
		}
		/*
		 * If it contains both upper and lower case letters, then it assumes capital
		 * letters are used to indicate the start of each word in composite names.
		 * Then words are separated by using underscores and capital letters are
		 * converted to lower-case letters.
		 * If more than one consecutive capital letter followed by a lower-case
		 * letter are found, then it is assumed that the last capital letter indicates
		 * the start of a word, whereas all the other ones are part of another single word.
		 */
		else if(containsUppercase(name)) {
			keyword = "'" + makeUppercaseUnderscore(name) + "'";
		}
		// If it contains only lower-case letters, just surround it with apostrophes.
		else {
			keyword = "'" + name + "'";
		}
		return keyword;
	}
	
	private static boolean containsUppercase(String string) {
		return uppercasePattern.matcher(string).find();
	}
	
	private static boolean isUppercase(String string) {
		return uppercasePattern.matcher(string).matches();
	}
	
	private static String makeUppercaseUnderscore(String string) {
		StringBuilder bld = new StringBuilder();
		int currentStringStartIndex = 0;
		int currentStringEndIndex = 0;
        Matcher matcher = uppercasePattern.matcher(string);
        while (matcher.find()) {
        	currentStringEndIndex = matcher.start();
        	if(currentStringEndIndex > 0) {
        		bld.append(string.substring(currentStringStartIndex, currentStringEndIndex).toLowerCase());
	            bld.append('_');
	            if(matcher.end()>(matcher.start()+1)) {
	            	bld.append(string.substring(currentStringEndIndex, matcher.end()-1).toLowerCase());
	            	bld.append('_');
	            	currentStringStartIndex = matcher.end()-1;
	            }
	            else {
	            	currentStringStartIndex = currentStringEndIndex;
	            }
        	}
        	// String starts with uppercase
        	else if (matcher.end() > 1){
        		bld.append(string.substring(currentStringStartIndex, matcher.end()-1).toLowerCase());
        		bld.append('_');
        		currentStringStartIndex = matcher.end()-1;
        	}
        }
        bld.append(string.substring(currentStringStartIndex, string.length()).toLowerCase());
        return bld.toString();
	}
	
}
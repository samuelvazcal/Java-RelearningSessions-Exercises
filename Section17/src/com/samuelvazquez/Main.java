package com.samuelvazquez;

import javax.swing.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String string = "Trees need wind to reproduce. Climate change is messing that up.";
        System.out.println(string);
        String newString = string.replaceAll("e","3");
        System.out.println(newString);
        String alphanumeric = "abcDeeeF12Ghhiiiijkl99z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcDeee","YYY"));

        String alphanumeric2 = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(alphanumeric2.replaceAll("^abcDeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        String alphanumeric3 = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(alphanumeric3.matches("^abcDeeeF12GhhabcDeeeiiiijkl99z"));
        System.out.println(alphanumeric3.replaceAll("l99z","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[bc]","replacing..."));
        //it will replace if  a character of block 'aei' is followed by the block of 'GF'
        System.out.println(alphanumeric3.replaceAll("[aei][GF]","o"));

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String alphanumeric4 = "abcDeeeF12GhhabcDeeeiiiijkl99z";
        System.out.println(alphanumeric4.replaceAll("[^ei]",""));
        System.out.println(alphanumeric4.replaceAll("[a-f3-8]",""));
        //ignoring case sensitive
        System.out.println(alphanumeric4.replaceAll("(?i)[a-f3-8]",""));

        //System.out.println(alphanumeric4.replaceAll("[0-9]","X"));
        //replaces any digit
        System.out.println(alphanumeric4.replaceAll("\\d","X"));
        //replaces non digits
        System.out.println(alphanumeric4.replaceAll("\\D","X"));

        String hasWhiteSpace = "I have blanks and \t a tab, and also a new line\n";
        System.out.println(hasWhiteSpace);
        //removes the tab and the new line (whitespace character)
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));
        //removes all non whitespace characters
        System.out.println(hasWhiteSpace.replaceAll("\\S",""));
        System.out.println(hasWhiteSpace.replaceAll("\t","X"));

        String alphanumeric5 = "abcDeeeF12Gh\thabcDeeeiiiijkl99z";
        //whitespace characters are not replaced
        System.out.println(alphanumeric5.replaceAll("\\w","X"));

        //Using quantifiers
        String alphanumeric6 = "abcDeeeF12GHyabcDeeeirshiijkl99z";
        System.out.println(alphanumeric6.replaceAll("^abcDe{3}","7"));
        System.out.println(alphanumeric6.replaceAll("^abcDe+","8"));
        //below case, e character will be matched zero or more occurrences
        System.out.println(alphanumeric6.replaceAll("^abcDe*","V"));
        //matches any string that contains a sequence of x to y
        System.out.println(alphanumeric6.replaceAll("^abcDe{2,5}","YYY"));
        System.out.println(alphanumeric6.replaceAll("h+i*j","Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph about something. </p>");
        htmlText.append("<p>This is another paragraph about something else.</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary.</p>");
        String h2Pattern = "<h2>";
        Pattern pattern = Pattern.compile(h2Pattern,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()) {
            count ++;
            System.out.println("Ocurrence " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while(groupMatcher.find()) {
            System.out.println("Ocurrence: " + groupMatcher.group(1));
        }
    }
}


















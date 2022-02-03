package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest{
    public static void main(String args[]){
        String regexStr = ".*[a-z][0-9].";
        Pattern pattern = Pattern.compile(regexStr);

        String toMatch = "123456adfsdff2345730";
        Matcher matcher = pattern.matcher(toMatch);
        boolean matchFound = matcher.find();

        if(matchFound){ System.out.println("Found!");}  else {System.out.println("Not found!");} 
    } 
}
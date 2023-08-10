package com.java.dsa.logicalprogram;

import java.util.HashMap;
import java.util.Map;

public class StringConstructionCheck {
    public static void main(String[] args) {
        String source = "abcdefg";
        String target = "aegcdfb";
        
        boolean canConstruct = canConstructString(source, target);
        
        if (canConstruct) {
            System.out.println("The target string can be constructed from the source string.");
        } else {
            System.out.println("The target string cannot be constructed from the source string.");
        }
    }
    
    public static boolean canConstructString(String source, String target) {
        if (source.length() != target.length()) {
            return false;
        }
        
        Map<Character, Integer> charFrequency = new HashMap<>();
        
        for (char ch : source.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }
        
        for (char ch : target.toCharArray()) {
            if (!charFrequency.containsKey(ch) || charFrequency.get(ch) == 0) {
                return false;
            }
            charFrequency.put(ch, charFrequency.get(ch) - 1);
        }
        
        return true;
    }
}

/*
 * In this program, the canConstructString function takes two strings, source
 * and target, as input. It first checks if the lengths of the two strings are
 * the same. If not, it immediately returns false, since it's not possible to
 * construct one string from another if their lengths differ.
 * 
 * Next, it creates a charFrequency map to store the frequency of characters in
 * the source string. It iterates through the source string and populates the
 * map.
 * 
 * Then, it iterates through the target string. If a character is not present in
 * the charFrequency map or its frequency is zero, it means the character cannot
 * be used to construct the target string, so the function returns false.
 * 
 * If the loop completes without returning false, it means the target string can
 * be constructed from the source string, and the function returns true.
 */
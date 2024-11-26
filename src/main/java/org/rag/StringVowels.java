package org.rag;

public class StringVowels {

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("AV")); // false
        System.out.println(stringContainsVowels("HURRAY")); // false
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }
}

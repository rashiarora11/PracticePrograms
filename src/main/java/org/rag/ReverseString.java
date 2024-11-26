package org.rag;

public class ReverseString {

    public static void main(String[] args) {
        String string = "Rashi";
        StringBuilder reversedString = new StringBuilder();
        for (int i= string.length()-1;i>=0;i--) {
            reversedString.append(string.charAt(i));
        }
        System.out.println("Reversed String: " + reversedString);
    }

}
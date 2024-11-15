package org.rag;

//TimeComplexity = O(n) and Space Complexity = O(n)

public class PalindromeCheck {

    public static void main(String[] args) {
        PalindromeCheck pc = new PalindromeCheck();
        System.out.println("Number is palindrome: " + pc.isPalidrome(11211));
    }

    private boolean isPalidrome(int number) {
        if (number < 0) return false;

        /*int originalNumber = number;
        int reversedNumber = 0;

        while(number > 0) {
            reversedNumber = (reversedNumber*10) + (number%10);
            number = number/10;
        }

        return reversedNumber == originalNumber;*/

        String s = String.valueOf(number); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // We check whether the elements at the same distance from
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }
}
package com.internship;

public class PalindromeTest {
    public void checkForPalindrome (String str) {
        str = str.toLowerCase();
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(str);
        if(!reverseString(str)){
            shuffleString(str);
        }
        else{
            System.out.println("The word is palindrome");
        }

    }
    private boolean reverseString(String str){
        StringBuilder sb = new StringBuilder(str);
        String reversedString = sb.reverse().toString();
        if (reversedString.equals(str)){
            return true;
        }
        else {
            return false;
        }
    }

    private void shuffleString(String str){
        boolean palindromeExists = false;
        String newString;
        char[] shuffledArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                char replaceChar = shuffledArray[j];
                shuffledArray[j]= shuffledArray[i];
                shuffledArray[i]= replaceChar;
                newString = new String(shuffledArray);

                if(reverseString(newString)){
                    palindromeExists = true;
                }
            }
        }
        if (palindromeExists){
            System.out.println("There is a possible palindrome");
        }
    }
}

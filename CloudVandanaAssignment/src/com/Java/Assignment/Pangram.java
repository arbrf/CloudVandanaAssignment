package com.Java.Assignment;

public class Pangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        boolean isPangram = checkIfPangram(sentence.toLowerCase());
        System.out.println("Is the input a pangram? " + isPangram);
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] alphabetPresent = new boolean[26];
        int totalAlphabets = 26;

        for (char c : sentence.toCharArray()) {
            if ('a' <= c && c <= 'z') {
                if (!alphabetPresent[c - 'a']) {
                	
                    alphabetPresent[c - 'a'] = true;
                    totalAlphabets--;
                }
            }
        }

        return totalAlphabets == 0;
    }
}

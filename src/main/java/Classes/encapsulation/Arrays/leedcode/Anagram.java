package Classes.encapsulation.Arrays.leedcode;

import java.util.Arrays;

public class Anagram {
    /*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Input: s = "anagram", t = "nagaram" Output: true
Input: s = "rat", t = "car" Output: false
     */
    public static void main(String[] args) {
        System.out.println(isAnagram("dsv", ".gbhdj"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] right = s.toCharArray();
        Arrays.sort(right); // O log n
        char[] left = t.toCharArray();
        Arrays.sort(left);  // O log n
        for (int i = 0; i < left.length; i++) { // O n
            if (left[i] != right[i]) return false;
        }
        return true;
    }
}


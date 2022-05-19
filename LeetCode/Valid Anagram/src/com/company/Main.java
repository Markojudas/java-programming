package com.company;

import java.util.Arrays;

public class Main {

    public static boolean isAnagram1(String s, String t){

        if(s.length() != t.length()) return false;

        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1, str2);
    }

    //hash table method
    //here we declare an int array of size 26 (# of the alphabet) all elements are initialized to 0
    //we increment the occurrance of a letter on s and decrease it with t. since they should have the same amount
    //of the same letters all the elements of the array wlll remain 0. if it didn't it then it isn't an anagram
    public static boolean isAnagram2(String s, String t){
        if(s.length() != t.length()) return false;

        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }

        for (int count : counter){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "anagram", str3 = "rat";
        String str2 = "nagaram", str4 = "car";

        System.out.println(isAnagram1(str1, str2));
        System.out.println(isAnagram1(str3, str4));
        System.out.println(isAnagram2(str1, str2));
        System.out.println(isAnagram2(str3, str4));
    }
}

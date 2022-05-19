package com.company;

public class Main {

    public static char findTheDifference(String s, String t){

        int asciiS = 0, asciiT = 0;

        for(int i = 0; i < t.length(); i++){
            if(i < s.length()){
                asciiS += s.charAt(i);
            }
            asciiT += t.charAt(i);
        }

        return (char)(asciiT - asciiS);
    }

    public static void main(String[] args) {

        String s = "abcd";
        String t = "abcde";

        System.out.println(findTheDifference(s, t));
    }
}

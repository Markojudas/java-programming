package com.company;

public class Main {

    public static String tolower(String s){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                sb.append((char)(s.charAt(i) + 32));
            }
            else{
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
	// write your code here
        String s = "Hello";
        String s1 = "here";
        String s2 = "LOVELY";

        System.out.println(tolower(s));
        System.out.println(tolower(s1));
        System.out.println(tolower(s2));

    }
}

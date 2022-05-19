package com.company;

public class Main {

    public static boolean isPalindrome(String s){

        int i = 0, j = s.length() - 1;

        while (i < j){
            //ignoring non-alpha-numeric characters
            //moving the pointers accordingly until they cross each other
            while(j > i && !Character.isLetterOrDigit(s.charAt(j))) j--;
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;

            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        String str = "Race car!";
        String str1 = "121";
        String str2 = "122";

        System.out.println(isPalindrome(str));
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));

    }
}

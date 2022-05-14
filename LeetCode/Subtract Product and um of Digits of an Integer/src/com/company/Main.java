package com.company;

public class Main {

    public static int subtractProductAndSum(int n){

        int sum = 0;
        int prod = 1;

        String strInt = Integer.toString(n);

        for(int i = 0; i < strInt.length(); i++){
            sum += strInt.charAt(i) - '0';
            prod *= strInt.charAt(i) - '0';
        }

        return prod - sum;
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(subtractProductAndSum(234));
    }
}

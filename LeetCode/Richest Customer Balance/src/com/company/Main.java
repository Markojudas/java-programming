package com.company;

public class Main {

    public static int maximumWealth(int[][] accounts){
        int maxWealth = 0;

        for(int[] account : accounts){
            int sum = 0;
            for(int amount : account){
                sum += amount;
            }
            maxWealth = Math.max(maxWealth, sum);
        }

        return maxWealth;
    }
    public static void main(String[] args) {
	// write your code here
        int[][] accounts = {
            {1,2,3},
            {3,2,1}
        };

        int[][] accounts2 = {
                {1,5},
                {7,3},
                {3,5}
        };

        System.out.println(maximumWealth(accounts));
        System.out.println(maximumWealth(accounts2));

    }
}

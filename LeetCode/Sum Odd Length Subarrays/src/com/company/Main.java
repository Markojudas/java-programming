package com.company;

public class Main {

    public static int sumOddLengthSubarrays(int[] arr){
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int index = 1;
            int tempSum = 0;
            for(int j = i; j < arr.length; j++){
                tempSum += arr[j];
                if(index % 2 == 1){
                    sum += tempSum;
                }
                index++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,4,2,5,3};

        System.out.println(sumOddLengthSubarrays(arr)); //58
    }
}

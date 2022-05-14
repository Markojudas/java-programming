package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void minMaxSum(List<Integer> arr){

        long minVal = Integer.MAX_VALUE;
        long maxVal = 0;

        long totalSum = 0;
        long minSum, maxSum;


        for(int i = 0; i < arr.size(); i++){
            minVal = Math.min(minVal, arr.get(i));
            maxVal = Math.max(maxVal, arr.get(i));

            totalSum += arr.get(i);
        }

        minSum = totalSum - maxVal;
        maxSum = totalSum - minVal;

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {

	    List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        minMaxSum(arr);
    }
}

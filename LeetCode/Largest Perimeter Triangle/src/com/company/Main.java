package com.company;

import java.util.Arrays;

public class Main {

    public static int largestPerimeter(int[] nums){

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >=2; i--){
            if(nums[i] < nums[i-1] + nums[i-2]){
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }

    public static void main(String[] args) {
	// write your code here

        int[] nums = {3,2,3,7};

        System.out.println(largestPerimeter(nums));
    }
}

package com.company;

import java.util.Arrays;

public class Main {

    public static void moveZeroes(int[] nums){
        int index = 0;
        int count = 0;

        //move the non-zeros to the front of th array
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }else{
                count++;
            }
        }
        if (count > 0){
            for(int i = nums.length - count; i < nums.length; i++){
                nums[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));

    }
}

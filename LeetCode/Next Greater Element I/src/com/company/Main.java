package com.company;

import java.util.Arrays;

public class Main {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length];

        //find nums[i] == nums2[j]
        //find number next to nums2[j] that is greater than nums[i]
        //if none return -1

        for(int i = 0; i < nums1.length; i++){
            boolean elementFound = false;
            int j = 0;
            for(; j < nums2.length; j++){
                if(elementFound && nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    break;
                }
                if(nums2[j] == nums1[i]){
                    elementFound = true;
                }
            }
            if(j == nums2.length){
                res[i] = -1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {5,4,3,2,1};

        int[] res = nextGreaterElement(nums1, nums2);

        System.out.println(Arrays.toString(res)); //[-1,-1,-1,-1,-1]
    }
}

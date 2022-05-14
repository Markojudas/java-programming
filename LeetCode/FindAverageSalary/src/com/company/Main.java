package com.company;

public class Main {

    public static double average(int[] salary){
        double n = 0.0;

        int max = 0, min = Integer.MAX_VALUE;

        for (int j : salary) {
            max = Math.max(max, j);
            min = Math.min(min, j);

            n += j;
        }

        return (n - max - min)  / ((double)salary.length - 2.0);
    }

    public static void main(String[] args) {

        int[] arr = {6,7,5,4,1};
                    /*
                        1,4,5,6,7 = size 5

                        4+5+6 = 15

                        15/3 = 5.00

                     */
        System.out.println(average(arr));
    }
}

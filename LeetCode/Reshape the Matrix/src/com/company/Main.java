package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    // Using a queue
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int[][] res = new int[r][c];

        if(mat.length == 0 || r * c != mat.length * mat[0].length)
            return mat;

        //creating a LinkedList of type queue
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < mat.length; i++){
            //adding each element of the 2d array to the queue
            //one each column(j) at a type for each row(i)
            for (int j = 0; j < mat[0].length; j++){
                queue.add(mat[i][j]);
            }
        }

        //populatig the res 2d array in order. Since is a queue:
        //first in first out (FIFO)
        // i = rows
        //j = columns
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                res[i][j] = queue.remove();
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1,2},
                {3,4}
        };

        int r1 = 1, c1 = 4;
        int r2 = 2, c2 = 4;

        System.out.println(Arrays.deepToString(matrixReshape(mat, r1, c1)));
        System.out.println(Arrays.deepToString(matrixReshape(mat, r2, c2))); //no change since the rows and columns don't equal the amount of elements


    }
}

package com.company;

public class Main {

    public static int diagonalSum(int[][] mat){
        int sum = 0;

        int j = mat[0].length - 1;

        for(int i = 0; i < mat.length; i++){
            if(i == j){
                sum += mat[i][i];
            }
            else{
                sum += mat[i][i] + mat[i][j];
            }
            j--;
        }


        return sum;
    }

    public static void main(String[] args) {
	    int[][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(diagonalSum(mat));

    }
}

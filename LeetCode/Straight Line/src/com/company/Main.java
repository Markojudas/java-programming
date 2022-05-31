package com.company;

public class Main {

    public static boolean checkStraightLine(int[][] coordinates){
        //getting coordinates of the first two points
        int x1 = coordinates[0][0],
            x2 = coordinates[1][0],
            y1 = coordinates[0][1],
            y2 = coordinates[1][1];

        //general equation of a line = ax + by = c
        //a = (y2 - y1)
        //b = (x1 - x2)

        int a = (y2 - y1);
        int b = (x1 - x2);
        int c = a * x1 + b * y1;

        //starting with the third coordinate
        for(int i = 2; i < coordinates.length; i++){
            int findC = a * coordinates[i][0] + b * coordinates[i][1];
            if(findC != c) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] coordinates = {
                {1,2}, //[0][0,1]
                {2,3}, //[1][0,1]
                {3,4}, //[2][0,1]
                {4,5}, //[3][0,1]
                {5,6}, //[4][0,1]
                {6,7}  //[5][0,1]
        };
        /*
            a = [1][1] - [0][1] = 2 - 3  = -1
            b = [0][0] - [1][0] = 1 - 2 = -1
            c = -1 * 1 + -1 * 2 = -1 - 2 = -3

            -1 * 6 + -1 * 7 = -6 - 7 = -13
         */


        int[][] coordinates2 = {
                {1,1},
                {2,2},
                {3,4},
                {4,5},
                {5,6},
                {7,7}
        };

        System.out.println(checkStraightLine(coordinates)); //true
        System.out.println(checkStraightLine(coordinates2)); //false

    }
}

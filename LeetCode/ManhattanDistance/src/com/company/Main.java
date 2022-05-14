package com.company;

public class Main {

    public static int nearestValidPoint(int x, int y, int[][] points){

        int distant = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < points.length; i++){
            if(x == points[i][0] || y == points[i][1]){
                int mandistant = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                if(distant > mandistant){
                    distant = mandistant;
                    index = i;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {

        int[][] points = {{1,2}, {3,1}, {2,4}, {2,3}, {4,4}};

        System.out.println(nearestValidPoint(3,4,points));
    }
}

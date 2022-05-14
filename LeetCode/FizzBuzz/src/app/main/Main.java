package app.main;

import java.util.ArrayList;

public class Main {

    public static ArrayList<String> fizzbuz(int n){
        ArrayList<String> res = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                res.add("FizBuzz");
            }
            else if (i % 3 == 0){
                res.add("Fizz");
            }
            else if (i % 5 == 0){
                res.add("Buzz");
            }
            else{
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        ArrayList<String> test = fizzbuz(15);

        System.out.println(test);
    }
}

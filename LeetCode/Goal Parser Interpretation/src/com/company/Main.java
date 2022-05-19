package com.company;

public class Main {

    public static String interpreter(String command){

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < command.length(); i++){
            if (command.charAt(i) == 'G'){
                sb.append('G');
            }
            else if (command.charAt(i) == '('){
                if(command.charAt(i + 1) == ')'){
                    sb.append('o');
                    i++;
                }
                else{
                    sb.append("al");
                    i += 3;
                }
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        String command = "G()(al)";
        String command2 = "G()()()()(al)";
        String command3 = "(al)G(al)()()G";

        System.out.println(interpreter(command)); //Goal
        System.out.println(interpreter(command2)); //Gooooal
        System.out.println(interpreter(command3)); //alGalooG

    }
}

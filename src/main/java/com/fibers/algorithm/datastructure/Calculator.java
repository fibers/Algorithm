package com.fibers.algorithm.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TODO: Need fix
public class Calculator {

    public static int eval(String s) {
        Queue<String> output = shuntingYard(s);
        Stack<String> temp = new Stack<>();
        int result = 0;
        String token = null;
        while ((token = output.poll()) != null) {
            switch (token) {
                case "+":
                    result += (Integer.valueOf(temp.pop()) + Integer.valueOf(temp.pop()) );
                default:
                    temp.add(token);

            }
        }

        return result;
    }

    public static Queue<String> shuntingYard(String s) {
    
        Queue<String> output = new LinkedList<>();


        return output;
    }

    public String nextToken(char[] c, int index) {
        return null;
    }

}

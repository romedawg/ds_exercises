package com.rome.courseraDS.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                Bracket b = new Bracket(next, position);
                opening_brackets_stack.push(b);
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                Bracket b = new Bracket(next, position);
                opening_brackets_stack.push(b);
            }

        }

        // Printing answer, write your code here
        if (opening_brackets_stack.size() == 1){
            System.out.println(opening_brackets_stack.size());
            return;
        }
        for (int i = 0; i < opening_brackets_stack.size(); i=i+2) {
            Bracket b = opening_brackets_stack.pop();
            while (!opening_brackets_stack.isEmpty()){
                Bracket b2 = opening_brackets_stack.pop();
                if (!b2.Match(b.type)){
                    System.out.println(b.position+1);
                    return;
                }
                System.out.println("pass");
            }
            System.out.println("Success");
        }
    }
}

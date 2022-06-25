package com.rome.courseraDS.week1;

public class Bracket2 {

    public Bracket2(char type, int position) {
        this.type = type;
        this.position = position;
    }

    public boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    public char type;
    public int position;
}

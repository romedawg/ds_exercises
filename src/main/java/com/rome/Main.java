package com.rome;

import com.rome.exercises.TextManipulation;
import com.rome.exercises.utils.Utils;

public class Main {

    public static void main(String[] args) {

        TextManipulation text = new TextManipulation();
        Utils userInput = new Utils();

        System.out.println(text.removePunctuations(userInput.InputText("pass in string")));

    }
}

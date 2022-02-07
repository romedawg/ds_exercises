package com.rome.exercises.utils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public Utils() {
    }

    // inputType: What type of input are we looking for(filepath, text, etc..)?
    public String InputText(String inputType){
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("input string: " + inputType);

        String input = scannerObject.nextLine();
        return input;
    }

}

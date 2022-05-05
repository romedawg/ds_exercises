package com.rome;



import com.rome.exercises.numbers.GooseIsland;
import com.rome.exercises.numbers.Numbers;

import java.io.*;
import java.util.Arrays;


public class Main {



    public static void main(String[] args) throws  FileNotFoundException {

//        TextManipulation text = new TextManipulation();
//        Utils userInput = new Utils();
//
//        System.out.println(text.removePunctuations(userInput.InputText("pass in string")));


//        GooseIsland numbers = new Numbers.s;
        // [3,1,2] => [3,1,2]
        // [1,2,3] => [3,1,2]
        // [2,1,3] => [3,1,2]
        // [1,1,1,2,2,2,3,3,3] => [3,3,3,1,1,1,2,2,2]
        // [1,2,1,2,1,2,3] => [3,1,1,1,2,2,2]
        int[] threeOneTwo1 = {1,3,1,2,3};
        int[] threeOneTwo2 = {1,2,3};
        int[] threeOneTwo3 = {2,1,3};
        int[] threeOneTwo4 = {1,1,1,2,2,2,3,3,3};
        int[] threeOneTwo5 = {1,2,1,2,1,2,3};

//        System.out.println("pre sort: 1 " + Arrays.toString(threeOneTwo1));
//        int[] result1 = GooseIsland.sortIt(threeOneTwo1);
//        System.out.println("post sort: 1 " + Arrays.toString(result1));
//
//        System.out.println("pre sort: 2 " + Arrays.toString(threeOneTwo2));
//        int[] result2 = GooseIsland.sortIt(threeOneTwo2);
//        System.out.println("post sort: 2 " + Arrays.toString(result2));
//
//        System.out.println("pre sort: 3 " + Arrays.toString(threeOneTwo3));
//        int[] result3 = GooseIsland.sortIt(threeOneTwo3);
//        System.out.println("post sort: 3 " + Arrays.toString(result3));

        System.out.println("pre sort: 4 " + Arrays.toString(threeOneTwo4));
        int[] result4 = GooseIsland.sortIt(threeOneTwo4);
        System.out.println("post sort: 4 " + Arrays.toString(result4));

        System.out.println("pre sort: 5 " + Arrays.toString(threeOneTwo5));
        int[] result5 = GooseIsland.sortIt(threeOneTwo5);
        System.out.println("post sort: 5 " + Arrays.toString(result5) );
        System.out.println("type: " + result5.getClass());

    }
}

package com.rome.exercises;

import java.util.Arrays;
import java.util.Scanner;

/*
# EXAMPLE USAGE.
    Text tt = new Text();

    Utils userInput = new Utils();
    # reverseString - Create a character array from string and iterate over it from end to start, return stringBuilder
    System.out.println(tt.ReverseString(userInput.InputText("pass in string to reverse")));
    # countVowels
    System.out.println(text.countVowels(userInput.InputText("pass in string")));
 */
public class TextManipulation {

    public TextManipulation() {
    }

    public Integer countVowels(String word){
        Integer vowelCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] wordArray = word.toCharArray();
        for (int i = 0; i < wordArray.length; i++) {
            char x = wordArray[i];
            if ( matchCharacters(x, vowels) ){
                vowelCount++;
            }
        }

        return vowelCount;
    }

    public String ReverseString(String input){
        char[] charArray = input.toCharArray();
        char[] reversedArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            if (i == 0)  {
                reversedArray[i] = charArray[charArray.length-1];
            }else if (i==(charArray.length-1)){
                reversedArray[i] = charArray[0];
            }else{
                reversedArray[i] = charArray[charArray.length-(i+1)];
            }

        }
        StringBuilder reversedString = new StringBuilder();
        reversedString.append(reversedArray);
        System.out.println("word: " + reversedString);

        return reversedString.toString();
    }

    private boolean matchCharacters(char character, char[] StringArray){

        for (int i = 0; i < StringArray.length; i++) {
            if (character == StringArray[i]){
                return true;
            }
        }

        return false;
    }
}


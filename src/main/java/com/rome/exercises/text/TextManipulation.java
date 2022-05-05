package com.rome.exercises.text;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
            if ( matchChars(x, vowels) ){
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

    // TODO
    /*
    8 A common punishment for school children is to write out a sentence multiple
    times. Write a Java stand-alone program that will write out the following sentence one hundred times: “I will never spam my friends again.” Your program
    should number each of the sentences and it should make eight different random looking typos.
     */
    public void printSentences(){
        Integer count;
        String line = "I will never spam my friends again.";
        System.out.println();
    }

    public String removePunctuations(String word){

        String[] punctuations = {"!", String.valueOf('"'),",", "]", "[", ":", "{", "}", "'","?", "'"};
        String[] wordArray = word.split("");
        LinkedList<String> wordList = new LinkedList<String>(Arrays.asList(wordArray));
        System.out.println("wordList first item: " + wordList.get(0));
        System.out.println(wordList.size());
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < punctuations.length; j++) {
                if (wordList.get(i).equals(punctuations[j])) {
                    wordList.remove(wordList.get(i));
                    // As words get removed, string items in the list shift, reduce the int to not miss them!
                    if (!(i ==0)) {
                        i--;
                    }
                }
            }
        }

        return String.join("",wordList);

    }

    private boolean matchChars(char character, char[] charArray){

        for (int i = 0; i < charArray.length; i++) {
            if (character == charArray[i]){
                return true;
            }
        }
        return false;
    }

}


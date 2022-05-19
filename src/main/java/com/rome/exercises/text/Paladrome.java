package com.rome.exercises.text;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

/* Paladrome
 *  * aaa
 *  * abba
 *  * A Man, A Plan, A Canal: Panama!
 *  * Jelenovi pivo nelej!

 // Testing in Main
 Boolean s = Paladrome.isPaladrome("A Man, A Plan, A Canal: Panama!");
 System.out.println(s);

 */

public class Paladrome {

    // step 1 remove any spacing,punctuations, etc..
    // create second array of characters in reverse
    // compare the two strings

    public static Boolean isPaladrome(String input){

        String cleanInput = removePunctuations(input.toLowerCase());

        char[] chars = cleanInput.toCharArray();
        char[] charsReversed = new char[chars.length];
        for (int i = chars.length; (i <= chars.length && i != 0); i--) {
            charsReversed[i-1] = chars[chars.length-i];
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charsReversed.length; i++) {
            stringBuilder.append(charsReversed[i]);

        }

        if (cleanInput.equals(stringBuilder.toString())){
            return true;
        }
        return false;

    }

    public static String removePunctuations(String word){

        String[] punctuations = {"!", String.valueOf('"'),",", "]", "[", ":", "{", "}", "'","?", "'", " "};
        String[] wordArray = word.split("");
        LinkedList<String> wordList = new LinkedList<String>(Arrays.asList(wordArray));
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < punctuations.length; j++) {
                if (wordList.get(i).equals(punctuations[j]) || (wordList.get(i).equals(" "))) {
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
}

package com.rome.exercises;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
# Usage
        Bigrams ramarooski = new Bigrams();

        Utils userInput = new Utils();
        ramarooski.ReadFile(userInput.InputText("pass in a filename"));
 */
public class Bigrams {

    public Bigrams() {}


    public String ReadFile(String fileName){
        String fileList = new String();

        Path path = Paths.get(fileName);
        if (Files.notExists(path)){
            System.out.println("File path does not exist");
        }

        try {
            fileList = new String(Files.readAllBytes(path));
        } catch (Exception e){
            System.out.println("failed to read file: " + fileName);
            e.printStackTrace();
        }
        String[] contentString = fileList.trim().split(" ");
        System.out.println("index length: "+ contentString.length);
        HashMap<String, Integer> bigramMap = new HashMap<>();
        for (int i = 0; i < contentString.length;i++)  {
            if ((i != contentString.length-1)){
                String bigram = String.format(contentString[i] + " " +contentString[i+1]);
                if ((! bigram.isEmpty()) && (bigramMap.containsKey(bigram))){
                    int v = bigramMap.get(bigram);
                    bigramMap.put(bigram, (v+1));
                }else{
                    bigramMap.put(bigram, 1);
                }
            }
        }

        System.out.println(Arrays.toString(contentString));
        System.out.println(bigramMap);
        return fileList;
    }

}

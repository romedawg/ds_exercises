package com.rome.exercises.sorting;

public class BubbleSort {

    //    [1,7,4,8,3]

    /***
     *
     BubbleSort bs = new BubbleSort();
     int[] testArray = {2,6,4,9,5,8,10};
     int[] sortedArray = bs.SortNumbers(testArray);

     // presort output
     for (int i = 0; i < testArray.length; i++) {
     System.out.println("pre sort:");
     System.out.println(i + ":" + testArray[i]);
     }

     // post sort output
     for (int i = 0; i < sortedArray.length; i++) {
     System.out.println("post sort:");
     System.out.println(i + ":" + sortedArray[i]);
     }

     {2,6,4,9,5,8,10};
     {2,4,5,6,8,9,10};
     */
    public int[] SortNumbers(int[] sort){

        for (int i = 0; i < (sort.length-1); i++) {
            int firstNum = sort[i];
            int secondNum = sort[i+1];
            if (sort[i] > sort[i+1]) {
                sort[i] = secondNum;
                sort[i+1] = firstNum;
                i = 0;
            }
        }
        return sort;

    }
}

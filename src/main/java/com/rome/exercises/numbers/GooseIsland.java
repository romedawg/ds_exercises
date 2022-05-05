package com.rome.exercises.numbers;

import java.util.Arrays;

public class GooseIsland {

    // The integer array passed in with be a combination of the numbers 3, 1, and 2, in any order.
    // You may assume valid input. That is, there will be no other numbers present in the numbers array, although
    // numbers may be duplicated.
    //
    // Your task is to sort the numbers in the order of 3s first, then 1s, then 2s. Like the Beer, 312.
    // Some examples inputs and the expected sort order after sorting:
    //
    // [3,1,2] => [3,1,2]
    // [1,2,3] => [3,1,2]
    // [2,1,3] => [3,1,2]
    // [1,1,1,2,2,2,3,3,3] => [3,3,3,1,1,1,2,2,2]
    // [1,2,1,2,1,2,3] => [3,1,1,1,2,2,2]
    //
    // Your test cases must pass, and you must sort the array in place.
    public static int[] sortIt(int[] arr) {

        for (int n = 0; n < arr.length; n++){
//            System.out.println("iter num: "+n + " index array num: " + arr[n]);
            int val = arr[n];
            if (arr[n] == 3){
                if (n == 0 || arr[n-1] == 3){
                    continue;
                }else{
//                    System.out.println("shifting things around, pre-adjustment: " + Arrays.toString(arr));
//                    System.out.println("one index behind " + (n-1) + " value is: " + arr[n-1] );
//                    System.out.println("current index " + n + " value is: " + arr[n]);
                    arr[n] = arr[n-1];
                    arr[n-1] = val;
//                    System.out.println("shifting things around, post-adjustment: " + Arrays.toString(arr));
                    n=0;
                }
            }else if (arr[n] == 2){
//                if (arr[n+1] == 2) {
                if (n == (arr.length-1) || arr[n+1] == 2) {
                    continue;
                }else {
//                    System.out.println("shifting things around, pre-adjustment: " + Arrays.toString(arr));
//                    System.out.println("one index ahead " + (n+1) + " value is: " + arr[n+1]);
//                    System.out.println("current index " + n + " value is: " + arr[n]);
                    arr[n] = arr[n+1];
                    arr[n+1] = val;
//                    System.out.println("shifting things around, post-adjustment: " + Arrays.toString(arr));
                    n=0;
                }
            }
        }

        return arr;
    }

}
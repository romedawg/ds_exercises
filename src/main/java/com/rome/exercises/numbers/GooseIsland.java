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

/* Testing in Main

    int[] threeOneTwo1 = {1,3,1,2,3};
    int[] threeOneTwo2 = {1,2,3};
    int[] threeOneTwo3 = {2,1,3};
    int[] threeOneTwo4 = {1,1,1,2,2,2,3,3,3};
    int[] threeOneTwo5 = {1,2,1,2,1,2,3};

        System.out.println("pre sort: 1 " + Arrays.toString(threeOneTwo1));
    int[] result1 = GooseIsland.sortIt(threeOneTwo1);
        System.out.println("post sort: 1 " + Arrays.toString(result1));

        System.out.println("pre sort: 2 " + Arrays.toString(threeOneTwo2));
    int[] result2 = GooseIsland.sortIt(threeOneTwo2);
        System.out.println("post sort: 2 " + Arrays.toString(result2));

        System.out.println("pre sort: 3 " + Arrays.toString(threeOneTwo3));
    int[] result3 = GooseIsland.sortIt(threeOneTwo3);
        System.out.println("post sort: 3 " + Arrays.toString(result3));

        System.out.println("pre sort: 4 " + Arrays.toString(threeOneTwo4));
    int[] result4 = GooseIsland.sortIt(threeOneTwo4);
        System.out.println("post sort: 4 " + Arrays.toString(result4));

        System.out.println("pre sort: 5 " + Arrays.toString(threeOneTwo5));
    int[] result5 = GooseIsland.sortIt(threeOneTwo5);
        System.out.println("post sort: 5 " + Arrays.toString(result5) );
        System.out.println("type: " + result5.getClass());

 */
    public static int[] sortIt(int[] arr) {


        for (int n = 0; n < arr.length; n++) {
            int val = arr[n];
            if (arr[n] == 3) {
                if (n == 0 || arr[n - 1] == 3) {
                    continue;
                } else {
                    arr[n] = arr[n - 1];
                    arr[n - 1] = val;
                    n = 0;
                }
            } else if (arr[n] == 2) {
                if (n == (arr.length - 1) || arr[n + 1] == 2) {
                    continue;
                } else {
                    arr[n] = arr[n + 1];
                    arr[n + 1] = val;
                    n = 0;
                }
            }
        }

        return arr;
    }



}
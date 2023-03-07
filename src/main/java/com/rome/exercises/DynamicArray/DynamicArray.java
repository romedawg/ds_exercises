package com.rome.exercises.DynamicArray;

/***
 * Dynamic array is an array who's index size is increased dynamically.
 * We initialize an empty Array pointer, and when that array's index size  maxes out, we create a new array
 * and update the pointer to that new array.
 *
 * void push(int data): This function takes one element and inserts it at the last. Amortized time complexity is O(1).
 * void push(int data, int index): It inserts data at the specified index. Time complexity is O(1).
 * int get(int index): It is used to get the element at the specified index. Time complexity is O(1).
 * void pop(): It deletes the last element. Time complexity is O(1).
 * int size(): It returns the size of the ArrayList i.e, number of elements in the ArrayList. Time complexity is O(1).
 * int getcapacity(): It returns the capacity of the ArrayList. Time complexity is O(1).
 * void print(): It is used to print array elements. Time complexity is O(N), where N is the size of the ArrayList.
 */

public class DynamicArray {

    private String[] arr;
    private int size;

    public DynamicArray(){
        arr = new String[0];
        size = 0;
    }

    public DynamicArray(String item){
        arr = new String[2];
        arr[0] = item;
        size = 1;
    }

    public String Get(int indy){
        if (indy < arr.length) {
            return arr[indy];
        } else {
            return null;
        }
    }

    public int Size(){
        return size;
    }

    public void Add(String item){
        int counter = 0;
        for (int i=0;i < arr.length; i++){
            if (arr[i] != null){
                counter++;
            }
        }

        // Create a new array, we're maxed out here
        if (arr.length == counter){
            String[] replacementArr;
            if (arr.length == 0){
                replacementArr = new String[1];
            }else {
                replacementArr = new String[(arr.length * 2)];
            }
            for (int i=0;i < arr.length;i++){
                replacementArr[i] = arr[i];
            }
            arr = replacementArr;
            appendItem(item, counter);
        } else {
            appendItem(item, counter);
        }
    }

    private void appendItem(String item, int index){
        arr[index]=item;
        size++;
    }

    public void pop(){
        arr[-1] = null;
        size--;
    }

    public int getCapacity(){
        return arr.length;
    }

}

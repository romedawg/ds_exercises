package com.rome;



import com.rome.courseraDS.week1.Bracket2;

import java.io.*;
import java.util.Stack;


public class Main {


    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();

        Stack<Bracket2> opening_brackets_stack = new Stack<Bracket2>();
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                // Process opening bracket, write your code here
                Bracket2 b = new Bracket2(next, position);
                b.type = next;
                opening_brackets_stack.push(b);
            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                Bracket2 b = new Bracket2(next, position);
                b.type = next;
                opening_brackets_stack.push(b);
            }

        }

        // Printing answer, write your code here
        if (opening_brackets_stack.size() == 1){
            System.out.println(opening_brackets_stack.size());
            return;
        }
        for (int i = 0; i < opening_brackets_stack.size(); i=i+2) {
            Bracket2 b = opening_brackets_stack.pop();
            while (!opening_brackets_stack.isEmpty()){
                Bracket2 b2 = opening_brackets_stack.pop();
                System.out.println("bracket " + b.type);
                System.out.println("bracket " + b2.type);
                if (!b2.Match(b.type)){
                    System.out.println(b.position+1);
                    return;
                }
            }
            System.out.println("success");
        }
    }
}

//    public static void main(String[] args) throws  FileNotFoundException {

//        TextManipulation text = new TextManipulation();
//        Utils userInput = new Utils();
//
//        System.out.println(text.removePunctuations(userInput.InputText("pass in string")));



        /*
         size() - returns number of data elements in list
         empty() - bool returns true if empty
         value_at(index) - returns the value of the nth item (starting at 0 for first)
         push_front(value) - adds an item to the front of the list
         pop_front() - remove front item and return its value
         push_back(value) - adds an item at the end
         pop_back() - removes end item and returns its value
         front() - get value of front item
         back() - get value of end item
         insert(index, value) - insert value at index, so current item at that index is pointed to by new item at index
         erase(index) - removes node at given index
         value_n_from_end(n) - returns the value of the node at nth position from the end of the list
         reverse() - reverses the list
         remove_value(value) - removes the first item in the list with this value
         */
        // Testing Linked List
        // Uncomment after this

//        String[] myArray = new String[]{"one"};
//        LinkedList linkedList = new LinkedList();
//
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Empty: " + linkedList.isEmpty());
//
//        // [1,2,3] - by the end
//        linkedList.append(1);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        linkedList.append(2);
//        System.out.println("Empty: " + linkedList.isEmpty());
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(1));
//        linkedList.append(3);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(2));
//
//        // PopBack - [1,2] - by the end
//        System.out.println("popping items off list value should be 3");
//        System.out.println(linkedList.popBack());
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//
//        // front/backup items - [1,2] - by the end
//        System.out.println("get front item val");
//        System.out.println("front val: " + linkedList.front());
//        System.out.println("get back item val");
//        System.out.println("back val: " + linkedList.back());
//
//        // PopFront - should be 2 - [2] - by the end
//        System.out.println("popping items off list from front");
//        System.out.println(linkedList.popFront());
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//
//        // PushFront - should be [3,2]
//        System.out.println("pushing items to the front");
//        linkedList.pushFront(3);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//
//        // PushFront - should be [3,2,6] by end
//        System.out.println("pushing items to the front");
//        linkedList.pushBack(6);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//        System.out.println("Value: " + linkedList.valueAt(2));
//
//        // removeValue - should remove first time from list, size should be 2, value should be 2
//        // PushFront - should be [3,2,6] coming in, [3,6,5,4] coming out
//        System.out.println("checking size/val before is " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//        System.out.println("Value: " + linkedList.valueAt(2));
//        linkedList.append(5);
//        linkedList.append(4);
//        System.out.println("checking size/vals after apends " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//        System.out.println("Value: " + linkedList.valueAt(2));
//        System.out.println("Value: " + linkedList.valueAt(3));
//        System.out.println("Value: " + linkedList.valueAt(4));
//        System.out.println("removing an item to the front, size before is " + linkedList.Size());
//        linkedList.erase(1);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//        System.out.println("Value: " + linkedList.valueAt(2));
//        System.out.println("Value: " + linkedList.valueAt(3));
//
//        // erase_value - removes the first item in the list with this value
//        // before [3,6,5,4] coming in - [3,6,4] coming out
//        System.out.println("removing an item to the front, size before is " + linkedList.Size());
//        linkedList.removeValue(5);
//        System.out.println("Size: " + linkedList.Size());
//        System.out.println("Value: " + linkedList.valueAt(0));
//        System.out.println("Value: " + linkedList.valueAt(1));
//        System.out.println("Value: " + linkedList.valueAt(2));

//    }
//}

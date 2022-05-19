package com.rome.exercises.LinkedList;

/*
       DONE - size() - returns number of data elements in list
       DONE - size() - returns number of data elements in list
       DONE - empty() - bool returns true if empty
       DONE - value_at(index) - returns the value of the nth item (starting at 0 for first)
       DONE - push_front(value) - adds an item to the front of the list
       DONE - pop_front() - remove front item and return its value
       DONE - push_back(value) - adds an item at the end
       DONE - pop_back() - removes end item and returns its value
       DONE - front() - get value of front item
       DONE - back() - get value of end item
   insert(index, value) - insert value at index, so current item at that index is pointed to by new item at index
       DONE - erase(index) - removes node at given index
   value_n_from_end(n) - returns the value of the node at nth position from the end of the list
   reverse() - reverses the list
   DONE - remove_value(value) - removes the first item in the list with this value
   */
public class LinkedList {

    Node head;
    static class Node{
        int value;

        Node next;
        Node(int d){
            value = d;
            next = null;
        }
    }

    public Node[] list = new Node[]{};

    public LinkedList(int item){
        Node node = new Node(item);
        append(item);
    }

    public LinkedList(){
    }

    public int Size(){
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            size++;
        }
        return size;
    }

    public boolean isEmpty(){
        return list.length == 0;
    }

    public Node[] append(int nodeValue){
        Node newNode = new Node(nodeValue);

        if (list.length == 0) {
            list = new Node[]{newNode};
            head = newNode;
        }else{
            Node[] listy = new Node[list.length+1];
            for (int i = 0; i <= list.length; i++) {
                if (i == list.length){
                    listy[list.length] = newNode;
                    listy[listy.length-1].next = newNode;
                }else{
                    listy[i] = list[i];
                }
            }
            list = listy;
        }
        return list;
    }

    public int valueAt(int index){
        if (index >= list.length){
            return 0;
        }
        return list[index].value;
    }

    public int popBack(){
        int val = list[list.length-1].value;
        Node[] listy = new Node[list.length-1];
        for (int i = 0; i < list.length-1; i++) {
            listy[i] = list[i];
        }
        list = listy;

        return val;
    }

    public int popFront(){
        int val = list[0].value;
        Node[] listy = new Node[list.length-1];
        for (int i = 0; i < list.length-1; i++) {
            listy[i] = list[i+1];
        }
        head = listy[0];
        list = listy;
        return val;
    }

    public void pushFront(int nodeValue) {
        Node newNode = new Node(nodeValue);
        Node[] listy = new Node[list.length+1];
        if (list.length == 0) {
            list = new Node[]{newNode};
            head = newNode;
        } else {
            for (int i = 0; i < list.length; i++) {
                listy[i+1] = list[i];
            }
            newNode.next = listy[1];
            listy[0] = newNode;
            head = newNode;
        }
        list = listy;
    }

    // adds an item at the end
    public void pushBack(int nodeValue){
        Node newNode = new Node(nodeValue);
        Node[] listy = new Node[list.length+1];
        if (list.length == 0) {
            list = new Node[]{newNode};
            head = newNode;
        } else {
            for (int i = 0; i < list.length; i++) {
                listy[i] = list[i];
            }
            newNode.next = listy[1];
            listy[list.length] = newNode;
            head = newNode;
        }
        list = listy;
    }

    // removes the first item in the list with this value
    public void removeValue(){
        Node[] listy = new Node[list.length-1];
        for (int i = 0; i < list.length-1; i++) {
            listy[i] = list[i+1];
        }
        head = listy[0];
        list = listy;
    }

    //  erase(index) - removes node at given index
    public void erase(int index){
        Node[] listy = new Node[list.length-1];
        int index_counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (i != index){
                listy[index_counter] = list[i];
                index_counter++;
            }
        }
        if (index == 0){
            head = listy[0];
        }
        list = listy;
    }

    // remove_value(value) - removes the first item in the list with this value
    public void removeValue(int value){
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if (value == list[i].value){
                index = i;
                break;
            }
        }
        erase(index);
    }

    public int front(){
        return list[0].value;
    }

    public int back(){
        return list[list.length-1].value;
    }

}

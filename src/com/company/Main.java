package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = list.insertAtTheEnd(list, 1);
        list = list.insertAtTheEnd(list, 2);
        list = list.insertAtTheEnd(list, 3);
        list = list.insertAtTheEnd(list, 4);
        list = list.insertAtTheEnd(list, 5);
        list = list.insertAtTheEnd(list, 6);
        list = list.insertAtTheEnd(list, 7);
        list = list.insertAtTheEnd(list, 8);

        // Print the LinkedList
        list.printList();

        list = list.insertFromPosition(list, 13, 0);
        list.printList();

        list = list.deleteFromEnd(list);
        list.printList();

        list = list.deleteByKey(list, 4);
        list.printList();

    }
}


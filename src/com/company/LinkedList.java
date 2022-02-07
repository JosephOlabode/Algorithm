package com.company;

public class LinkedList {
    Node head;

    public LinkedList insertAtTheEnd(LinkedList list, int data) {
        if(list.head == null) {
            Node newNode = new Node(data);
            list.head = newNode;
        } else {
            Node lastNode = list.head;
            while(lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }

            lastNode.nextNode = new Node(data);
        }

        return list;
    }
    public LinkedList insertFromPosition(LinkedList list, int data, int position) {
        int index = 0;
        Node currentNode = list.head;
        Node previousNode = null;

        if(currentNode == null) {
            list.head = new Node(data);;
            return list;
        }

        if(position == index) {
            Node newNode = new Node(data);
            previousNode = list.head;
            list.head = newNode;
            newNode.nextNode = previousNode;
            return list;
        }

        while(currentNode != null && index != position) {
            index++;
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if(currentNode == null) {
            System.out.println("Node not found!");
        } else {
            Node newNode = new Node(data);
            previousNode.nextNode = newNode;
            newNode.nextNode = currentNode;
        }
        return list;
    }

    public LinkedList deleteFromEnd(LinkedList list) {
        Node currentNode = list.head;
        Node previousNode = null;

        if(currentNode == null) {
            System.out.println("List is empty");
        } else if (currentNode.nextNode == null) {
            list.head = null;
        } else {
            while(currentNode.nextNode != null) {
                previousNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            previousNode.nextNode = null;
        }
        return list;
    }

    public LinkedList deleteByKey(LinkedList list, int key) {
        Node currentNode = list.head;
        Node previousNode = null;
        if(currentNode == null) {
            System.out.println("List is empty");
        } else if(currentNode.nextNode == null && currentNode.data == key){
            list.head = null;
        } else if(currentNode.nextNode != null && currentNode.data == key){
            list.head = currentNode.nextNode;
        }
        else {
            while(currentNode.nextNode != null && currentNode.data != key) {
                previousNode = currentNode;
                currentNode = currentNode.nextNode;
            }
            if(currentNode.nextNode == null && currentNode.data != key)
                System.out.println("Node not found");
            else
                previousNode.nextNode = currentNode.nextNode;
        }
        return list;
    }

    public void printList() {
        Node currentNode = head;

        while(currentNode != null) {
            System.out.print("[ " + currentNode.data + " | " + currentNode.nextNode + " ]-->");
            currentNode = currentNode.nextNode;
        }
        System.out.println();
    }
}

class Node {
    int data;
    Node nextNode = null;

    Node(int data) {
        this.data = data;
    }
}

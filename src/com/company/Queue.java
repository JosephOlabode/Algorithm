package com.company;

public class Queue {
    private int[] queue;
    private int front = 0;
    private int rear = 0;

    Queue() {
        this.queue = new int[10];
    }
    Queue(int sizeOfQueue) {
        this.queue = new int[sizeOfQueue];
    }

    public void enqueue(int value) {
        if(this.rear >= this.queue.length) {
            System.out.println("Queue is full cannot add " + value);
            return;
        }
        this.queue[rear] = value;
        this.rear++;
    }

    public int dequeue() {
        if(this.front >= this.rear) {
            System.out.println("Queue is empty nothing to remove");
            return -1;
        }
        int result = this.queue[this.front];
        this.front++;
        return result;
    }

    public int peek() {
        if(this.front >= this.rear) {
            System.out.println("Queue is empty no peek element");
            return -1;
        }
        return this.queue[this.front];
    }

    public void printQueue() {
        if(this.front >= this.rear) {
            System.out.println("Queue is empty nothing to print");
            return;
        }
        for(int i = this.front; i < this.rear; i++) {
            System.out.print("[ " + this.queue[i] + " ]" + "  ");
        }
        System.out.println();
    }

}

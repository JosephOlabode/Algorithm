package com.company;

public class CircularQueue {
    private int[] circularQueue;
    private int front = 0;
    private int rear = 0;

    CircularQueue() {
        this.circularQueue = new int[5];
    }
    CircularQueue(int sizeOfQueue) {
        this.circularQueue = new int[sizeOfQueue];
    }

    public void enqueue(int value) {
        this.rear = (this.rear + 1) %  this.circularQueue.length;
        if(this.front == this.rear) {
            System.out.println("Queue is full");
            return;
        }
        this.circularQueue[this.rear] = value;
    }

    public int dequeue() {
        if(this.front == this.rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        this.front = (this.front + 1) % this.circularQueue.length;
        return this.circularQueue[this.front];
    }

    public void printQueue() {
        if(this.front == this.rear) {
            System.out.println("Queue is empty nothing to print");
            return;
        }
        for(int i = this.front; i < this.rear; i++) {
            System.out.print("[ " + this.circularQueue[i] + " ]" + "  ");
        }
        System.out.println();
    }
}

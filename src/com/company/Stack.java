package com.company;

public class Stack {
    private final int[] stack;
    private int top = 0;

    Stack() {
        this.stack = new int[10];
    }
    Stack(int sizeOfStack) {
        this.stack = new int[sizeOfStack];
    }

    public void push(int value) {
        if(this.top >= this.stack.length) {
            System.out.println("Stack is full cannot add " + value);
            return;
        }
        this.stack[this.top] = value;
        this.top++;
    }

    public int pop() {
        if((this.top -1) < 0) {
            System.out.println("Stack is empty no value to pop");
            return -1;
        }
        this.top--;
        return this.stack[this.top];
    }

    public int peek() {
        if((this.top - 1) < 0) {
            System.out.println("Stack is empty no value at the peek");
            return -1;
        }
        return this.stack[this.top -1];
    }

    public void printStack() {
        if((this.top - 1) < 0){
            System.out.println("Stack is empty there is nothing to print");
            return;
        }
        for(int i = this.top - 1; i >= 0; i--) {
            System.out.println("[ " + this.stack[i] + " ]");
        }
    }

}

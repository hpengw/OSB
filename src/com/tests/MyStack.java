package com.tests;

public class MyStack {

    private Object[] myStack = new Object[10];

    private int index = -1;

    public MyStack() {
    }

    public void push(Object obj) {

        if(index >= 9) {
            System.out.println("Push failed, Stack overflow!");
            return;
        }

        index++;
        myStack[index] = obj;
        System.out.println("'" + obj + "' has been successfully pushed into stack.\nStack:" + index + 1 + "/10");

    }

    public void pop() {

        if(index <= -1) {
            System.out.println("Pop failed, Stack empty!");
            return;
        }

        System.out.println("'" + myStack[index] + "' has been successfully popped out of stack.");
        myStack[index] = null;
        index--;

    }

    public Object[] getStack() {
        return myStack;
    }

    public void setStack(Object[] stack) {
        this.myStack = stack;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}

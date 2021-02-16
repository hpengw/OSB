package com.osb.Tools;

import java.util.Arrays;
import java.util.Objects;

public class MyStack {

    private Object[] myStack = new Object[10];

    private int index = -1;

    private String name;

    public MyStack() {
        this.name = "MyStack";
    }

    public MyStack(String s) {
        this.name = s;
    }

    public void push(Object obj) {

        if(index >= 9) {
            System.out.println("Push failed. Joe overflow!");
            return;
        }

        index++;
        myStack[index] = obj;
        System.out.println("'" + obj + "' has been successfully pushed into " + name + ". (" + (index + 1) + "/10)");

    }

    public void pop() {

        if(index <= -1) {
            System.out.println("Pop failed. Stack underflow!");
            return;
        }

        System.out.println("'" + myStack[index] + "' has been successfully popped out of " + name + ".(" + index + "/10)");
        myStack[index] = null;
        index--;

    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object[] getMyStack() {
        return myStack;
    }

    public void setMyStack(Object[] myStack) {
        this.myStack = myStack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "MyStack = " + Arrays.toString(myStack) +
                ", Index=" + index +
                ", Name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyStack)) return false;
        MyStack myStack1 = (MyStack) o;
        return index == myStack1.index && Arrays.equals(myStack, myStack1.myStack) && Objects.equals(name, myStack1.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index, name);
        result = 31 * result + Arrays.hashCode(myStack);
        return result;
    }
}

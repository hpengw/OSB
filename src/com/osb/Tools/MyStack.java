package com.osb.Tools;

import java.util.Arrays;
import java.util.Objects;

/**
 * Stack class, for Info.
 * @version 1.1
 *
 * Default parameter:
 *  - Name: MyStack
 *  - Stack Size: 10
 */
public class MyStack {

    private Object[] myStack;

    private String name;

    private int index = -1;

    private int stackSize;

    public MyStack() {
        this.name = "MyStack";
        this.myStack = new Object[10];
    }

    public MyStack(String name) {
        this.name = name;
        this.myStack = new Object[10];
    }

    public MyStack(String name, int stackSize) {
        this.name = name;
        this.myStack = new Object[stackSize];
    }

    public void push(Object obj) {

        if(index >= myStack.length - 1) {
            System.out.println("Push failed. Stack <" + name + "> overflow!");
            return;
        }

        index++;
        myStack[index] = obj;
        System.out.println("'" + obj + "' has been successfully pushed into Stack <" + name + ">. (" + (index + 1) + "/" + myStack.length + ")");

    }

    public void pop() {

        if(index <= -1) {
            System.out.println("Pop failed. Stack <" + name + "> underflow!");
            return;
        }

        System.out.println("'" + myStack[index] + "' has been successfully popped out of Stack <" + name + ">.(" + index + "/" + myStack.length + ")");
        myStack[index] = null;
        index--;

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

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getStackSize() {
        return stackSize;
    }

    public void setStackSize(int stackSize) {
        this.stackSize = stackSize;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "myStack=" + Arrays.toString(myStack) +
                ", name='" + name + '\'' +
                ", index=" + index +
                ", stackSize=" + stackSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyStack)) return false;
        MyStack myStack1 = (MyStack) o;
        return index == myStack1.index && stackSize == myStack1.stackSize && Arrays.equals(myStack, myStack1.myStack) && Objects.equals(name, myStack1.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, index, stackSize);
        result = 31 * result + Arrays.hashCode(myStack);
        return result;
    }
}

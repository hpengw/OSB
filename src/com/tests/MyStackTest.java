package com.tests;

import com.osb.Tools.MyStack;

public class MyStackTest {

    public static void main(String[] args) {

        MyStack joe = new MyStack("Joe", 10);

        joe.push("Maan");
        joe.push("Patel");
        joe.push("YiTong");
        joe.push("Osama");
        joe.push("Nancy");
        joe.push("Kevin");
        joe.push("osball");
        joe.push("YiTong");
        joe.push("YiTong");
        joe.push("YiTong");
        joe.push("YiTong");

        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();
        joe.pop();

        System.out.println("=======================================");

        System.out.println(joe.hashCode());
    }

}

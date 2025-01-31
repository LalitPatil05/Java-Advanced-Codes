package com.companyabstractmethod;

abstract class Parent{
    public void method1(){
        System.out.println("I am a Method1..!!");
    }
    public void method2(){
        System.out.println("I am a Method2..!!");
    }
    abstract public void method3();
}

class Child extends Parent{
    public void method1() {
        System.out.println("Override the Method in Child Class");
    }
    public void method3(){
        System.out.println("I am a Abstract Method");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
       // Parent obj = new Parent(); --> Error
        Child obj = new Child();
        obj.method1();
        obj.method2();
        obj.method3();
    }
}

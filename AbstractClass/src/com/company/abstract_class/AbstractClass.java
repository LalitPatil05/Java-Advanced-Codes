package com.company.abstract_class;

abstract class Parent {
    public void fun1(){
        System.out.println("Function 1");
    }

    public void fun2() {
        System.out.println("Function 2");
    }

    abstract void method1();
    abstract void method2();
}

class Child extends Parent {
    public void method1() {
        System.out.println("Override Abstract Method1 in Child Class");
    }
    public void method2() {
        System.out.println("Override Abstract Method2 in Child Class");
    }

}

class Child2 extends Parent {
    @Override
    public void method1(){
        System.out.println("Override Abstract Method1 in Child2 Class");
    }
    @Override
    public void method2() {
        System.out.println("Override Abstract Method2 in Child 2 Class");
    }
}

public class AbstractClass {
    public static void main(String[] args) {

       //  Parent obj = new Parent(); --> Error

        Child obj = new Child();
        // Call the Function Using the Base/Child Class Object
        obj.fun1();
        obj.fun2();
        obj.method1();
        obj.method2();

        System.out.println("---------------------------------------\n");

        Child2 obj2 = new Child2();
        // Call the Functions Using the Base/Child2 Class Object
        obj2.fun1();
        obj2.fun2();
        obj2.method1();
        obj2.method2();

    }
}

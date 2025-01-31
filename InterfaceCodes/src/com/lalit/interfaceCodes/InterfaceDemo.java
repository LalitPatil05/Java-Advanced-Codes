package com.lalit.interfaceCodes;

interface Printable {
    void method1();
    void method2();
}

class ImplementerClass implements Printable {
    public void method1() {
        System.out.println("I am a Method 1 in the Printable Interface");
    }
   public void method2() {
        System.out.println("I am a Method 2 in the Pritable Interface");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
       // Printable p1 = new Printable(); ---> Error
        ImplementerClass ImC1 = new ImplementerClass();
        ImC1.method1();
        ImC1.method2();
    }
}

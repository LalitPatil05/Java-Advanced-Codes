package com.lalit.company.validation;

public class RangeValidation {
    public void rangeValidationCheck(int age){
        if(age <= 18 || age >= 100){
            throw new IllegalArgumentException("Age Must between 18 and Less than 100..!!");
        }
        else {
            System.out.println("Age is : "+age);
        }
    }
    public static void main(String[] args) {
        RangeValidation obj = new RangeValidation();
        obj.rangeValidationCheck(21);
    }
}

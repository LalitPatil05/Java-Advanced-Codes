package com.lalit.company.validation;

public class NameValidationCheck {
    public void nameValidation(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException("Name Cannot be Empty.");
        }
        else {
            System.out.println("Name is : "+name);
        }
    }
    public static void main(String[] args) {
            NameValidationCheck obj = new NameValidationCheck();
            obj.nameValidation("Roshan");
    }
}

package com.lalit.company.validation;

public class LengthValidation {

    public void checkPassword(String password) {

        if (password.length() < 8) {
            throw new IllegalArgumentException("Password Must Contain At Least 8 Characters");
        } else {
            System.out.println("Done, Password is : "+password);
        }
    }

    public static void main(String[] args) {
        LengthValidation obj = new LengthValidation();
        obj.checkPassword("abcdefghij");
    }
}

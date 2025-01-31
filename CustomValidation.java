package com.lalit.company.validation;

public class CustomValidation {

    public void validateStudentId(String studentId) {
        if(!studentId.startsWith("STU")) {
            throw new IllegalArgumentException("Invalid Student! Try Again!");
        }
        else {
            System.out.println("Success, Student Id is : "+studentId);
        }
    }

    public static void main(String[] args) {
        CustomValidation obj = new CustomValidation();
        obj.validateStudentId("STUskjffhkf");
    }
}

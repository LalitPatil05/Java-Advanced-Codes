import java.util.Scanner;
public class Student {

    Scanner sc = new Scanner(System.in);
    int id;
    String name;
    double fees;

    public void setData() {
        System.out.println("Enter the Student id : ");
        id = sc.nextInt();
        System.out.println("Enter the Student Name : ");
        name = sc.next();
        System.out.println("Enter the Student Fees : ");
        fees = sc.nextDouble();
    }

    public void getData() {
        System.out.println("Student Id is : "+id);
        System.out.println("Student Name is : "+name);
        System.out.println("Student Fees is : "+fees);
    }
}

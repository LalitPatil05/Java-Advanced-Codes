package PackagePracticals;

public class Package {

    int x,y;
    public void method1() {
        System.out.println("Hello I am Package Method..!!");
    }
    public void method2() {
        System.out.println("I am Method 2..!!");
    }

    public void setData(int a, int b) {
        x = a;
        y = b;
    }
    public void getData(){
        System.out.println("Value of x is : "+x);
        System.out.println("Value of y is : "+y);
    }
}

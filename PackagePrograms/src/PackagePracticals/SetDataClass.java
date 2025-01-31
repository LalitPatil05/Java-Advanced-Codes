package PackagePracticals;

public class SetDataClass {

    int a,b,c;
    public void setData2(int x, int y){
        a = x;
        b = y;
    }

    public void getData2() {
        System.out.println("Value of x is : "+a);
        System.out.println("Value of y is : "+b);
    }

    public void operation(){
       c = a + b;
       System.out.println("Addition is : "+c);

       c = a * b;
        System.out.println("Multiplication is : "+c);
    }
}

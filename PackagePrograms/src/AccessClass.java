import PackagePracticals.Package;
import PackagePracticals.SetDataClass;

public class AccessClass {
    public static void main(String[] args) {
        Package obj = new Package();
        obj.method1();
        obj.method2();
        obj.setData(10,20);
        obj.getData();

        SetDataClass obj2 = new SetDataClass();
        obj2.setData2(20,40);
        obj2.getData2();
        obj2.operation();

    }
}

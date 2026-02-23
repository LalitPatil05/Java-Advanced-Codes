import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Set;

public class CollectionDemo {

    public static void main(String args[]) {

        ArrayList al = new ArrayList();

        al.add(10);
        al.add("Uday");
        al.add("I");

        System.out.println("Array List is : "+al);

        HashSet hs = new HashSet();
        hs.add(20);
        hs.add("Kunal");
        hs.add(1000.00);

        System.out.println("Hash Set is : "+hs);

        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);

        System.out.println("List is : "+l1);

        List l2 = new LinkedList();
        l2.add(10);
        l2.add(20);

        System.out.println("Linked List is : "+l2);

        Set s1 = new HashSet();
        s1.add(100);
        s1.add(200);

        System.out.println("Set is : "+s1);

    }
}
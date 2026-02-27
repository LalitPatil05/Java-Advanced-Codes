import java.io.*;

public class StringBufferDemo {

    public static void main(String args[]) throws IOException {

        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);

        System.out.print("Enter the Surname : ");
        String sur = br.readLine();

        System.out.print("Enter the First Name : ");
        String fir = br.readLine();

        System.out.print("Enter the Middle Name : ");
        String mid = br.readLine();

        // Create a String Buffer Object

        StringBuffer sb = new StringBuffer();

        sb.append(sur);
        sb.append(fir);

        System.out.println("Profile Name is : "+sb);

        //insert middle name after surname

        int n = fir.length() + sur.length();
        sb.insert(n, mid);

        System.out.println("After Inserting the Middle Name, Name is : "+sb);

        // display full name 

        System.out.println("Full Name is : "+sb);
        System.out.println("Reverse Name is : "+sb.reverse());


    }
}
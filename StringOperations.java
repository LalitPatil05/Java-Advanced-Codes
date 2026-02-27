public class StringOperations {

    public static void main(String args[]) {

        String str1 = "Welcome to the Java Programming String Concept.";
        String str2 = new String(str1);
        String str3 = "Java Strings are Powerful";

        int result, idx;
        char ch;

        System.out.println("Length of String 1 is : "+str1.length());

        //display str1 character at a time

        for(int i=0;i<str1.length();i++) {
            System.out.print(str1.charAt(i));
        }

        System.out.println();

        if(str1.equals(str2)) {
            System.out.println("String1 Equals to String2");
        } 

        if(str1.equals(str3)) {
            System.out.println("String1 equls to String3");
        } else {
            System.out.println("String1 Does not equal to the String3");
        }

        result = str1.compareTo(str3);

        if(result==0) {
            System.out.println("String1 and String3 are Equal");
        } else if(result<0) {
            System.out.println("String1 is less than String3");
        } else {
            System.out.println("String1 is Greater than String3");
        }  

        // modification of string
        
        str2 = "One Two Three One";
        System.out.println("Newly Modified String2 is : "+str2);

        idx = str2.indexOf("Two");
        System.out.println("Index of first occurrence of One is : "+idx);

        idx = str2.indexOf("Three");
        System.out.println("Index of last occurrence of One is : "+idx);

    }
}
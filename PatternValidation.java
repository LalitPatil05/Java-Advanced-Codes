public class PatternValidation {
    public void patternValidation(String Email) {
        String emailRegeEx = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(!Email.matches(emailRegeEx)){
            throw new IllegalArgumentException("Invalid Email Id..!!");
        }
        else{
            System.out.println("Valid Id is : "+Email);
        }
    }

    public static void main(String[] args) {
        PatternValidation obj = new PatternValidation();
        obj.patternValidation("lalitpatil4636@gmai");
    }
}

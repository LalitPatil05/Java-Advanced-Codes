import com.company.PhoneModulePackage.Samsung;
import java.util.Scanner;

public class SamsungUser {

    public static void main(String[] args) {
        Samsung obj = new Samsung();
        Scanner sc = new Scanner(System.in);

        int choice;
        String ch;
        while (true){
            System.out.println("1.Switch on the Phone.\n2.Switch off the Phone\n" +
                    "3.Display Home Screen.\n4.Open the Camera.\n" +
                    "5.Open the Media Player");

            System.out.print("Enter the Choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.SwitchOn();
                    break;
                case 2:
                    obj.SwitchOff();
                    break;
                case 3:
                    obj.HomeScreen();
                    break;
                case 4:
                    obj.Camera();
                    break;
                case 5:
                    obj.MediaPlayer();
                    break;
                default:
                    System.out.println("Invalid Choice..!!");
            }

            System.out.println("Do you Want to Continue..?(y/n)");
            ch = sc.next();
        }
    }

}

import com.company.PhoneModulePackage.Realme;
import java.util.Scanner;

public class RealmeUser {
    public static void main(String[] args) {
        Realme obj = new Realme();
        Scanner sc = new Scanner(System.in);

        int choice;
        String ch;
        while(true){
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
        }

    }

}

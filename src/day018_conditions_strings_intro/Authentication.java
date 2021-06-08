package day018_conditions_strings_intro;
import java.util.Scanner;
public class Authentication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int expLast4Ssn = 5678;
        int expPinCode = 123456;
        System.out.println("Enter your last 4 SSN:");
        int last4Ssn = scan.nextInt();
        System.out.println("Enter your Pin Code:");
        int pinCode = scan.nextInt();

        if(last4Ssn == expLast4Ssn && pinCode == expPinCode){
            System.out.println("Welcome to your account.");
        }else {
            System.out.println("Authentication unsuccessful");
            if(last4Ssn != expLast4Ssn){
                System.out.println("Incorrect Last 4 SSN");
            }
            if(pinCode != expPinCode){
                System.out.println("Incorrect Pin Code");
            }

    }
}
}

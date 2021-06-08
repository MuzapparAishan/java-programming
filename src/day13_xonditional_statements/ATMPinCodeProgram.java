package day13_xonditional_statements;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("****** WELCOME TO TD BANK ATM ******");
        System.out.println("PLEASE INTER YOUR PIN CODE");
        int secretPinCode = 123456;
        int inputPinCode = scan.nextInt();
        if (secretPinCode == inputPinCode) {
            System.out.println("THANK YOU FOR CHOOSING THIS TD BANK ATM! ");
        } else {
            System.out.println("PLEASE CHECK YOUR PIN NUMBER And TRY AGAIN!");
        }
        System.out.println("THANK YOU FOR USING THIS ATM!");

    }
}
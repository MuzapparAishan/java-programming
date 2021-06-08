package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Cents: ");
        int cents=input.nextInt();
        int dollar=cents/100;
        int remainingCents = cents % 100;
        System.out.println("cents = " + cents);
        System.out.println("dollar = " + dollar);
        System.out.println("remainingCents = " + remainingCents);
        System.out.println("In " +cents+ " cents: $"+ dollar + " dollars and " + remainingCents + " cents.");
    }
}

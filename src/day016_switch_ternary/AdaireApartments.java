package day016_switch_ternary;
import java.util.Scanner;
public class AdaireApartments {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of bedroom you are looking for: ");
        int numberOfBedrooms = scan.nextInt();
        double startingPrice = 0;
        switch (numberOfBedrooms){
            case 0:
                startingPrice = 1454;
                System.out.println("Studio apartment selected.");
                break;
            case 1:
                startingPrice = 1725;
                System.out.println("one bedroom apartment selected.");
                break;
            case 2:
                startingPrice = 2899;
                System.out.println("Two bedroom apartment selected.");
                break;
            default:
                System.out.println(numberOfBedrooms + " Bedroom Apartment Is Currently Unavailable.");
                return;
        }
        System.out.println("Bedrooms: " + numberOfBedrooms);
        System.out.println("Price: $" + startingPrice);
    }
}

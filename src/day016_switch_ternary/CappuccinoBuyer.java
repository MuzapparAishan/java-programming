package day016_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 0;
        double calories = 0;
        switch (size){
            case "tall":
                System.out.println("Tall Cappuccino please.");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please.");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti cappuccino please.");
                price = 4.2;
                calories = 150;
                break;
            default:
                System.out.println("We dont serve " + size + " Cappuccino.");
        }
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories);
    }
}

package day018_conditions_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        int leasingPrice = 0;
        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasingPrice = 500;
            } else if (model.equals("A")) {
                leasingPrice = 400;
            }
        } else {
            System.out.println("Invalid make");
            return;
        }
        if (make.equals("Audi")) {
            if (model.equals("")) {
            }
        }
    }
}


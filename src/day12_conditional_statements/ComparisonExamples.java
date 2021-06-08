package day12_conditional_statements;

import javax.xml.bind.SchemaOutputResolver;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 55;
        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Is the driver speeding? \n" + isSpeeding);
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(speedLimit == currentSpeed);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        currentSpeed += 20;

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);
        System.out.println("isSpeeding ? " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford ? " + (accountBalance >= itemPrice));

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("canAfford = " + canAfford);

        accountBalance -= itemPrice;

        boolean isBroke = accountBalance <= 0;
        System.out.println("isBroke = " + isBroke);





    }
}

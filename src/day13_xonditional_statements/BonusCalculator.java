package day13_xonditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;

        if (salesAmount <= 1000) {
            System.out.println("Good job, you are qualified for bonus!");
            bonus += 50;
        } else {
            System.out.println("Great job, you are qualified for bonus!");
            bonus += 100;
        }
        System.out.println("YOU HAVE EARNED BONUS: $" + bonus);
    }
}

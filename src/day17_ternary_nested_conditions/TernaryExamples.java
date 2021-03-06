package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 54;
        String result = (score > 60) ? "pass" : "fail";
        System.out.println("result = " + result);

        String quality = "good";
        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println("rating = " + rating);

        char grade = (score>90)?'A':'B';
        System.out.println("grade = " + grade);
        String evenOdd = (score%2==0)?"even":"odd";

    }
}

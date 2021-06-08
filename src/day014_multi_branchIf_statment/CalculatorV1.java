package day014_multi_branchIf_statment;

public class CalculatorV1 {
    public static void main(String[] args) {
        double num1, num2;
        num1 = 5.5;
        num2 = 2.5;
        char operator;
        operator = '/';
        if (operator == '+') {
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if(operator == '*'){
            System.out.println(num1 * num2);
        }else if(operator == '/'){
            System.out.println(num1/num2);
        }else if(operator == '%'){
            System.out.println(num1 % num2);
        }else {
            System.out.println("Invalid operator");
        }
    }
}
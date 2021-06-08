package day018_conditions_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 44;
        int num3 = 110;
        if(num1>=num2 && num1>=num3){
            System.out.println("Num1 is the largest");
        }else if(num2>=num1 && num2>=num3){
            System.out.println("Num2 is the largest");
        }else if(num3>=num1 && num3>=num2){
            System.out.println("Num3 is the largest");
        }
    }
}

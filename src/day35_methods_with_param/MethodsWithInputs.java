package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(98);
        greetByName("Muzappar");
    }
    public static void displayValue(int num){
        System.out.println("Value is " + num);

    }
    public static void greetByName(String name){
        System.out.println("Hello " + name + ", how are you today?");
    }
}

package day35_methods_with_param;

public class Counter {
    public static void main(String[] args) {
        count(5);
        count(8);
        int num2 = 999;
        count(num2);
        String word = "wooden spoon";
        count(word.length());
    }
    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

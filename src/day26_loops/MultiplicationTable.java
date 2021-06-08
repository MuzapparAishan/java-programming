package day26_loops;
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int num = scan.nextInt();
        if(num < 1 || num > 10){
            System.out.println("ERROR: invalid input");
            return;
        }
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
//        System.out.println(num + " x " + 1 + " = " + num*1);
//        System.out.println(num + " x " + 2 + " = " + num*2);
//        System.out.println(num + " x " + 3 + " = " + num*3);
//        System.out.println(num + " x " + 4 + " = " + num*4);
//        System.out.println(num + " x " + 5 + " = " + num*5);
//        System.out.println(num + " x " + 6 + " = " + num*6);

    }
}

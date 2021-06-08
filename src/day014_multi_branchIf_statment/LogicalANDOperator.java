package day014_multi_branchIf_statment;

public class LogicalANDOperator {
    public static void main(String[] args) {
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(10 > 5 && 1==1);
        System.out.println(10 > 5 && 1==2);
        System.out.println(10 < 5 && 1==1);
        System.out.println(10 < 5 && 1==2);

        int apple = 10, oranges = 5;
        boolean check = apple > 5 && oranges > 3;
        System.out.println("check = " + check);

        if(apple > 6 && oranges > 2){
            System.out.println("I have enough apples and oranges");
        }else {
            System.out.println("I need to go buy some more fruits");
        }
    }
}

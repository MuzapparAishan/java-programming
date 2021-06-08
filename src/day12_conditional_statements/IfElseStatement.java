package day12_conditional_statements;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10>5){
            System.out.println("CONDITION IS TRUE");
        } else {
            System.out.println("CONDITION IS FALSE");
        }
        int count = 25;
        if (count > 30){
            System.out.println("COUNT IS MORE THAN 30");
        }  else{
            System.out.println("COUNT IS LESS THAN 30");
        }

        byte age = 25;
        if (age >= 18){
            System.out.println("YOU ARE ELIGIBLE TO VOT");
            System.out.println("AGE IS GREATER OR EQUAL TO 18");
        } else{
            System.out.println("YOU ARE NOT ELIGIBLE TO VOT");
            System.out.println("AGE IS LESS THAN 18");
        }

    }
}

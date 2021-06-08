package day13_xonditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
      boolean isHungry = false;
      if (isHungry == true){
          System.out.println("I am hungry, let me go get something to eat!");
      }else{
          System.out.println("I am not hungry, lets keep coding java!");
      }

      double price = 130.44;
      boolean isAffordable = 200 >= price;
      // 200 is budget
        System.out.println("isAffordable = " + isAffordable);
        if(isAffordable){
            System.out.println("I can afford it, lets buy!");
        }else{
            System.out.println("It is too expensive, lets keep codding.");
        }

        boolean isRemoteJob = true;
        //if it is Not remoteJob print "Sorry i am not interested"
        //otherwise, print "Sure I am interested, what is the interview process?"
        //if(isRemoteJob != true)
        //if(isRemoteJob == false
        if(!isRemoteJob){
            System.out.println("Sorry i am not interested.");
        }else{
            System.out.println("Sure I am interested, what is the interview process?");
        }


    }
}

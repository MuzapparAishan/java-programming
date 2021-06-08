package day016_switch_ternary;

public class FloorSelector {
    public static void main(String[] args) {
        int floornum = 1;
        if (floornum == 1){
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        }else if (floornum == 2){
            System.out.println("Floor 2 selected. companies: Cybertek, NASA, Intelsat");
        }else if (floornum == 3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        }else {
            System.out.println("Invalid number -" + floornum);
        }

        floornum = 5;
        switch (floornum){
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                break;
            case 2:
                System.out.println("Floor 2 selected. companies: Cybertek, NASA, Intelsat");
                break;
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                break;
            default:
                System.out.println("Invalid number-" + floornum);
                break;

        }


    }
}

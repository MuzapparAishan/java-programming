package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[]args){
        int toyota=431;
        int honda=233;
        int vw=2;
        int tesla=20;
        int nissan=1;
        int bmw=155;
        int totalCarsInParkingLot=toyota+honda+vw+tesla+nissan+bmw;

        System.out.println(totalCarsInParkingLot);
        System.out.println("There are "+totalCarsInParkingLot+" cars in the parking lot.");

        String pizza="hawaiian";
        int slices=8;
        int people=4;
        int slicePerPerson=slices/people;
        System.out.println("there are "+slicePerPerson+" slices of "+pizza+" pizza for each person.");
        System.out.println("we ordered a "+pizza+" pizza with "+slices+" slices for "+people+" people,"+" and each person will have "+slicePerPerson+"slices of pizza.");

    }
}

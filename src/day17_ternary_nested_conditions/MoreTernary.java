package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 35;
        String reply;
        if (hourlyRate > 45) {
            reply = "accept";
        } else {
            reply = "reject";
        }

        String reply1 = (hourlyRate > 45)? "accept" : "reject";
        System.out.println("reply = " + reply1);

        String todaysClass = "java";
        String teacher = (todaysClass.equals("java")) ? "Murodil" : "Saim";
        System.out.println("Today's teacher = " + teacher);

        boolean isEligibleToDrive = true;
        String driving = isEligibleToDrive ? "have Dl, can drive" : "No DL, cannot drive";
        System.out.println("driving = " + driving);
    }
}

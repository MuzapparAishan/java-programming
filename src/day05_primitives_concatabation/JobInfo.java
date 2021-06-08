package day05_primitives_concatabation;

public class JobInfo {
    public static void main(String[]args){
        String title="Java SDET";
        String company="Palo Alto Networks";
        String jobDescription="Java, Selenium, Cucumber, Tomato, JUnit";
        double salary=123000;
        byte yearsOfExp=3;
        boolean hasBenefits=true;
        System.out.println("Job Title:\t\t"+title);
        System.out.println("Company Name:\t\t"+company);
        System.out.println("Job Description:\t\t"+jobDescription);
        System.out.println("Salary:\t\t$"+salary);
        System.out.println("Required Work experience:\t\t"+yearsOfExp+"Years");
        System.out.println("Has Benefits?\t\t"+hasBenefits);


    }
}

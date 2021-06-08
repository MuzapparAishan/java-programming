package day014_multi_branchIf_statment;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "sunny";//"rainy","snowy","windy";
        if(weather == "sunny"){
            System.out.println("Go to park, hiking, and code java");
        }else if(weather == "rainy"){
            System.out.println("Stay home and watch movies");
        }else if(weather == "snowy"){
            System.out.println("Go build snowman, and drink hot chocolate");
        }else if(weather == "windy"){
            System.out.println("Juts stay home and code java");
        }else {
            System.out.println("Keep codding java");
        }

    }
}

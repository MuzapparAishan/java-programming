package day22_String_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        System.out.println(result.substring(13,18));
        System.out.println(result.substring(13));

        System.out.println(result.indexOf(":"));
        int colonIndex = result.indexOf(":");
        System.out.println(result.substring(colonIndex + 1));

        String today = " i coded [wooden spoon] today";
        int start = today.indexOf("[");
        int end = today.indexOf("]");
        System.out.println(today.substring(start+1, end));
    }
}

package day35_methods_with_param;

public class buildEmail {
    public static void main(String[] args) {
        buildEmail("muzappar", "gmail");
    }
    public static void buildEmail(String name, String domain) {
        String email = name + "@" + domain + ".com";
        System.out.println(email);
    }
}

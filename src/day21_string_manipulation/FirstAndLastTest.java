package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);
        if(first == last){
            System.out.println("First and Last letter match");
        }else {
            System.out.println("First and Last letter mismatch");
        }

        String anotherWord = "aziza";
        char firstLetter = anotherWord.charAt(0);
        char lastLetter = anotherWord.charAt(anotherWord.length() - 1);
        if(firstLetter == lastLetter){
            System.out.println("First and Last letter match");
        }else {
            System.out.println("First and Last letter mismatch");
        }
        String word2 = "java";
        System.out.println(word.indexOf("j"));

    }
}

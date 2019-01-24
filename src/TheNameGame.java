import java.util.Scanner;

public class TheNameGame{
    public static void main(String[] args){
        System.out.print("What is your name? ");
        Scanner s = new Scanner(System.in);
        String firstName = s.next();
        String lastName = s.next();
        printLyrics(firstName);
        System.out.println();
        printLyrics(lastName);
    }

    private static void printLyrics(String str){
        String str1 = str.substring(1);
        System.out.println(str + " " + str + ", bo-B" + str1);
        System.out.println("Banana-fana fo-F" + str1);
        System.out.println("Fee-fi-mo-M" + str1);
        System.out.println(str.toUpperCase()+"!");
    }
}
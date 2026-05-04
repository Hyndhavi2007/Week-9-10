package Level1;
import java.util.Scanner;
public class StringIndex {
    public static void generateException(String text) {
       
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }
    public static void handleException(String text) {
        try {

            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Invalid index! Please use index between 0 and " + (text.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.println("\nGenerating Exception:");
        generateException(text);

        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}
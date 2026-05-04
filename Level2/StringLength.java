package Level2;
import java.util.Scanner;
public class StringLength{
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);

        int actualLength = text.length();

        System.out.println("Length using custom method: " + customLength);
        System.out.println("Length using built-in method: " + actualLength);

        sc.close();
    }
}
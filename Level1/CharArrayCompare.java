package Level1;
import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getChars(String str) {
        char[] result = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }

        return result;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] userArray = getChars(text);

        char[] builtInArray = text.toCharArray();

        boolean result = compareCharArrays(userArray, builtInArray);

        System.out.print("Characters using charAt(): ");
        for (char c : userArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        System.out.print("Characters using toCharArray(): ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }

        System.out.println();

        if (result) {
            System.out.println("Both arrays are SAME.");
        } else {
            System.out.println("Both arrays are DIFFERENT.");
        }

        sc.close();
    }
}
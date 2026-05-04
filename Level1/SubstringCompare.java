package Level1;
import java.util.Scanner;

public class SubstringCompare {
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }

        return result;
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String sub1 = createSubstring(text, start, end);

        String sub2 = text.substring(start, end);

        boolean result = compareStrings(sub1, sub2);

        System.out.println("Substring using charAt(): " + sub1);
        System.out.println("Substring using substring(): " + sub2);

        if (result) {
            System.out.println("Both substrings are SAME.");
        } else {
            System.out.println("Both substrings are DIFFERENT.");
        }

        sc.close();
    }
}
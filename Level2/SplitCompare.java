package Level2;

import java.util.Scanner;

public class SplitCompare {

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

    public static String[] splitText(String text) {
        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        String[] words = new String[wordCount];
        int start = 0;

        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < wordCount - 1) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }

            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }

            words[i] = word;
            start = end + 1;
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] userSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        boolean result = compareArrays(userSplit, builtInSplit);

        System.out.println("User-defined split:");
        for (String word : userSplit) {
            System.out.println(word);
        }

        System.out.println("Built-in split:");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        System.out.println("Both results are same: " + result);

        sc.close();
    }
}
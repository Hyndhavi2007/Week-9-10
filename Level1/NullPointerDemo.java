package Level1;
public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        System.out.println("Length of string: " + text.length());
    }
    public static void handleException() {
        String text = null;

        try {
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("Cannot perform operation on a null string.");
        }
    }

    public static void main(String[] args) {

        System.out.println("Demonstrating Exception:");
        generateException();
        System.out.println("\nHandling Exception:");
        handleException();
    }
}
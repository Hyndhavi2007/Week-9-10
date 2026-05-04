package Level3;
import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 24.9) {
            status = "Normal";
        } else if (bmi < 29.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };
    }

    public static String[][] processData(double[][] data) {
        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            String[] row = calculateBMI(data[i][0], data[i][1]);
            result[i] = row;
        }

        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");

        for (int i = 0; i < data.length; i++) {
            System.out.println(
                    data[i][0] + "\t\t" +
                    data[i][1] + "\t\t" +
                    String.format("%.2f", Double.parseDouble(data[i][2])) + "\t" +
                    data[i][3]
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] input = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            input[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm): ");
            input[i][1] = sc.nextDouble();
        }

        String[][] result = processData(input);

        display(result);

        sc.close();
    }
}
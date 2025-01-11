import java.util.Scanner;
public class ModifiedBMI {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of persons: ");
        int numOfPersons = input.nextInt();
        double[][] personData = new double[numOfPersons][3]; 
        String[] weightStatus = new String[numOfPersons];
        for (int i = 0; i < numOfPersons; i++) {
            System.out.println("Enter height and weight for person " + (i + 1) + ":");
            personData[i][0] = getValidInput(input, "Height");
            personData[i][1] = getValidInput(input, "Weight");

            personData[i][2] = calculateBMI(personData[i][1], personData[i][0]);
            weightStatus[i] = getWeightStatus(personData[i][2]);
        }
        System.out.println("Height (m)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < numOfPersons; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%s%n", personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        } 
        input.close();
    }
    public static double getValidInput(Scanner input, String type) {
        double value;
        while (true) {
            System.out.print(type + ": ");
            value = input.nextDouble();
            if (value > 0) {
                break;
            }
            System.out.println("Invalid input. Please enter a positive value.");
        }
        return value;
    }
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }
    public static String getWeightStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}
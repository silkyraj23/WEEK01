import java.util.Scanner;
public class BMI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of people: ");
        int numberOfPeople= input.nextInt();
        //array to store height, weight, BMI, and status
        double[] heights = new double[numberOfPeople];
        double[] weights = new double[numberOfPeople];
        double[] bmi = new double[numberOfPeople];
        String[] status = new String[numberOfPeople];
        // get input for weight and height
        for (int i = 0; i < numberOfPeople; i++) {
            // Input height and weight
            System.out.print("Height : ");
            heights[i] = input.nextDouble();
            System.out.print("Weight : ");
            weights[i] = input.nextDouble();
            // Calculate BMI
            bmi[i] = weights[i]/(heights[i] * heights[i]);

            // calculate status based on BMI
            if (bmi[i] < 18.5) {
                status[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }

        // print the report
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.println( heights[i] + weights[i] + bmi[i]+ " "+ status[i]);
        }
        //close the input stream
        input.close();
    }
}

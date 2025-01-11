import java.util.Scanner;
public class CalculateBonusOfEmployees {
    public static void main(String[] args) {
        //creating the instance of scanner class
        Scanner input = new Scanner(System.in);
        // array for storing data of employee;
        double[] currSalary = new double[10];
        int[] yearsOfService = new int[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        // Variables to store total bonus, old salary, and new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        // Loop to take array input from the user
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            currSalary[i] = input.nextDouble();
            while (currSalary[i] <= 0) {
                System.out.print("Invalid salary. Please enter a valid salary: ");
                currSalary[i] = input.nextDouble();
            }
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextInt();
            while (yearsOfService[i] < 0) {
                System.out.print("Invalid years of service. Please enter a valid years of services: ");
                yearsOfService[i] = input.nextInt();
            }
        }
        // Loop to calculate bonus and new salary
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = currSalary[i] * 0.05;
            } else {
                bonus[i] = currSalary[i] * 0.02;
            }
            // Calculating new salary
            newSalary[i] = currSalary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += currSalary[i];
            totalNewSalary += newSalary[i];
        }
        //print total bonus, old salary, and new salary
        System.out.println("\nTotal Bonus Paid: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        input.close();
    }
}

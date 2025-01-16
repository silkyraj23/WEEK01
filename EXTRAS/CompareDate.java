import java.time.LocalDate;
import java.util.Scanner;

public class CompareDate {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        // Input first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = input.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);

        // Input second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = input.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare the two dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }

        input.close();
    }
}
import java.util.*;
public class ModifiedUnitConvertor{
    // Method To convert kilometers to miles
    public static double convertYardsToFeet(double yards) {
        // Convert yards to feet
        double yardsTofeet = 3;
        double feet = yards * yardsTofeet;
        return feet;
    }
    public static double convertFeetToYards(double feet) {
        // Convert feet to yards
        double feetToyards = 0.333333;
        double yards = feet * feetToyards;
        return yards;
    }
    public static double convertMeterToInches(double meter) {
        // Convert meter to inches
        double meterToinches = 39.3701;
        double inches = meter * meterToinches;
        return inches;
    }
    public static double convertInchesToMeter(double inches) {
        // Convert inches to meter
        double inchesTometer = 0.0254;
        double meter = inches * inchesTometer;
        return meter;
    }
    public static double convertInchesToCentimeter(double inch) {
        // Convert inches to centimeter
        double inchesTocentimeter = 2.54;
        double centimeter = inch * inchesTocentimeter;
        return centimeter;
    }
    public static void main(String[] args) {
        // Create a Scanner object to tske user input
        Scanner input = new Scanner(System.in);
        // Take input 
        System.out.print("Enter input in yards: ");
        double yards = input.nextDouble();
        double feetres = ModifiedUnitConvertor.convertYardsToFeet(yards);
        System.out.println("In feet: " + feetres);
        System.out.print("Enter the input in feet: ");
        double feet = input.nextDouble();
        double yardsres = ModifiedUnitConvertor.convertFeetToYards(feet);
        System.out.println("In yards: " + yardsres);//result in yards
        System.out.print("Enter the input in meter: ");
        double meter = input.nextDouble();
        double inchres = ModifiedUnitConvertor.convertMeterToInches(meter);
        System.out.println("In inches: " + inchres);//result in inches
        System.out.print("Enter the input in inches: ");
        double inches = input.nextDouble();
        double meterres = ModifiedUnitConvertor.convertInchesToMeter(inches);
        System.out.println("In meter: " + meterres);
        System.out.print("Enter the input in inch: ");
        double inch = input.nextDouble();
        double centimeterres = ModifiedUnitConvertor.convertInchesToCentimeter(inch);
        System.out.println("In centimeter: " + centimeterres);
        // Close the Scanner stream
        input.close();
    }
}

import java.util.*;
public class NewUnitConvertor {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    // Method to convert pounds to kilogram
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }
    // Method to convert kilogram to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }
    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }
    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        // Take input from user 
        System.out.print("Enter input in fahreinheit: ");
        double fahreinheit = input.nextDouble();
        double celsiusres = NewUnitConvertor.convertFahrenheitToCelsius(fahreinheit);
        System.out.println("In celsius: " + celsiusres);//result in Celsius
        System.out.print("Enter the input in celsius: ");
        double celsius = input.nextDouble();
        double fahreinheitres = NewUnitConvertor.convertCelsiusToFahrenheit(celsius);
        System.out.println("In fahreinheit: " + fahreinheitres);//result in fahreinheit
        System.out.print("Enter the input in pounds: ");
        double pounds = input.nextDouble();
        double kilogramsres = NewUnitConvertor.convertPoundsToKilograms(pounds);
        System.out.println("In kilograms: " + kilogramsres);//result in kilograms
        System.out.print("Enter the input in kilograms: ");
        double kilograms = input.nextDouble();
        double poundres = NewUnitConvertor.convertKilogramsToPounds(kilograms);
        System.out.println("In pound: " + poundres);
        System.out.print("Enter the input in gallons: ");
        double gallons = input.nextDouble();
        double litersres = NewUnitConvertor.convertGallonsToLiters(gallons);
        System.out.println("In liters " + litersres);
        System.out.print("Enter the input in liters: ");
        double liters = input.nextDouble();
        double gallonsres = NewUnitConvertor.convertLitersToGallons(liters);
        System.out.println("In gallons " + gallonsres);
        // Close the Scanner stream
        input.close();

    }
}

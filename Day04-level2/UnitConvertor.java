import java.util.Scanner;
public class UnitConvertor {
    public static double convertKmToMiles(double km) {
        double kmTomiles = 0.621371;
        double miles = km * kmTomiles;
        return miles;
    }
    public static double convertMilesToKilometers(double miles) {
        double milesTokm = 1.60934;
        double km = miles * milesTokm;
        return km;
    }
    public static double convertMeterToFeet(double meter) {
        double meterTofeet = 3.28084;
        double feet = meter * meterTofeet;
        return feet;
    }
    public static double converFeetToMeter(double feet) {
        double feetTometer = 0.3048;
        double meter = feet * feetTometer;
        return meter;
    }
    public static void main(String[] args) {
        // Create a Scanner instance to take user input
        Scanner input = new Scanner(System.in);
        // Take input 
        System.out.print("Enter the distance in kilometers: ");
        double km = input.nextDouble();
        double milesres = UnitConvertor.convertKmToMiles(km);
        System.out.println("Distance in miles: " + milesres);//result in miles
        System.out.print("Enter the distance in miles: ");

        double miles = input.nextDouble();
        double kmres = UnitConvertor.convertMilesToKilometers(miles);
        System.out.println("Distance in km: " + kmres);//result in km
        System.out.print("Enter the distance in meter: ");

        double meter = input.nextDouble();
        double feetres = UnitConvertor.convertMeterToFeet(meter);
        System.out.println("Distance in feet: " + feetres);//result in feet
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();
        double meterres = UnitConvertor.converFeetToMeter(feet);
        System.out.println("Distance in meter: " + meterres);

        //closing the input stream
        input.close();

    }
}
import java.util.Random;

public class UniqueOTP {
    // Method to generate a 6-digit OTP number using Math.random()
    public static int generateOTP() {
        Random randomNum = new Random();
        return randomNum.nextInt(900000) + 100000; // Generate a random number between 100000 and 999999
    }
    // Method to check if all OTPs in the array are unique
    public static boolean areOTPsUnique(int[] otp) {
        for (int i = 0; i < otp.length - 1; i++) {
            for (int j = i + 1; j < otp.length; j++) {
                if (otp[i] == otp[j]) {
                    return false; // i.e. two OTPs are the same, return false
                }
            }
        }
        return true; // i.e. All OTPs are unique
    }

    public static void main(String[] args) {
	
        // Array to store the generated OTPs
        int[] generatedOTP = new int[10]; 
        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            generatedOTP[i] = generateOTP();
        }
        // Check if all OTPs are unique
        if (areOTPsUnique(generatedOTP)) {
            System.out.println("All OTP are unique.");
            for (int i=0;i< generatedOTP.length;i++) {
                System.out.println("Generated OTP is: " + generatedOTP[i]);
            }
        } else {
            System.out.println("Some OTPs are duplicates.");
        }
    }
}
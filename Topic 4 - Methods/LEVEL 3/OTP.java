import java.util.Arrays;
import java.util.Scanner;
public class OTP {
	
    public static void main(String[] args) {
        int[] otpNumbers = new int[10];

        // Generate 10 OTPs
        for (int i = 0; i < otpNumbers.length; i++) {
            otpNumbers[i] = generateOTP();
        }

        // Display the generated OTPs
        System.out.println("Generated OTPs:");
        for (int otp : otpNumbers) {
            System.out.println(otp);
        }

        // Check if OTPs are unique
        if (areOTPsUnique(otpNumbers)) {
            System.out.println("\nAll OTPs are unique!");
        } else {
            System.out.println("\nSome OTPs are duplicate!");
        }
    }

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        return (int) (Math.random() * 900000) + 100000; // 6-digit OTP
    }

    // Method to check if OTPs are unique
    public static boolean areOTPsUnique(int[] otpNumbers) {
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false; // Found a duplicate OTP
                }
            }
        }
        return true; // All OTPs are unique
    }
}

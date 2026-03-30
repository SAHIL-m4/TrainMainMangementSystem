import java.util.Scanner;
import java.util.regex.Pattern;

public class TrainMainMangementSystem { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println(" UC11 - Validate Train ID and Cargo Code");
        System.out.println("================================================");
        System.out.println();
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainIdInput = scanner.nextLine();
        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCodeInput = scanner.nextLine();
        String trainRegex = "^TRN-\\d{4}$";
        String cargoRegex = "^[A-Z]{3}-[A-Z]{2}$";
        boolean isTrainIdValid = Pattern.matches(trainRegex, trainIdInput);
        boolean isCargoCodeValid = Pattern.matches(cargoRegex, cargoCodeInput);
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainIdValid);
        System.out.println("Cargo Code Valid: " + isCargoCodeValid);
        System.out.println("\nUC11 validation completed...");
        scanner.close();
    }
}  
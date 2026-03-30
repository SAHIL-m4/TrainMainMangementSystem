import java.util.HashMap;
import java.util.Map;
public class TrainMainMangementSystem {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC5 - Goods Bogies & Safety Compliance ");
        System.out.println("==========================================\n");
        Map<String, Boolean> safetyCheck = new HashMap<>();
        safetyCheck.put("Rectangular", true);
        safetyCheck.put("Cylindrical", false);
        System.out.println("Goods Bogie Safety Status:");
        System.out.println(safetyCheck + "\n");
        for (Map.Entry<String, Boolean> entry : safetyCheck.entrySet()) {
            String status = entry.getValue() ? "PASS" : "FAIL";
            System.out.println("Bogie Type: " + entry.getKey() + " | Safety Status: " + status);
        }
        System.out.println("\nChecking specific bogie safety...");
        if (safetyCheck.get("Cylindrical")) {
            System.out.println("Cylindrical bogie is safe for dispatch.");
        } else {
            System.out.println("ALERT: Cylindrical bogie failed safety check. Maintenance required!");
        }
        System.out.println("\nUC5 safety validation completed...");
    }
}
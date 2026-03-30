import java.util.HashMap;
import java.util.Map;
public class TrainMainMangementSystem {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC4 - Track Bogie Capacities ");
        System.out.println("==========================================\n");
        Map<String, Integer> bogieCapacities = new HashMap<>();
        bogieCapacities.put("Sleeper", 72);
        bogieCapacities.put("AC Chair", 60);
        bogieCapacities.put("First Class", 24);
        System.out.println("Bogie Capacities (Type -> Seats):");
        System.out.println(bogieCapacities + "\n");
        String checkBogie = "AC Chair";
        System.out.println("Fetching capacity for '" + checkBogie + "':");
        System.out.println("Capacity: " + bogieCapacities.get(checkBogie) + " seats\n");
        System.out.println("Iterating through all Bogie Capacities:");
        for (Map.Entry<String, Integer> entry : bogieCapacities.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
        System.out.println("\nUC4 map operations completed successfully...");
    }
}
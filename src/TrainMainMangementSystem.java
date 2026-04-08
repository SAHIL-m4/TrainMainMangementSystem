import java.util.Arrays;
public class TrainMainMangementSystem {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC19 - Binary Search for Bogie ID ");
        System.out.println("==============================================\n");
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};
        Arrays.sort(bogieIds);
        String key = "BG309";
        System.out.println("Sorted Bogie IDs:");
        for (String id : bogieIds) {
            System.out.println(id);
        }
        System.out.println();
        int low = 0;
        int high = bogieIds.length - 1;
        boolean found = false;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = key.compareTo(bogieIds[mid]);
            if (comparison == 0) {
                System.out.println("Bogie " + key + " found using Binary Search.");
                found = true;
                break;
            } else if (comparison > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Bogie " + key + " not found in the system.");
        }
        System.out.println("\nUC19 search completed...");
    }
}
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class TrainMainMangementSystem {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("==========================================");
        System.out.println();
        List<String> trainConsist = new ArrayList<>();
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);
        System.out.println();
        System.out.println("==========================================");
        System.out.println(" UC3 - Track Unique Bogie IDs ");
        System.out.println("==========================================");
        System.out.println();
        Set<String> bogies = new HashSet<>();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);
        System.out.println();
        System.out.println("Note:");
        System.out.println("Duplicates are automatically ignored by HashSet.");
        System.out.println();
        System.out.println("UC3 uniqueness validation completed...");
        System.out.println();
        System.out.println("System ready for operations...");
    }
}
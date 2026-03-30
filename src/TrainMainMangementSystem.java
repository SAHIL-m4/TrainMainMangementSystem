import java.util.ArrayList;
import java.util.List;
public class TrainMainMangementSystem {
    static class Bogie {
        String name;
        int capacity;
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
        @Override
        public String toString() {
            return name + " (" + capacity + ")";
        }
    }
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC9 - Calculate Total Capacity (Streams) ");
        System.out.println("==========================================\n");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        System.out.println("Train Consist:");
        bogies.forEach(b -> System.out.println("- " + b));
        int totalCapacity = bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();
        System.out.println("\n------------------------------------------");
        System.out.println("Total Passenger Capacity: " + totalCapacity);
        System.out.println("------------------------------------------");
        System.out.println("\nUC9 calculation completed...");
    }
}
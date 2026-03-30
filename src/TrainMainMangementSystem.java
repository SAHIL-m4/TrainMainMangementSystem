import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
            return name + " -> " + capacity;
        }
    }
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println(" UC10 - Find Maximum Capacity Bogie ");
        System.out.println("==========================================\n");
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));
        System.out.println("Scanning Bogies...");
        Optional<Bogie> maxBogie = bogies.stream()
                .max(Comparator.comparingInt(b -> b.capacity));
        if (maxBogie.isPresent()) {
            System.out.println("\nMaximum Capacity Bogie Found:");
            System.out.println(maxBogie.get());
        } else {
            System.out.println("No bogies found in the consist.");
        }
        System.out.println("\nUC10 scan completed...");
    }
}
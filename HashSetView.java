import java.util.HashSet;

public class HashSetView {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // Add elements
        set.add("TOM");
        set.add("SARAH");
        set.add("JAMES"); // Duplicate element

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists
        if (set.contains("SARAH")) {
            System.out.println("SARAH is in the set.");
        }

        // Remove an element
        set.remove("SARAH");

        // Display the HashSet after removal
        System.out.println("HashSet after removal: " + set);
    }
}

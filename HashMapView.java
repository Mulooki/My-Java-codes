import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add key-value pairs
        map.put("TOM", 1);
        map.put("SARAH", 2);
        map.put("JAMES", 3);

        // Access a value
        System.out.println("Value for key 'SARAH': " + map.get("SARAH"));

        // Remove a key-value pair
        map.remove("SARAH");

        // Display the HashMap
        System.out.println("HashMap: " + map);
    }
}

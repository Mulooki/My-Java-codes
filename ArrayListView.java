import java.util.ArrayList;

public class ArrayListView {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("TOM");
        list.add("SARAH");
        list.add("JAMES");

        // Access elements
        System.out.println("First element: " + list.get(0));

        // Remove an element
        list.remove("SARAH");

        // Display the ArrayList
        System.out.println("ArrayList: " + list);
    }
}

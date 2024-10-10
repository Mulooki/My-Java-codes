import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);

        // Display elements of the ArrayList
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

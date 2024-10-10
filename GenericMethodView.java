public class GenericMethodView {
    // Generic method to print array elements
    public static <E> void printArray(E[] elements) {
        for (E element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // Integer array
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        // String array
        String[] strArray = { "Hello", "World" };

        // Print arrays using generic method
        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(strArray);
    }
}

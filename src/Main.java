import java.util.Scanner;

// Generic class to find the maximum of a variable number of elements
class GenericMax<T extends Comparable<T>> {
    private final T[] items;

    // Constructor to initialize the elements
    public GenericMax(T... items) {
        this.items = items;
    }

    // Method to find and return the maximum element
    public T findMax() {
        return computeMax(items);
    }

    // Helper method to calculate the maximum value
    private T computeMax(T[] elements) {
        if (elements.length == 0) {
            throw new IllegalArgumentException("No elements provided!");
        }

        T maxValue = elements[0]; // Assume the first element is the largest initially
        for (T item : elements) {
            if (item.compareTo(maxValue) > 0) {
                maxValue = item;
            }
        }
        displayMax(maxValue);
        return maxValue;
    }

    // Method to display the maximum value
    private void displayMax(T max) {
        System.out.println("Maximum Value: " + max);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Strings - Input and Processing
        System.out.println("Enter strings (space-separated):");
        String inputStrings = scanner.nextLine().trim();
        if (!inputStrings.isEmpty()) {
            String[] stringArray = inputStrings.split(" "); // Split by spaces
            GenericMax<String> stringMaxFinder = new GenericMax<>(stringArray);
            System.out.println("Largest String: " + stringMaxFinder.findMax());
        } else {
            System.out.println("Error: Please enter valid strings.");
        }

        // Integers - Input and Processing
        System.out.println("\nEnter integers (space-separated):");
        String inputIntegers = scanner.nextLine().trim();
        try {
            String[] integerTokens = inputIntegers.split(" ");
            Integer[] intArray = new Integer[integerTokens.length];
            for (int i = 0; i < integerTokens.length; i++) {
                intArray[i] = Integer.parseInt(integerTokens[i]); // Convert to Integer
            }
            GenericMax<Integer> intMaxFinder = new GenericMax<>(intArray);
            System.out.println("Largest Integer: " + intMaxFinder.findMax());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }

     
        System.out.println("\nEnter floats (space-separated):");
        String inputFloats = scanner.nextLine().trim();
        try {
            String[] floatTokens = inputFloats.split(" ");
            Float[] floatArray = new Float[floatTokens.length];
            for (int i = 0; i < floatTokens.length; i++) {
                floatArray[i] = Float.parseFloat(floatTokens[i]); // Convert to Float
            }
            GenericMax<Float> floatMaxFinder = new GenericMax<>(floatArray);
            System.out.println("Largest Float: " + floatMaxFinder.findMax());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid floating-point numbers.");
        }

       
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Integer array
        Integer[] intArray = {new Integer(2), 4, 3};

        // Create a Double array
        Double[] doubleArray = {3.4, 1.3, -22.1};

        // Create a Character array
        Character[] charArray = {'a', 'J', 'r'};

        // Create a String array
        String[] stringArray = {"Tom", "Susan", "Kim"};

        // Sort the arrays
        sort(intArray);
        sort(doubleArray);
        sort(charArray);
        sort(stringArray);

        // Display the sorted arrays
        System.out.print("Sorted Integer objects: ");
        printList(intArray);
        System.out.print("Sorted Double objects: ");
        printList(doubleArray);
        System.out.print("Sorted Character objects: ");
        printList(charArray);
        System.out.print("Sorted String objects: ");
        printList(stringArray);
    }
    /** Sort an array of comparable objects */
    public static <E extends Comparable<E>> void sort(E[] list) {
        E currentMin;
        int currentMinIndex;

        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i+1..list.length−2]
            currentMin = list[i];
            currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin.compareTo(list[j]) > 0) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
    /** Print an array of objects */
    public static void printList(Object[] list) {
        for (Object o : list) System.out.print(o + " ");
        System.out.println();
    }
}


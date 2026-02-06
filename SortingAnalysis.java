import java.util.Random;

public class SortingAnalysis {

    // Class to store counters
    static class SortStats {
        long comparisons = 0;
        long swaps = 0;
    }

    // ---------------- INSERTION SORT ----------------
    public static SortStats insertionSort(int[] arr) {
        SortStats stats = new SortStats();

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0) {
                stats.comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    stats.swaps++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
        }
        return stats;
    }

    // ---------------- SELECTION SORT ----------------
    public static SortStats selectionSort(int[] arr) {
        SortStats stats = new SortStats();

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                stats.comparisons++;
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                stats.swaps++;
            }
        }
        return stats;
    }

    // ---------------- BUBBLE SORT ----------------
    public static SortStats bubbleSort(int[] arr) {
        SortStats stats = new SortStats();
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                stats.comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    stats.swaps++;
                    swapped = true;
                }
            }

            if (!swapped) break; // Optimization
        }

        return stats;
    }

    // ---------------- INPUT GENERATORS ----------------
    public static int[] increasingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = i;
        return arr;
    }

    public static int[] reverseArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = size - i;
        return arr;
    }

    public static int[] randomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) arr[i] = rand.nextInt(size);
        return arr;
    }

    // Utility to copy arrays
    public static int[] copyArray(int[] arr) {
        return arr.clone();
    }

    // ---------------- RUN TEST ----------------
    public static void runTest(String inputType, int[] baseArray) {
        int[] arr1 = copyArray(baseArray);
        int[] arr2 = copyArray(baseArray);
        int[] arr3 = copyArray(baseArray);

        SortStats insertion = insertionSort(arr1);
        SortStats selection = selectionSort(arr2);
        SortStats bubble = bubbleSort(arr3);

        System.out.printf("%-10s %-12s %-15d %-15d\n", "Insertion", inputType,
                insertion.comparisons, insertion.swaps);
        System.out.printf("%-10s %-12s %-15d %-15d\n", "Selection", inputType,
                selection.comparisons, selection.swaps);
        System.out.printf("%-10s %-12s %-15d %-15d\n", "Bubble", inputType,
                bubble.comparisons, bubble.swaps);
    }

    // ---------------- MAIN ----------------
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000};

        for (int size : sizes) {
            System.out.println("\nArray Size: " + size);
            System.out.printf("%-10s %-12s %-15s %-15s\n",
                    "Algorithm", "Input", "Comparisons", "Swaps");

            runTest("Increasing", increasingArray(size));
            runTest("Random", randomArray(size));
            runTest("Reverse", reverseArray(size));
        }
    }
}

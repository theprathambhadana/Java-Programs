public class BasicAlgorithms {

    // Linear Search
    public static int linearSearch(int[] arr, int key) {

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    // Binary Search
    public static int binarySearch(int[] arr, int key) {

        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {

            int mid = (start + end) / 2;

            if(arr[mid] == key) {
                return mid;
            }

            if(arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    // Bubble Sort
    public static void bubbleSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            for(int j = 0; j < arr.length - 1 - i; j++) {

                if(arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort
    public static void selectionSort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            for(int j = i + 1; j < arr.length; j++) {

                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] arr) {

        for(int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int prev = i - 1;

            while(prev >= 0 && arr[prev] > current) {
                arr[prev + 1] = arr[prev];
                prev--;
            }

            arr[prev + 1] = current;
        }
    }

    // Counting Sort
    public static void countingSort(int[] arr) {

        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        int count[] = new int[largest + 1];

        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;

        for(int i = 0; i < count.length; i++) {

            while(count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    // Print Array
    public static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr1 = {5, 2, 8, 1, 9};
        int[] arr2 = {5, 2, 8, 1, 9};
        int[] arr3 = {5, 2, 8, 1, 9};
        int[] arr4 = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        System.out.println("Linear Search:");
        System.out.println(linearSearch(arr1, 8));

        System.out.println();

        int[] sorted = {10, 20, 30, 40, 50};
        System.out.println("Binary Search:");
        System.out.println(binarySearch(sorted, 40));

        System.out.println();

        bubbleSort(arr1);
        System.out.println("Bubble Sort:");
        printArray(arr1);

        selectionSort(arr2);
        System.out.println("Selection Sort:");
        printArray(arr2);

        insertionSort(arr3);
        System.out.println("Insertion Sort:");
        printArray(arr3);

        countingSort(arr4);
        System.out.println("Counting Sort:");
        printArray(arr4);
    }
}
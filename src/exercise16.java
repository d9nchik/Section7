public class exercise16 {

    public static void main(String[] args) {
        int[] searchNumbers = {1, 25_000_000, 50_000_000, 75_000_000, 100_000_000};
        int[] numbers = creteNumbers(100_000_000);
        for (int searchNumber : searchNumbers) {
            long startTime = System.nanoTime();
            int result = binarySearch(numbers, searchNumber);
            long endTime = System.nanoTime();
            long executionTime = endTime - startTime;
            System.out.println("Binary search of " + searchNumber + " is " + executionTime + "seconds");
            System.out.println("Result is " + result);

            startTime = System.nanoTime();
            result = linearSearch(numbers, searchNumber);
            endTime = System.nanoTime();
            executionTime = endTime - startTime;
            System.out.println("Linear search of " + searchNumber + " is " + executionTime + "seconds");
            System.out.println("Result is " + result);
        }
    }

    public static int[] creteNumbers(int size) {
        int[] numbers = new int[size];
        for (int k = 0; k < numbers.length; k++) {
            numbers[k] = k + 1;
        }
        return numbers;
    }


    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -low - 1; // Now high < low, key not found
    }

}

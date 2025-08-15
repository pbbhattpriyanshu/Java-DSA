public class ArraySheet {

    // 1 Print all elements of an array Traversal Easy Learn for loops
    public static void print(int arr[]) {

        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    // 2 Find max element Traversal Easy Min/Max logic
    public static void max(int arr[]) {

        // assumption: index 0 has the max element initially
        int maxElement = arr[0];
        int maxIndex = 0;

        // traverse the array
        for (int i = 1; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];

                maxIndex = i; // update index when a new max is found
            }
        }

        // print max element & index
        System.out.println("Max Element: " + maxElement + " at index " + maxIndex);
    }

    // 3 Find min element Traversal Easy Basic comparisons
    public static void min(int arr[]) {
        // assumption: index 0 has the min element initially
        int minElement = arr[0];
        int minIndex = 0;

        // traverse the array
        for (int i = 0; i < arr.length; i++) {
            if (minElement > arr[i]) {
                minElement = arr[i];

                minIndex = i; // update
            }
        }
        // print max element & index
        System.out.println("Min Element: " + minElement + " at index " + minIndex);
    }

    // 4 Sum of elements Traversal Easy Summation logic
    public static void sum(int arr[]) {
        // sum create
        int sum = 0;

        // traverse an array
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i]; // sum update add
        }

        // print sum
        System.out.println("Sum of an array is " + sum);
    }

    // 5 Search element (Linear Search) / Count occurrences of an element Linear
    // Search Easy Brute force search / Frequency counting
    public static void linearSearch(int arr[]) {
        // target
        int target = 2;
        int index = 0;
        int count = 0;
        boolean isTargetFound = false;

        // traverse an array
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                isTargetFound = true;

                index = arr[i];
                count++;
            }
        }

        // condition
        if (isTargetFound == true) {
            System.out.println("Target " + target + " is found at index " + index + " occurs " + count + " times");
        } else {
            System.out.println("Target " + target + " is not found");
        }
    }

    // 6 Reverse an array Two-pointer Easy Index swap logic
    public static void reverse(int arr[]) {
        // two pointer
        int left = 0;
        int right = arr.length - 1;

        // print Original array
        System.out.print("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }

        // reverse an array
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            //move pointers
            left++;
            right--;
        }
        

        // print Reverse array
        System.out.print(" and Reverse array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 11, 3, 4, 2, 5 };
        reverse(arr);
    }
}

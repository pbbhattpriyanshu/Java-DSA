import java.util.Arrays;

public class PracticeSheet07 {
    // Reverse loop
    public static void revrse(int[] arr, int n) {
        // two pointer array
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // traverse
        System.out.println("Reverse Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }

    // MaX Value
    public static void Max(int[] arr, int n) {
        int maxValue = arr[0];

        // loop
        for (int i = 1; i < n; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        System.out.println("Max Value: " + maxValue);
    }

    // Check if array is sorted or not
    public static void CheckSorted(int[] arr, int n) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            } else if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isDescending) {
            System.out.println("Array is Sorted in Descending order");
        } else if (isAscending) {
            System.out.println("Array is Sorted in Ascending order");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    // Move Zero at the end
    public static void MoveZeros(int[] arr, int n) {
        int j = 0;
        // traverse - non zero elements - move starts
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];

                j++;
            }
        }

        // traverse for moving zeros at the end
        for (; j < n; j++) {
            arr[j] = 0;
        }

        // print
        System.out.println("New Array: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Left Rotation by 1
    public static void LeftRotation(int[] arr, int n) {
        // temp variable
        int temp = arr[0];

        // traverse
        for (int i = 0; i < n - 1; i++) {
            // logic
            arr[i] = arr[i + 1];
        }

        // last index add on
        arr[n - 1] = temp;

        // print
        System.out.println("Left Rotate Array by One: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Right Rotation by 1
    public static void RightRotation(int[] arr, int n) {
        // temp variable
        int temp = arr[n - 1];

        // traverse
        for (int i = n - 1; i > 0; i--) {
            // logic
            arr[i] = arr[i - 1];
        }

        // last index add on
        arr[0] = temp;

        // print
        System.out.println("Right Rotate Array by One: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Rotation by K times
    public static void Rotation(int[] arr, int n, int k) {
        k = k % arr.length;
        // K times
        for (int j = 0; j < k; j++) {
            // temp variable
            int temp = arr[0];
            // traverse
            for (int i = 0; i < n - 1; i++) {
                // logic
                arr[i] = arr[i + 1];
            }
            // last index add on
            arr[n - 1] = temp;
        }

        // print
        System.out.println("Rotate Array by k times: ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }

    // Optimize Code of Rotation by k times
    public static void optRotation(int[] arr, int n, int k) {
        int[] temp = new int[arr.length];
        k = k % arr.length;
        // K times
        for (int i = 0; i < n; i++) {
            // logic
            temp[i] = arr[(i + k) % arr.length];
        }

        // print
        System.out.println("Rotate Array by k times: ");
        for (int i = 0; i < n; i++) {
            System.out.println(temp[i]);
        }
    }

    // Remove Duplicates from Sorted Array
    public static void removeDublicate(int arr[]) {
        // print before remove dublicate element
        System.out.println("before remove dublicate element Array " + Arrays.toString(arr));
        // slow pointer
        int j = 0;

        // traverse
        for (int i = 1; i < arr.length; i++) { // found new unique
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; // place unique
            }
        }

        int newLen = j + 1;

        // Print output here
        System.out.println("New length: " + newLen);
        System.out.print("Array after removing duplicates: ");
        for (int k = 0; k < newLen; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println(); // line break
    }

    // Max Subarray
    public static int maxSubarraySum(int[] arr) {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            current += arr[i];

            // update best answer so far
            if (current > maxSum) {
                maxSum = current;
            }

            // if running sum becomes negative, drop it
            if (current < 0) {
                current = 0;
            }
        }

        return maxSum;
    }

    public static void subarraySum(int[] arr, int L, int R) {
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        // build prefix sum array
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // formula
        int sum;
        if (L == 0) {
            sum = prefix[R];
        } else {
            sum = prefix[R] - prefix[L - 1];
        }

        System.out.println("Sum of arr[" + L + "..." + R + "] = " + sum);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // int k = 2;
        // int n = arr.length;

        // check if array is sorted

        // decalre and intialize
        boolean isAscending = true;
        boolean isDescending = true;

        // traverse - access every element
        for (int i = 0; i < arr.length - 1; i++) {
            // condition not desecnding
            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            } else if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }
        }

        // condition - print ascending & decending
        if (isAscending) {
            System.out.println("Array is sorted in Ascending order");
            removeDublicate(arr);
        } else if (isDescending) {
            System.out.println("Array is sorted in Descending order");
            removeDublicate(arr);
        } else {
            System.out.println("Array is not sorted means you can't remove dublicate elements");
        }
    }
}

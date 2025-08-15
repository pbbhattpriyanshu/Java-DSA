public class ArraySheet {

    // 1  Print all elements of an array   Traversal      Easy     Learn for loops
    public static void print(int arr[]) {

        System.out.print("Array: [");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        } 
        System.out.print("]");
    }

    // 2  Find max element   Traversal     Easy    Min/Max logic
    public static void max(int arr[]){

        // assumption: index 0 has the max element initially
        int maxElement = arr[0];
        int maxIndex = 0;

        // traverse the array
        for(int i=1; i<arr.length; i++){
            if (maxElement < arr[i]) {
                maxElement = arr[i];  

                maxIndex = i; // update index when a new max is found              
            }
        }

        // print max element & index
        System.out.println("Max Element: " + maxElement + " at index " + maxIndex);
    }

    // 3 Find min element     Traversal    Easy    Basic comparisons
    public static void min(int arr[]){
        // assumption: index 0 has the min element initially
        int minElement = arr[0];
        int minIndex = 0;

        // traverse the array
        for(int i=0; i<arr.length; i++){
            if (minElement > arr[i]) {
                minElement = arr[i];

                minIndex = i; //update
            }
        }
        // print max element & index
        System.out.println("Min Element: " + minElement + " at index " + minIndex);
    }

    // 4 Sum of elements    Traversal     Easy   Summation logic
    public static void sum(int arr[]){
        //sum create
        int sum = 0;

        //traverse an array
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i]; //sum update add
        }

        //print sum
        System.out.println("Sum of an array is " + sum);
    }

    // 5 Search element (Linear Search)   Linear Search   Easy     Brute force search
    public static void linearSearch(int arr[]){
        //target
        int target = 2;
        int index = 0;
        boolean isTargetFound = false;

        //traverse an array
        for(int i=0; i<arr.length; i++){
            if (target == arr[i]) {
                isTargetFound = true;

                index = arr[i];
            } 
        }

        //condition
        if (isTargetFound == true) {
            System.out.println("Target " + target + " is found at index " + index);
        } else {
            System.out.println("Target " + target + " is not found");
        }
    }
    public static void main(String[] args) {
        int arr [] = {11,3,4,5,6,8,19,4,2,8};
        linearSearch(arr);
    }
}

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
    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,8,19,4,2,8};
        max(arr);
    }
}

import java.util.*;
public class Arrays {

    //Update array 
    // public static void update(int marks[]){
    //     for(int i=0; i<marks.length; i++){
    //         marks[i] = marks[i] + 5;
    //     }
    // }

    // Linear Search 
    // public static int linearSearch(int numbers[], int key){
    //     for(int i=0; i<numbers.length; i++){
    //         if (numbers[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
    // }

    //linear search -- menu
    // public static String linearSearch(String menu[], String order) {
    //     for(int i=0; i<menu.length; i++){
    //         if (menu[i] == order) {
    //             return "Your order is ready";
    //         }
    //     }
    //     return "Your order is not available";
    // }

    //Largest Numbers
    // public static int getLargest(int numbers[]){
    //     int largest = Integer.MIN_VALUE; // -infinity
    //     int smallest = Integer.MAX_VALUE; // +infinity

    //     for(int i=0; i<numbers.length; i++){
    //         if (largest < numbers[i]) {
    //             largest = numbers[i];
    //         }
    //         if (smallest > numbers[i]) {
    //             smallest = numbers[i];
    //         }
    //     }
    //     System.out.println("smallest vaue is : " + smallest);
    //     return largest;
    // }

    //Binary search -- sorted arrays
    // public static int binarySearch(int numbers[], int key) {
    //     int start = 0, end = numbers.length-1;

    //     //loop
    //     while (start <= end) {
    //         int mid = (start + end)/2;

    //         //Comparison 
    //         if (numbers[mid] == key) { // found
    //             return mid;
    //         }
    //         if (numbers[mid] < key) { // right
    //             start = mid+1;
    //         } else { // left
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }

    //Reverse array
    // public static void reverse(int numbers[]) {
    //     int first = 0, last = numbers.length-1;

    //     //loop
    //     while (first < last) {
    //         //swap
    //         int temp = numbers[last];
    //         numbers[last] = numbers[first];
    //         numbers[first] = temp;

    //         first++;
    //         last--;
    //     }
    // }

    //Print pairs
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for(int i=0; i<numbers.length; i++){
            int curr = numbers[i]; //1,2,3,4,5,6,7
            System.out.println(curr);
            for(int j=i; j<numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs " + tp);
    }
    public static void main(String[] args) {
        // //Creating an Array
        // int marks[] = new int [5];
        // //Taking Input   
        // Scanner sc = new Scanner(System.in);

        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy : " + marks[0]);
        // System.out.println("chem : " + marks[1]);
        // System.out.println("math : " + marks[2]);

        // int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        // System.out.println("percentage : " + percentage + "%");
        
        // //Print Length of array
        // System.out.println("length of array : " + marks.length);

        //Passing arrays as arguments
        // Array only by reference

        // int marks[] = {56,76,33};
        // update(marks);

        //print our marks
        // for(int i=0; i<marks.length; i++){
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();

        //Linear Search
        // int numbers[] = {2,4,6,7,3,10,11,9,8,1,13,12};
        // int key = 10;

        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key is at index : " + index);
        // }

        //linear search - menu 
        // String menu[] = {"dosa","idli","vada","upma","poha","puri","paratha","biryani","dal","paneer","chole bhature"};
        // String order = "mango";

        // System.out.println(linearSearch(menu, order));

        // System.out.println("largest value is : " + getLargest(numbers));

        //Sorted arrays
    //     int numbers[] = {2,4,6,8,10,12,14,16,18,20};
    //     int key = 16;
    //     int index = binarySearch (numbers, key);
    //     if (index == -1) {
    //         System.out.println("Not found");
    //     } else {
    //         System.out.println("Index for key is : " + index);
    //     }

    //Reverse an Array
    //  int numbers[] = {2,4,6,8,10,12,14};
    //  System.out.println("Before Reverse");
    //  for(int i=0; i<numbers.length; i++){
    //     System.out.print(numbers[i]+" ");
    //  }
    //  System.out.println();

    //  reverse(numbers);
    //  System.out.println("After Reverse");
    //  for(int i=0; i<numbers.length; i++) {
    //     System.out.print(numbers[i]+" ");
    //  }
    //  System.out.println();

    //Pairs in Arrays
    int numbers[] = {1,2,3,4,5};
    printPairs(numbers);

    }
}

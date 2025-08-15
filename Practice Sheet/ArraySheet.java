public class ArraySheet {

    // 1  Print all elements of an array   Traversal      Easy     Learn for loops
    public static void print(int arr[]) {

        System.out.print("Array: [");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        } 
        System.out.print("]");
    }


    public static void main(String[] args) {
        int arr [] = {1,3,4,5,6,8,9,4,2};
        print(arr);
    }
}

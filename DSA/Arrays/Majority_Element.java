import java.util.Scanner;

public class Majority_Element {
    // Description : The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
    public static int majorityElement(int[] nums) {
        int count = 1;
        int ans = nums[0];

        for(int i=1; i<nums.length; i++){
            if(count == 0) {
                ans = nums[i];
                count = 1;
            } else if(ans == nums[i]) count ++;
            else count --;
        }

        return ans;
    }
    public static void main(String[] args) {
        // Create an Array by taking Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of an arry: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Access every index to take input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value in " + i + " index: ");
            arr[i] = sc.nextInt();
        }

        int result = majorityElement(arr); // Store the result
        System.out.println("Majority Element: " + result); // Print the result
        sc.close();
    }
}

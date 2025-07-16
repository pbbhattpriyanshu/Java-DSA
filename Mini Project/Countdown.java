import java.util.*;
public class Countdown {
    public static void main(String[] args) {
        // Countdown app - for loop
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number for countdown: ");
        int max = sc.nextInt();

        for(int i = max; i>=0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        } 

        System.out.println("BOOM!💥💥");

        sc.close();
    }
}

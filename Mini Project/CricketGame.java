import java.util.*;

public class CricketGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // WELCOME
        System.out.println("Welcome to the Cricket Game!");

        // Batting
        int runs = 0, balls = 0;
        System.out.println("\nStart Batting! (Press Enter to play each ball)");
        while (true) {
            System.out.print("Press Enter to bowl...");
            sc.nextLine();
            int ball = rand.nextInt(9); // 0 to 8
            if (ball == 5) {
                System.out.println("You got OUT on " + ball + "!");
                break;
            } else if (ball == 7) {
                System.out.println("Wide ball! +1 run (No ball counted)");
                runs++;
                continue;
            } else if (ball == 8) {
                System.out.println("No ball! +1 run (No ball counted)");
                runs++;
                continue;
            } else if (ball == 0) {
                System.out.println("No run (dot ball).");
                balls++;
            } else {
                System.out.println("You scored " + ball + " run(s)!");
                runs += ball;
                balls++;
            }
        }
        System.out.println("\nYour innings is over!");
        System.out.println("Total runs: " + runs + " in " + balls + " balls.");

        sc.close();
    }
}
import java.util.*;
public class MadLibsGame {
    public static void main(String[] args) {
        // MAD LIBS GAME
        Scanner sc = new Scanner(System.in);

       String name, adjective1, noun1, verb1, adjective2, noun2, verb2, adjective3;

        System.out.print("Enter a friend's name: ");
        name = sc.nextLine();
        System.out.print("Enter an adjective: ");
        adjective1 = sc.nextLine();
        System.out.print("Enter a silly noun: ");
        noun1 = sc.nextLine();
        System.out.print("Enter a verb ending with -ing: ");
        verb1 = sc.nextLine();
        System.out.print("Enter another adjective: ");
        adjective2 = sc.nextLine();
        System.out.print("Enter another noun: ");
        noun2 = sc.nextLine();
        System.out.print("Enter another verb ending with -ing: ");
        verb2 = sc.nextLine();
        System.out.print("Enter one more adjective: ");
        adjective3 = sc.nextLine();

        System.out.println("\n--- The Roast of " + name + " ---");
        System.out.println(name + " walked in looking as " + adjective1 + " as a " + noun1 + ".");
        System.out.println("Everyone started " + verb1 + " because they couldn't believe how " + adjective2 + " " + name + " looked.");
        System.out.println("Even the " + noun2 + " stopped " + verb2 + " just to stare!");
        System.out.println("But don't worry, " + name + ", we all know you're the most " + adjective3 + " person in the room... at least that's what your mom says!");
        System.out.println("All jokes aside, you're awesome, " + name + "!");

        sc.close();

    }
}

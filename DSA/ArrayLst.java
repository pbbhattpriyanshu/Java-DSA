// ArrayList
import java.util.ArrayList;

public class ArrayLst {
    public static void main(String[] args) {
        // Define Syantax
        ArrayList<String> list = new ArrayList<>();

        // Add element
        list.add("Avengers"); // index-0
        list.add("Civil war"); // index-1
        list.add("Infinity war"); // index-2 
        list.add("Endgame"); // index-3

        // Add at index - 0(1)
        list.add(1, "Captain america Winter Soldier");
        System.out.println(list);

        // Get Operation - 0(1)
        String movie =  list.get(3);
        System.out.println("I want to watch "+ movie);

        // Delete
        list.remove(3);
        System.out.println(list);

        // Set
        list.set(2, "Thor Ragnorok");
        System.out.println(list);           // -- Updated list

        // Contains -- Check the item on the list
        // System.out.println(list.contains("Endgame")); //true
        // System.out.println(list.contains("Civil war")); //false

        // Size
        System.out.println("The size of arrayList is " + list.size());

        // print the arrayList - loop
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(i + "." + list.get(i));
        };

    }
}

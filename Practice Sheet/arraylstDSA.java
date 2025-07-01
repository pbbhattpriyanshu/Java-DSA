import java.util.*;
public class arraylstDSA {
    public static void main(String[] args) {
        // DSA -- ArrayList Practice Sheet

        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(8);

        // print max value in list
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        
        for(int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        System.out.println("max value: " + max);
    }
}

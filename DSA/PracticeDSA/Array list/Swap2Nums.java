import java.util.ArrayList;

public class Swap2Nums {

    //Swap function
    public static void swap(ArrayList<Integer> list, int indx1, int indx2) {
        int temp = list.get(indx1);
        list.set(indx1, list.get(indx2));
        list.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(1);

        int indx1 = 1, indx2 = 3;
        System.out.println("before: " + list);
        swap(list, indx1, indx2);
        System.out.println("After: " + list);
    }
}

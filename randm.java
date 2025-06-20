import java.util.Random;

public class randm {
    public static void main(String[] args) {

        Random rndm = new Random();

        int dice1 = rndm.nextInt(1,7);
        double dice2 = rndm.nextDouble(1,7);

        System.out.println(dice1);
        System.out.println(dice2);
    }
}

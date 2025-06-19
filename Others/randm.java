package Others;

import java.util.Random;
import java.util.random.*;

public class randm {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1,5);

        System.out.println(num);
    }
}

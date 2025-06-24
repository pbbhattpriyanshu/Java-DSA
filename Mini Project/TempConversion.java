import java.util.Scanner;

public class TempConversion {
    public static void main(String[] args) {
        // Temperature Convertor
        Scanner sc = new Scanner(System.in);

        // Declare variable
        double temp;
        double newTemp;
        String unit;

        // Input
        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();

        // variable = (condition)? true : false
        newTemp = (unit.equals("C"))? (temp - 32) * 5 / 9: (temp * 5 / 9) + 32;

        // output
        System.out.println(newTemp + "°" + unit);

        sc.close();
    }
}

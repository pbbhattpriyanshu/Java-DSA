class Calc{
    //Addition
    public int add(int a, int b){
        return a + b;
    }

    //Subtraction
    public int sub(int a, int b){
        return a - b;
    }

    //Multiplication
    public int mul(int a, int b){
        return a * b;
    }

    //Divide
    public int div(int a, int b){
        return a/b;
    }
}

class advCalc extends Calc {
    //Square
    public int sq(int num){
        return num * num;
    }

    //Power
    public double pow(int num, int power){
        return Math.pow(num, power);
    }

    //Square root
    public double sqrt(int num){
        return Math.sqrt(num);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        advCalc obj2 = new advCalc();
        int ans = obj1.add(23, 45);
        int ans1 = obj2.add(23,44);
        
        System.out.println(ans);
        System.out.println(ans1);
    }
}

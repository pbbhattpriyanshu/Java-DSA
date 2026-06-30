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

//Super() - Keywords
class A {
    //Parameterized Constructor
    A(String name){
        //System.out.println("in A class there is " + name);
    }

    A(){
        //System.out.println("in A class");
    }

    //Methods
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config");
    }
}

class B extends A {
    //No-Argument Constructor
    B(){
        //super("Puish"); //super() - Argument
        //System.out.println("in B class");
    }
    B(int age){
        this(); //this class -> constructor call = "in B class"
        //System.out.println("my age is " + age);
    }

    //Methods - method overriding - show().
    public void show(){
        System.out.println("in B show");
    }
}

class C extends B{
    //No-Argument Constructor = super() - write optional, default java automatically write 
    C(){
        //super(21);
        //System.out.println("in C class");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        advCalc obj2 = new advCalc();
        int ans = obj1.add(23, 45);
        int ans1 = obj2.add(23,44);
        
        //System.out.println(ans);
        //System.out.println(ans1);

        C obj3 = new C();
        B obj4 = new B();
        obj4.show();
        obj4.config();
    }
}

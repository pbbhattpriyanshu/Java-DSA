class Computer{
    //method
    void screen(){
        System.out.println("Computer has big screen");
    }
}

class Laptop extends Computer{
    @Override //method overriding
    void screen(){
        System.out.println("Laptop has small screen");
    }
}

//Method overloading
class Phone {
    int add(int a, int b){
        return a + b;
    }

    int add(int a, int b, int c){
        return a + b + c;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Computer obj1 = new Laptop();
        obj1.screen();

        Phone obj2 = new Phone();
        System.out.println(obj2.add(23, 1));
        System.out.println(obj2.add(2, 4, 6));
    }
}

class Computer{
    public void screen(){
        System.out.println("Computer has big screen");
    }
}

class Laptop extends Computer{
    
}

public class Polymorphism {
    public static void main(String[] args) {
        Computer obj1 = new Laptop();
        obj1.screen();
    }
}

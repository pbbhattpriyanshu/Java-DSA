/* Abstraction = Concepts in OOPs - hides implementation details and exposes only essential functionality
abstract keyword = Tool */

abstract class car{
    abstract void drive();
    abstract void fly();
    void playMusic(){
        System.out.println("playing music");
    }
    void ac(){
        System.out.println("AC is turn on");
    }
}

abstract class BMWX1 extends car{
    void drive(){
        System.out.println("Driving....");
    }
}

class BMWX2 extends BMWX1{        //Concrete class
    void fly(){
        System.out.println("Not Flying only jump");
    }
}

public class abstraction {
    public static void main(String[] args) {
        BMWX2 car1 = new BMWX2();
        car1.fly();
    }
}

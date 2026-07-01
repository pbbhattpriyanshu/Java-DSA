// Final keyword - Variable, Methods, Class

/*final*/class real{
    /*final*/void show(){
        System.out.println("by piyush");
    }

    void add(int a, int b){
        System.out.println(a + b);
    }
}

//inheritance 
class dummy extends real{ //The type dummy cannot subclass the final class real 
    //by john to stop overriding i just want to add final in super class method
    void show(){
        System.out.println("by john");
    }
}

public class Final {
    public static void main(String[] args) {
        final int num = 23;
        //num = 45;
        //System.out.println(num);

        dummy obj1 = new dummy();
        obj1.show();
    }
}

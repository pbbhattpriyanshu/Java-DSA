//class calculator
class calculator {
    int num = 7;

    public int add(int a, int b) {
        System.out.println(num); // 7
        return a + b;
    }
}

// class Employee Id
class Employee {
    int id = 1234;
    String name;
    String department = "Backend + Cloud Engineer";
    private int Salary = 150000;
    private String Address = "Sector 62";
    private String Signature;

    //Methods - values = set & get
    public int getSalary() {
        return Salary;
    }
    public String getAddress() {
        return Address;
    }
    public void setName(String n) {
        name = n;
    }
    public void setSignature(String sign) {
        Signature = sign;
    }
    public String getSignature() {
        return Signature;
    }
}

// class test
class Test {
    public static void main(String[] args) {
        Employee obj = new Employee();
        
        obj.setName("Piyush");
        obj.setSignature("108PB");
        System.out.println(obj.name);
        System.out.println(obj.getSignature());
    }
}

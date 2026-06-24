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
    String name = "Piyush";
    String department = "Backend + Cloud Engineer";
    private int Salary = 150000;
    private String Address = "Sector 62";

    public int getSalary() {
        return Salary;
    }
    public String getAddress() {
        return Address;
    }
}

// class test
class Test {
    public static void main(String[] args) {
        Employee obj = new Employee();

        System.out.println(obj.getSalary());
    }
}

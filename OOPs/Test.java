// class Employee Id
class Employee {
    int id = 1234;
    String name;
    String department = "Backend + Cloud Engineer";
    private int Salary = 150000;
    private String Address = "Sector 62";
    private String Signature;
    private String Degree;
    private Double CGPA;
    String company = "Google";
    // Constructor
    Employee() {
        System.out.println("This is the information of Employee");
    }

    public Employee(String deg, double grade) {
        Degree = deg;
        CGPA = grade;
    }

    // Methods - values = set & get
    public int getSalary() {
        return Salary;
    }

    public String getDegree() {
        return Degree;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String name) {
        this.name = name;
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
        Employee obj1 = new Employee("BCA", 7.1);

        obj.setName("Piyush");
        obj.setSignature("108PB");
        System.out.println(obj.name);
        System.out.println(obj.getSignature());
        System.out.println(obj.company);
        obj.company = "Microsoft";
        System.out.println(obj.company); //Microsoft
        System.out.println(obj1.company); //Google
    }
}

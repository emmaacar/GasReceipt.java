package Encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 =new Employee(" Tahir",'M',30,110000);

        employee1.setAge(32);

        System.out.println(employee1);

        Employee employee2 =new Employee("Aygun",'F',35,152000);

        employee2.setSalary(employee2.getSalary()+1500);
        employee2.setName("Necla");
        System.out.println(employee2);
    }
}

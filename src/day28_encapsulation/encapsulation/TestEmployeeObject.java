package day28_encapsulation.encapsulation;

public class TestEmployeeObject {
    public static void main(String[] args) {
/*
        Employee employee1 = new Employee();

        employee1.setSalary(1000000);

        System.out.println(employee1.getSalary());

        employee1.setName("        ");

        System.out.println(employee1.getName());

        employee1.setAge(13);
        */
        Employee employee2 = new Employee("Ayse", 41, "developer", 100000 );

        System.out.println(employee2);
    }
}

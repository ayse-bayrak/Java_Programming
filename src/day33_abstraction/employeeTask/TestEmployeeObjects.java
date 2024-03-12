package day33_abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        //Employee employee = new Employee("Ayse", 41, 'F', "12", "SDET", 100000);
        // we can not create objects from an abstract class, object  MUST be created from a concrete class
        // Concret class is extending this abstract class, child of abstract class
        // for example Teacher class

        Teacher teacher = new Teacher("James", 45, 'M', "B1", "Math Teacher", 75000);
        Developer developer = new Developer ("Lucy", 30, 'F', "C1", "Java Developer", 100000, "Java");
        // it is a concrete class, it is the child class of this abstract class employee and this child class is not an abstract
        // if it is regular class that is extending employee, then it is the concrete class

        Driver driver = new Driver("Aeron", 48, 'M', "D1", "Truck Driver", 90000);

        Tester tester = new Tester("Emiliy", 35, 'F', "E1", "Manuel Tester", 80000);

        System.out.println(teacher);
        System.out.println(developer);
        System.out.println(driver);
        System.out.println(tester);

        System.out.println("=============================================================");

        // different implementations are being executed when we called work() method (abstract) for each of those objects
        teacher.work();
        developer.work();
        teacher.work();
        driver.work();

    }
}

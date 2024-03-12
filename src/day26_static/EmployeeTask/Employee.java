package day26_static.EmployeeTask;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public double salary;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, char gender) {
       this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, char gender, double salary) {
        this(name, jobTitle, gender);
        this.salary = salary;
    }

    public Employee(String name, String jobTitle) {
        this(name);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, double salary) {
        this(name, jobTitle);
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }
}
/*
Class Name: Employee
	Instance variables:
			name, gender, jobTitle, salary

		1st cosntructor: initializes the name only

		2nd constructor: initializes name and gender

		3rd constructor: initializes name, gender and jobTitle

		4th constructor initializes name, gender, jobTitle, Salary

		5th constructor: initializes name, jobTitle

		6th constructor: initializes banem jobTitle, salary

	Instnace methods:
		toString
 */
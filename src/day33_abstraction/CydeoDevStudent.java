package day33_abstraction;

import day32_finalKeyword.personTask.Person;

import java.sql.SQLOutput;
import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;  // final variables, they do not have default value,
    // so if you do not initialize give you error, so you must initialize, since it is private variable,
    // you must  only initialize with constructor

    private String batchName; // non-final and private
    private int batchNumber; // non-final and private
    public static final String programmingLanguage;// I don't want to the value of programming language to change after that,
    // So I declare it as final, static and final variable
    // final variables, they do not have default value, they has to be instantiated before you use them, so if you do not initialize give you error
    // so you must initialize

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {
        super(name, gender, dateOfBirth);
        // inherit parent class
        if (getAge() < 18 ){ // if age is set to less than 18
            System.err.println("Cydeo Developer Student must be at least 18 years old");
            System.exit(1);
        }
        this.id = id;   // unique final variable
        setBatchName(batchName); // unique non-final variable
        setBatchNumber(batchNumber); // unique  non-final variable
    }

    // constructor contains instance variables with private, public etc. any access modifier , final variable,
    // does not contain static variable
    // you create getter for any private variable, it does not matter final or not
    // so we have 3 getter

    static {
        programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }
    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    // you can only create setter for non-final private variables
    // so we have 2 setter

    public void setBatchName(String batchName) {
        if (!(batchName.equalsIgnoreCase("zero to hero")|| batchName.equalsIgnoreCase("alumni dev"))) {
            this.batchName = batchName;
        }else {// otherwise: if the batch name is invalid
            System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
            System.exit(1);
        }

    }

    public void setBatchNumber(int batchNumber) {
        if (batchNumber <= 0) {
            System.err.println("Invalid batch number: " + batchNumber + "\nBatch number can not be negative or zero");
            System.exit(1);
        }

        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating " + programmingLanguage);
    }

    @Override
    public void drink() {
        System.out.println(getName() + " is drinking " + programmingLanguage);
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" does not need to sleep");
    }

    @Override
    public String toString() {
        return "CydeoDevStudent{" +
                "name='" + getName() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", dateOfBirth=" + getDateOfBirth() +
                ", id='" + id + '\'' +
                ", batchName='" + batchName + '\'' +
                ", batchNumber=" + batchNumber +
                '}';
    }
}

/*
Warmup tasks:
	1. Create a sub class of Person (from day32 package) named CydeoDevStudent (final)
			Extra Variables:
				id (final), batchName, batchNumber, programmingLanguage(static & final)

			Extra conditions:
					1. Age has to be at least 18 years old
					2. batchName can ONLY be set to "Zero to Hero" or "Alumni Dev"
					3. batchNumber can not be set to zero or negative

			Override the eat() & drink() methods and include the programmingLanguage variable in methods body

			Override the toString Method and include the id, batchName, batchNumber variables
 */
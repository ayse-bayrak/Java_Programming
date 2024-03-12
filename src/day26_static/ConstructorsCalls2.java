package day26_static;

public class ConstructorsCalls2 {

    public ConstructorsCalls2() { // Default
        System.out.println("Default");
    }
    public ConstructorsCalls2(int age) { // Default, int arg
        this();// calling the default constructor
        System.out.println("int arg");
    }
    public ConstructorsCalls2(String a) { // Default, int arg, String arg
        this(10); // calling the constructor with int arg
        System.out.println("String arg");
    }

    public static void main(String[] args) {

        ConstructorsCalls2 obj1 = new ConstructorsCalls2();

        System.out.println("---------------------------------");
        // Default

        ConstructorsCalls2 obj2 = new ConstructorsCalls2(10);

        System.out.println("---------------------------------");
        // Default, int arg

        ConstructorsCalls2 obj3 = new ConstructorsCalls2("Java");

        System.out.println("---------------------------------");
        // Default, int arg, String arg
    }
 }


/*
this: refers to the instances

	this. : to call instance variables & instance methods
	this(): used for calling constructors in another constructor


Constructor Calls:
		1. Constructors can not be called by its name ( this() need to be used)
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself

 */
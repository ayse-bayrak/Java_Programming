package day26_static;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this(9);  //Constructor can not call or contain itself
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a){
        this();
        System.out.println("Constructor with int argument");
        //  this(); // constructor call has to be at the first step
    }


    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }


    public ConstructorCalls(String c){
        this(2.5);
        // this(); //Constructor call MUST be at the first step
        System.out.println("Constructor with String argument");
    }


    public static void main(String[] args) {

        method1();

        System.out.println("----------------------------");

        method2();

    }


    public static void method1(){
        // ConstructorCalls();//Only a constructor can call another constructor
        // this();//Only a constructor can call another constructor
        System.out.println("Method 1");
    }

    public static void method2(){
        System.out.println("Method 2");
        method1();
        // method2();
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
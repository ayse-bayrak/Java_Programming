package day27_acsessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    // if you have any instance variables, you will use Constructor to initialize it.
    //if you have any static variables, you will use Stattic Block to initizlize it
    //The instance block probably will never use it. Because Constructor can do everything.
    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");
    }

    static{
        System.out.println("Static Block");
    }


    public static void main(String[] args) {

        System.out.println("Main Method");

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
        new StaticBlock_vs_InstanceBlock_vs_Constructor();

    }
}
/*
output
Static Block
Main Method
Instance Block
Constructor
Instance Block
Constructor

explanation :
StaticBlock_vs_InstanceBlock_vs_Constructor
-static block only gets executed once.
-main block gets executed only one time
-constructor and instance block gets executed whenever we create object
-instance block can nopt take argumenet
-constructor can take argument

 */
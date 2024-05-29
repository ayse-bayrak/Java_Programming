package day27_acsessModifiers;

public class InstanceBlock  {

    {
        System.out.println("Instance Block");
    }

    public InstanceBlock() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new InstanceBlock();  // instance block is executed before constructor
        new InstanceBlock();
        new InstanceBlock();
    }
}

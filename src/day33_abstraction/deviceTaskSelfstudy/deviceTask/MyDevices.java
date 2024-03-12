package day33_abstraction.deviceTaskSelfstudy.deviceTask;

public class MyDevices {
    public static void main(String[] args) {
        IPhone iphone = new IPhone("14", "+", "White", "medium", 1000, true, true);
        Nokia nokia = new Nokia("3310", "S", "red", "small", 50, true, true);
        iphone.turnOn();
        nokia.turnOn();
        iphone.turnOff();
        nokia.turnOff();
        iphone.call(66423462);
        nokia.call(66423462);
        iphone.text(872346);
        nokia.text(872346);

        System.out.println("=========================================");

        System.out.println(iphone);
        System.out.println(nokia);



    }
}
/*
Create a class named MyDevices:
			Create the objects of each subclasses and

			test all the functions of each object

            Analyze the relationships between the classes

 */
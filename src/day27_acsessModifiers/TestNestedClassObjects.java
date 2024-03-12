package day27_acsessModifiers;

public class TestNestedClassObjects {

    public static void main(String[] args) {

        Car obj1 = new Car(); // Car object
        // object from outer class
        Car.CarEngine obj2 = obj1.new CarEngine(); // Car engine object, since inner class is instance method, we call through the object
// object from instance inner class
        Car.StaticInnerClass obj3 = new Car.StaticInnerClass();
// object from static inner class

        /*Creating object in inner class could be little trick, It depends on if the inner class is static or non-static
If the inner class is static, you could create object using  new keyword and inner class constructor
if the inner class is non-static you have to have the outer class object and then through the outer class object

 */

    }


}

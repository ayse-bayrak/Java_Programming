package day38_exceptions;
class CustomCheckedException extends Exception { // I want this class to be a checked exception, need to inherit Exception class

}
class CustomUncheckedException extends RuntimeException{ // this is for unchecked exceptions

}

public class CustomExceptions {
    public static void main(String[] args) {

        try {
            throw  new CustomCheckedException(); // give me error because extends to Exceptions class
        } catch (CustomCheckedException e) {
            e.printStackTrace();
        }

        System.out.println("==============================");
        throw new CustomUncheckedException();// do not give me error because extends to RunTimeExceptions class

    }
}

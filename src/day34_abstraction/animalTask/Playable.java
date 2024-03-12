package day34_abstraction.animalTask;

public interface Playable {

    // every single variable has to be static and final

   boolean isFriendly = true; // default it will be static and final,

    // so  we have to initilaize only way option that you have is set by this operator.
    // you don't have to  'public static final' it will be default

   /*
   public static void main(String[] args) {
      System.out.println(isFriendly);
   }

   default void method1(){

   }

   static method and default method are optional but abstract method is MUST in interface
*/

   void play(); // abstract ,in interface abstract method is  A MUST.

}

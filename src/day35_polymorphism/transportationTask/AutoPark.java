package day35_polymorphism.transportationTask;

public interface AutoPark {
    boolean hasAutoPark = true; // since it is final (by default) is Must initialize, whenever we van use it.
    // can I use constructor or static blocks in this interface, i can not,
    // because constructor and blocks are not allowed in interface, so i can initialize it right away, in line 5.

    // public static final boolean hasAutoPark = true; in there it si not necessary "public static final"
    // because any variable that you give in interface "public static final" are given by default
    void autoPark (); // abstract method
}
/*
	2. Create an interface named AutoPark

				abstract methods:
					autoPark()
 */
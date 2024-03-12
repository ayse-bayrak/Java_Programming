package day25_constructer;

import java.time.LocalDate;

public class PersonTestObjects {
    public static void main(String[] args) {
        Person p1 = new Person("Ayse", 41, 'F', LocalDate.of(1982, 10, 21), true, false);

    p1.drinking("milk");
        p1.eat("strawbery");
        p1.sleeping();
    }
}

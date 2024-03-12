package day27_acsessModifiers;

import javax.sound.midi.Soundbank;

public class StaticBlock {

    public StaticBlock() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block1");
    }
// always firstly static blocks gets executed

    public static void main(String[] args) {
        System.out.println("Main Method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static {
        System.out.println("Static block2");
    }
// always firstly static blockss gets executed
}

package day30_inheritance.Phone;

public class TestPhone {

    public static void main(String[] args) {


        IPhone iphone = new IPhone("14+", "large", "White", 1000);

        System.out.println(iphone);
        iphone.call(5333218212l); // common method
        iphone.text(5333218212l); // common method

        iphone.text(5333218212l); // common method


        iphone.faceTime("aysegunes");
        iphone.faceTime(5323218212l);

        Samsung samsung = new Samsung("Note10", "Medium", "Black", 900);
        samsung.call(5333218212l); // common method
        samsung.text(5333218212l); // common method

        System.out.println(samsung);
        samsung.freeze();

        Nokia nokia = new Nokia("3310","Small", "Red", 800);

        System.out.println(nokia);
        nokia.selfDefense();

    }

    }


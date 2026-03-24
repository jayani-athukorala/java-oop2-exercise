package se.lexicon;

import se.lexicon.task1.*;

public class Test {

    static void main() {
        IO.println("------------Exercise 1---------------");
        Service service1 = new SummerTireChange();
        IO.println(service1);
        Service service2 = new WinterTireChange();
        IO.println(service2);

    }


}

package org.sdteam.parcey;

import java.time.Instant;
import java.util.Date;

public class TutorialForNoobs {
    String name;

    TutorialForNoobs(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "TutorialForNoobs: " + name;
    }

    public static void main(String[] args) {
        TutorialForNoobs tutorial1 = new TutorialForNoobs("Vladimir");
        TutorialForNoobs tutorial2 = new TutorialForNoobs("Sergey");
        TutorialForNoobs tutorial3 = new TutorialForNoobs("Aleksey");
        System.out.println("\n" + tutorial1);
        System.out.println(tutorial2);
        System.out.println(tutorial3);
        System.out.printf("\nHello NOOBS! Today is %s! You can sea my FunCode!\n", Date.from(Instant.now()));
    }
}

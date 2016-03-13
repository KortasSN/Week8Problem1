package com.josh;
import java.util.*;
/**
 * Created by kortasthekiller on 3/13/16.
 */
public class PetManager {

    public static void main(String args[]) {

        Pet molly =
                new Pet("Molly", "cat", "100 Main Street", 2);

        molly.addDays("Monday");
        molly.addDays("Tuesday");
        molly.addDays("Wednesday");
        molly.output();

        Pet nina =
                new Pet("Nina", "dog", "1234 Broad Street", 1);

        nina.addDays("Tuesday");
        nina.addDays("Wednesday");
        nina.output();


        Pet bob =
                new Pet("Bob", "parrot", "456 2nd Ave", 1);

        bob.addDays("Wednesday");
        bob.output();

        Pet coco =
                new Pet("Coco", "cat", "789 Newton Ave", 1);

        coco.addDays("Wednesday");
        coco.addDays("Thursday");
        coco.output();

        Pet megan =
                new Pet("Megan", "dog", "765 Upton Ave", 1);

        megan.addDays("Wednesday");
        megan.addDays("Thursday");
        megan.output();

        Pet sam =
                new Pet("Sam", "dog", "345 Pleasant Ave", 2);

        sam.addDays("Wednesday");
        sam.addDays("Thursday");
        sam.addDays("Friday");
        sam.output();




    }




}

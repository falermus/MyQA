package Soal1;

import java.util.ArrayList;

public class Main {
    public static int mySquare(int input) {
        return (input * input);
    }

    public static void isEven(int input) {
        if((input % 2) == 0) {
            System.out.println(input + " is an even number.");
        }
        else {
            System.out.println(input + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        /*
         * Variables
         */
        String sentence1 = "This string ";
        String sentence2 = "barely can ";
        String sentence3 = "be a sentence. ";

        String sentenceFull = sentence1 + sentence2 + sentence3;
        System.out.println(sentenceFull);

        String namaSaya = "Falery Mustika";
        System.out.println(namaSaya);
        namaSaya = "Mustika Falery";
        System.out.println(namaSaya);

        double panjang = (double)34.7;
        double tinggi = (double)64.9;
        double luas = (panjang * tinggi)/((double)2);
        System.out.println(luas);

        boolean myLogic1 = ((10 < 5) && (6 > 4));
        System.out.println(myLogic1);

        boolean myLogic2 = !((3 > 2) && (4 > 3));
        System.out.println(myLogic2);

        boolean myLogic3 = !((3 < 2) || (4 < 3));
        System.out.println(myLogic3);

        /*
         * Function
         */
        int squareTest = mySquare(6);
        System.out.println(squareTest);

        /*
         * Loop
         */
        for(int i = 100; i > 0; i--) {
            System.out.println("Count down " + i);
        }

        /*
         * Conditional
         */
        int varCond1 = 11;
        int varCond2 = 12;
        int varCond3 = 13;
        int varCond4 = 14;

        isEven(varCond1);
        isEven(varCond2);
        isEven(varCond3);
        isEven(varCond4);

        /*
         * Data Structure
         */

        ArrayList<Integer> myInteger = new ArrayList<>();
        myInteger.add(105);
        myInteger.add(127);
        myInteger.add(267);
        myInteger.add(375);
        myInteger.add(432);
        myInteger.add(465);
        myInteger.add(521);
        myInteger.add(532);
        myInteger.add(678);
        myInteger.add(692);

        for (Integer thisList:

             myInteger) {
            System.out.println(thisList);

        }

        /*
         * Object
         */
        Animal theAnimal = new Animal(true, "Beast", 5);
        System.out.println(theAnimal.isAlive);
        System.out.println(theAnimal.name);
        System.out.println(theAnimal.age);

        /*
         * Polymorphism
         */

        Dog theDog = new Dog();
        theDog.setAlive(true);
        theDog.setName("Spikey");
        theDog.setAge(3);
        System.out.println(theDog.isAlive);
        System.out.println(theDog.name);
        System.out.println(theDog.age);
        System.out.println(theDog.bark());

        Cat theCat = new Cat();
        theCat.setAlive(true);
        theCat.setName("Fuzzy");
        theCat.setAge(2);
        System.out.println(theCat.isAlive);
        System.out.println(theCat.name);
        System.out.println(theCat.age);
        System.out.println(theCat.meow());
    }
}

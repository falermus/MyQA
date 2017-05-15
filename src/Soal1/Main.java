package Soal1;

import java.util.ArrayList;

/**
 * Created by falerymustika on 5/15/17.
 */
public class Main {

    public class Animal {
        boolean isAlive;
        String name;
        int age;
        Animal() {
            isAlive = true;
            name = "Unknown";
            age = 0;
            //System.out.println("Is it alive? " + isAlive + "\nIts name is" + name + "\nIts age is " + age + "year(s) old");
        }

        Animal(boolean isItAlive, String itsName, int itsAge) {
            isAlive = isItAlive;
            name = itsName;
            age = itsAge;
            System.out.println("Is it alive? " + isAlive + "\nIts name is" + name + "\nIts age is " + age + "year(s) old");
        }
    }

    public class Dog extends Animal {
        public String bark;
        Dog() {
            bark = "woof";
        }
    }

    public class Cat extends Animal {
        public String meow;
        Cat() {
            meow = "meow";
        }
    }

    public static int mySquare(int input) {
        return (input * input);
    }

    public static void isEven(int input) {
        if((input % 2) == 0) {
            System.out.println(input + " is an even number.");
        }
        else {
            System.out.println(input + " is an odd number");
        }
    }

    public void main(String[] args) {
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

        boolean myLogic = ((10 < 5) && (6 > 4));
        System.out.println(myLogic);

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
         * Polymorphism
         */

        Dog theDog = new Dog();
        System.out.println(theDog.bark);

        Cat theCat = new Cat();
        System.out.println(theCat.meow);
    }
}

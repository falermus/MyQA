package Soal1;

public class Animal {
    public boolean isAlive;
    public String name;
    public int age;

    public void setName(String inName) {
        name = inName;
    }

    public void setAge(int inAge) {
        age = inAge;
    }

    public void setAlive(boolean inAlive) {
        isAlive = inAlive;
    }

    public void setAttributes(boolean isItAlive, String itsName, int itsAge) {
        setAlive(isItAlive);
        setName(itsName);
        setAge(itsAge);
    }

    public void showAttributes() {
        System.out.println(name + " " + age + " year(s) old " + isAlive + " alive");
    }

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
        //System.out.println("Is it alive? " + isAlive + "\nIts name is" + name + "\nIts age is " + age + "year(s) old");
    }
}

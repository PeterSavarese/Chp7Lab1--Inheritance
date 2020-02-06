// ************************************************************
// Peter Savarese
// 2/5/2020
// Dog.java
// 1.0.0
// A class that holds a dog's name and can make it speak.
//
// ****************************************************************

public class Dog {
    protected String name;

    // ------------------------------------------------------------
    // Constructor -- store name
    // ------------------------------------------------------------
    public Dog(String name) {
        this.name = name;
    }

    // ------------------------------------------------------------
    // Returns the dog's name
    // ------------------------------------------------------------
    public String getName() {
        return name;
    }

    // ------------------------------------------------------------
    // Returns a string with the dog's comments
    // ------------------------------------------------------------
    public String speak() {
        return "Woof";
    }
}
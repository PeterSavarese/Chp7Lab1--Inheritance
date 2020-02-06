// ************************************************************
// Programmer Name:
// Date:
// File Name: DogTest.java
// Version:
// Code Description: A simple test class that creates a Dog and makes it 
// speak.
//
// ****************************************************************
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Spike");
        System.out.println(dog.getName() + " says " + dog.speak());
        
        Labrador lab = new Labrador("Buttercup", "brown");
        System.out.println("Avg. Weight for Lab" + lab.avgBreedWeight());
        
        Yorkshire york = new Yorkshire("New York");
    }
}
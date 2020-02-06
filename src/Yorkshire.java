// ************************************************************
// Peter Savarese
// 2/5/2020
// Yorkshire.java
// 1.0.0
// A class derived from Dog that holds information about
// a Yorkshire terrier. Overrides Dog speak method.
//
// *****************************************************************

public abstract class Yorkshire extends Dog {
    public Yorkshire(String name) {
        super(name);
    }

    // -------------------------------------------------------------
    // Small bark -- overrides speak method in Dog
    // -------------------------------------------------------------
    public String speak() {
        return "woof";
    }
    
    public abstract float avgBreedWeight();
}
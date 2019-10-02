package org.solent.com504.factoryandfacade.model;

public class AnimalObjectFactory{

    public static Animal createCat() {
        return new Cat();
    }

    public static Animal createDog() {
        return new Dog();
    }

    public static Animal createCow() {
        return new Cow();
    }
    
    public static Animal createCat(String name) {
        return new Cat();
    }

    public static Animal createDog(String name) {
        return new Dog();
    }

    public static Animal createCow(String name) {
        return new Cow();
    }

    public static FarmFacade createFarmFacade() {
        
        
        return new FarmFacadeImpl();
    }
}

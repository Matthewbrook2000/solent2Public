package org.solent.com504.factoryandfacade.model;

import java.util.List;
import java.util.ArrayList;

public class FarmFacadeImpl implements FarmFacade{

    private List<Animal> Animals = new ArrayList<>(); 
    
    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> AllAnimals = new ArrayList<>(); 
        
        for (Animal a : Animals){
            AllAnimals.add(a);
        }
        return AllAnimals;
    }

    @Override
    public void addDog(String name) {
        Animal d = AnimalObjectFactory.createDog();
        d.setName(name);
        Animals.add(d);
        
    }

    @Override
    public void addCat(String name) {
        Animal c = AnimalObjectFactory.createCat();
        c.setName(name);
        Animals.add(c);
    }

    @Override
    public void addCow(String name) {
        Animal co = AnimalObjectFactory.createCow();
        co.setName(name);
        Animals.add(co);
    }
    
}

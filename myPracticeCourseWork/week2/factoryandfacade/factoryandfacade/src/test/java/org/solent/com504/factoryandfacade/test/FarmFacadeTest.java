package org.solent.com504.factoryandfacade.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.FarmFacade;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author cgallen
 */
public class FarmFacadeTest {

    FarmFacade farmFacade = AnimalObjectFactory.createFarmFacade();
    
    @Test
    public void FarmFacadeTest() {
        
        assertNotNull(farmFacade);
        
        // WHAT TESTS WOULD YOU CREATE HERE TO SET UP AND TEST THE FARM FACADE?

    }
    @Test
    public void CreateAnimalsTest(){
        farmFacade.addDog("dog");
        farmFacade.addCat("Cat");
        farmFacade.addCow("cow");
        List<Animal> allAnimals = farmFacade.getAllAnimals();
        assertEquals(9, allAnimals.size());
        for (Animal animal : allAnimals) {
            System.out.println("facade Animal:" + animal);
        }
    }
}

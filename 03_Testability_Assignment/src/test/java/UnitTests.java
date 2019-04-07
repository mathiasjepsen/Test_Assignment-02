/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import testability_assignment.TestableCode.Animal;
import testability_assignment.TestableCode.House;

/**
 *
 * @author mathiasjepsen
 */
public class UnitTests {
        
    public UnitTests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void calculateRentLowerBoundary() {
        House house = new House(-1, 2);
        assertEquals(house.calculateRent(), -1);
        house = new House(0, 2);
        assertEquals(house.calculateRent(), -1);
        house = new House(1, 2);
        assertEquals(house.calculateRent(), 500);
    }
    
    @Test
    public void calculateRentUpperBoundary() {
        House house = new House(100, 2);
        assertEquals(house.calculateRent(), 1000);
        house = new House(101, 2);
        assertEquals(house.calculateRent(), 1000);
        house = new House(99, 2);
        assertEquals(house.calculateRent(), 500);
    }
    
    @Test
    public void calculateRentMiddle() {
        House house = new House(50, 2);
        assertEquals(house.calculateRent(), 500);
        house = new House(20000, 2);
        assertEquals(house.calculateRent(), 1000);
    }
    
    @Test
    public void willBeColdDuringWinter() {
        Animal dog = new Animal(4, true, "Dog", null);
        assertFalse(dog.willBeColdDuringWinter());
        Animal human = new Animal(2, false, "Human", null);
        assertTrue(human.willBeColdDuringWinter());
    }
}

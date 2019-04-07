package testability_assignment.TestableCode;

import java.util.List;
import static org.hamcrest.CoreMatchers.any;

/**
 *
 * @author mathiasjepsen
 */
public class Animal {
    private final int legs;
    private final boolean hasFur;
    private final String species;
    private final List<String> offspring;

    public Animal(int legs, boolean hasFur, String species, List<String> offspring) {
        this.legs = legs;
        this.hasFur = hasFur;
        this.species = species;
        this.offspring = offspring;
    }
    
    public void petAnimal() {
        System.out.println("You pet the " + this.species + " on its head.");
    }
    
    public void getAnimalInfo() {
        System.out.println("Legs: " + this.legs);
        System.out.println("Has fur: " + this.hasFur);
        System.out.println("Species: " + this.species);
    }
    
    public boolean willBeColdDuringWinter() {
        return !this.hasFur;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getSpecies() {
        return species;
    }

    public List<String> getOffspring() {
        return offspring;
    }
    
    
}

package testability_assignment;

import java.util.List;

/**
 *
 * @author mathiasjepsen
 */
public class NonTestableCode {
    
    public static class ANIMAL {
        public static int LEGS;
        public static boolean HAS_FUR;
        public static String SPECIES;
        public static List<String> OFFSPRING;
        
        private static void petAnimal() {
            System.out.println("You pet the " + ANIMAL.SPECIES + " on its head.");
        }
        
        public static void petAnimal(int legs) {
            ANIMAL.LEGS = legs;
            ANIMAL.SPECIES = "Xenomorph";
            petAnimal();
        }
        
        public static void getAnimalInfo() {
            System.out.println("Legs: " + 4);
            System.out.println("Has fur: " + ANIMAL.HAS_FUR);
            ANIMAL.SPECIES = "Cat";
            System.out.println("Species: " + ANIMAL.SPECIES);
        }
    }
    
    private class House {
        private double sqm;
        private int inhabitants;

        public House(double sqm, int inhabitants) {
            this.sqm = sqm;
            this.inhabitants = inhabitants;
        }
        
        public int getNumberOfInhabitants() {
            return inhabitants;
        }
    }
    
    public static void main(String[] args) {
        ANIMAL.SPECIES = "Doggo";
        ANIMAL.petAnimal();
        ANIMAL.petAnimal(8);
        
    }
    
}

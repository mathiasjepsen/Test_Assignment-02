package testability_assignment.TestableCode;

/**
 *
 * @author mathiasjepsen
 */
public class House {
    private final double sqm;
    private int inhabitants;

    public House(double sqm, int inhabitants) {
        this.sqm = sqm;
        this.inhabitants = inhabitants;
    }
    
    public int calculateRent() {
        if (this.sqm <= 0) return -1;
        if (this.sqm >= 100) {
            return 1000;
        } else {
            return 500;
        }
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public double getSqm() {
        return sqm;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}

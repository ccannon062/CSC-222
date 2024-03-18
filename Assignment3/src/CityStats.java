

public class CityStats {
    private String city;
    private String state;
    private double groceries;
    private double housing;
    private double utilities;
    private double transportation;
    private double health;
    private double miscellaneous;

    public CityStats(String city, String state, double groceries, double housing, double utilities, double transportation, double health, double miscellaneous) {
        this.city = city;
        this.state = state;
        this.groceries = groceries;
        this.housing = housing;
        this.utilities = utilities;
        this.transportation = transportation;
        this.health = health;
        this.miscellaneous = miscellaneous;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public double getGroceries() {
        return groceries;
    }

    public double getHousing() {
        return housing;
    }

    public double getUtilities() {
        return utilities;
    }

    public double getTransportation() {
        return transportation;
    }

    public double getHealth() {
        return health;
    }

    public double getMiscellaneous() {
        return miscellaneous;
    }

    public double getCOLI() {
        double coli = 0.13 * groceries + 0.29 * housing + 0.10 * utilities + 0.12 * transportation + 0.04 * health + 0.32 * miscellaneous;
        return Math.round(coli * 10.0) / 10.0;
    }
}

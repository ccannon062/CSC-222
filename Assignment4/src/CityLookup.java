import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * City Lookup class.
 */
public class CityLookup {
    private int totalCount;
    private final ArrayList<CityStats> cityStats;

    /**
     * Constructor to initialize city stats array.
     * @param filename file name of the data file.
     */
    public CityLookup(String filename) {
        this.totalCount = 0;
        this.cityStats = new ArrayList<>();

        try {
            Scanner infile = new Scanner(new File(filename));

            while (infile.hasNextLine()) {
                double groceries = Double.parseDouble(infile.next());
                double housing = Double.parseDouble(infile.next());
                double utilities = Double.parseDouble(infile.next());
                double transportation = Double.parseDouble(infile.next());
                double health = Double.parseDouble(infile.next());
                double miscellaneous = Double.parseDouble(infile.next());
                String state = infile.next();
                String city = infile.nextLine().trim();
                CityStats sight = new CityStats(city, state, groceries, housing, utilities, transportation, health, miscellaneous);
                this.cityStats.add(sight);
                totalCount++;
            }
            infile.close();
            Collections.sort(cityStats);
        }
        catch (java.io.FileNotFoundException e) {
            System.out.println("No such file: " + filename);
        }
    }

    /**
     * @return total number of cities.
     */
    public int numCities() {
        return totalCount;
    }

    /**
     * prints the COLI per each city and state.
     * @param state state
     */
    public void showByState(String state) {
        List<CityStats> cities = cityStats.stream()
                .filter(stat -> stat.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
        for (CityStats stat : cities) {
            System.out.println(stat.getCity() +", " + state + ": " + stat.getCOLI());
        }
        System.out.println("Number of cities in "+ state +": "+cities.size());
    }

    /**
     * show COLI per city.
     * @param city city
     */
    public void showByCity(String city) {
        List<CityStats> cities = cityStats.stream()
                .filter(stat -> stat.getCity().contains(city))
                .collect(Collectors.toList());
        for (CityStats stat : cities) {
            System.out.println(stat.getCity() +", " + stat.getState() + ": " + stat.getCOLI());
        }
        System.out.println("Number of cities that contain "+ city +": " + cities.size());
    }

    /**
     * @param city city
     * @param state state
     * @return COLI value
     */
    public double lookupCOLI(String city, String state) {
        Optional<CityStats> cityStat = cityStats.stream()
                .filter(stat -> stat.getCity().equalsIgnoreCase(city) && stat.getState().equalsIgnoreCase(state))
                .findFirst();
        return cityStat.map(CityStats::getCOLI).orElse(-999.0);
    }

    /**
     * @param salary salary
     * @param currentCity current city
     * @param currentState current state
     * @param nextCity other city
     * @param nextState other state
     * @return salary you should have in the other city
     */
    public double compareCities(double salary, String currentCity, String currentState, String nextCity, String nextState) {
        double currentCOLI = lookupCOLI(currentCity, currentState);
        double nextCOLI = lookupCOLI(nextCity, nextState);
        return Math.round((salary * (nextCOLI / currentCOLI)) * 10.0) / 10.0;
    }
    
    /* Takes one parameter. Can be positive or negative value. If the number is positive, the method will return ranking with lowest cost of living. If the number is 
     * negagive then it will return the highest cost of living.*/

    public String lookupByRank(int rank) {
        CityStats byRank;
        
        /* Makes sure that value inputted is valid.*/
        if (rank >= cityStats.size() || rank == 0) {
            return "Invalid Rank";
        }
        
        /* Retrieves rank in the list, ONLY WHEN RANK > 0. Else if negative it gets the negative index by simply adding it to the array list size.*/
        if (rank > 0) {
            byRank = cityStats.get(rank - 1);
            return (rank) + ") " + byRank.getCity() + ", " + byRank.getState() + ": " + byRank.getCOLI();
        } else {
            byRank = cityStats.get(cityStats.size() + rank);
            return (cityStats.size() + rank + 1) + ") " + byRank.getCity() + ", " + byRank.getState() + ": " + byRank.getCOLI();
        }
    }
    
    /* Shows the specified amount of lowest cost cities.*/

    public void showLowest(int count) {
    	
    	 /* Makes sure that input is valid.*/
        if (count >= cityStats.size() || count == 0) {
            System.out.println("Invalid count");
            return;
        }
        /* Simple for loop that loops through specified amount of elements and displays information for each one*/
        
        for (int i = 0; i < count; i++) {
            CityStats stats = cityStats.get(i);
            System.out.println((i + 1) + ") " + stats.getCity() + ", " + stats.getState() + ": " + stats.getCOLI());
        }
    }

    /*Shows the specified amount of cities with the highest cost of living index.*/
    
    public void showHighest(int count) {
    	
    	 /*Makes sure that input is valid*/
    	
        if (count >= cityStats.size() || count == 0) {
            System.out.println("Invalid count");
            return;
        }
        /* Simple for loop that loops through specified number of items. This time it uses subtraction to account for descending order.*/
        for (int i = 1; i <= count; i++) {
            CityStats stats = cityStats.get(cityStats.size() - i);
            System.out.println((cityStats.size() - i + 1) + ") " + stats.getCity() + ", " + stats.getState() + ": " + stats.getCOLI());
        }
    }
}

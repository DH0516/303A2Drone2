/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

import java.util.ArrayList;
import java.util.List;

public class Flight implements Comparable<Flight>{

    private final List<Flight> aFlight = new ArrayList<Flight>();
    //private Comparator<Flight> aComparator = Flight.createByTricksComparator();
    //private Comparator<Flight> aComparator = Flight.createByUniqueMovementsComparator();



    @Override
    public int compareTo(Flight o) {
        return 0;
    }
}

/*
Daniel Ha
260911714
COMP303 W2022 A2
 */


/*
FROM FLIGHT CLASS ONLY
Compare # of tricks - ascending
compare unique movements - ascending
Sort

Do we need to check recording state/execute flight in RunDrone? Or we just need to show the comparison?
Could you please specify all the things we need to test from RunDrone? Thanks!
>>Just showing the comparison is fine.
 */

import java.util.ArrayList;
import java.util.List;

public class RunDrone {



    public static void main(String[] args) {
        // TODO: illustrate your implementations here

    Flight test1 = new Flight("test1");
    test1.addTrick(DroneTrick.Tricks.Pucker);
    test1.addTrick(DroneTrick.Tricks.Pucker);

    Flight test2 = new Flight("test2");
    test2.addTrick(DroneTrick.Tricks.TakeOff);
    test2.addTrick(DroneTrick.Tricks.TakeOff);
    test2.addTrick(DroneTrick.Tricks.TakeOff);
    test2.addTrick(DroneTrick.Tricks.TakeOff);

    Flight test3 = new Flight("test3");
    test3.addTrick(DroneTrick.Tricks.Pucker);
    test3.addTrick(DroneTrick.Tricks.Spindive);
    test3.addTrick(DroneTrick.Tricks.Land);



    List<Flight> listFlights = new ArrayList<>();
    listFlights.add(test1); //2 tricks. 12 moves
    listFlights.add(test2); //4 tricks. 8 moves
    listFlights.add(test3); //3 tricks. 12 moves



    System.out.println("Sort by number of tricks (ascending) - Expected result: test1 test3 test2 (2-3-4)");
    listFlights.sort(new Flight.CompareByNumberOfTricks());
    for (Flight aFlight : listFlights){
        System.out.println(aFlight.flightName);
    }
    System.out.println();

    System.out.println("Sort by number of unique moves - Expected result: test2 test1 test3 (8-12-12)");
    listFlights.sort(new Flight.CompareByUniqueMoves());
    for (Flight aFlight : listFlights){
        System.out.println(aFlight.flightName);
    }




    }



}

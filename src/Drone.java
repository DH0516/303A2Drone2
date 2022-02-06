/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

import java.util.ArrayList;
import java.util.List;

//Flights, Tricks and Movements can be executed on a Drone.

/*
Flights, Tricks and Movements can be executed on a Drone.
Compare tricks - ascending
compare unique movements - ascending
Sort
 */

public class Drone {
    /**
     * Fields
     */

    final private String name;
    private List<Movement> droneMovementList = new ArrayList<>();

    /**
     * Constructor
     * @param name of the drone
     */
    public Drone(String name) {
        this.name = name;
    }

    /**
     * Name getter
     * @return drone name
     */
    public String getName() {
        return this.name;
    }

    public void addMove(Direction pDirection, Speed pSpeed, int distance, SavedFormat pSavedFormat){
        Move aMove = new Move(pDirection, pSpeed, distance, pSavedFormat);
        droneMovementList.add(aMove);
    }

    public void addDroneTrick(DroneTrick.Tricks trickName, SavedFormat pSavedFormat){
        DroneTrick aDroneTrick = new DroneTrick(trickName, pSavedFormat);
        droneMovementList.add(aDroneTrick);
    }

    public void addFlight(Flight pFlight){
        droneMovementList.add(pFlight);
    }

    public void removeLastMovement(){
        droneMovementList.remove(droneMovementList.size()-1);
    }

    public void runAllMovement(){
        for (Movement pMovement : droneMovementList){
            pMovement.execute();
        }
    }










}

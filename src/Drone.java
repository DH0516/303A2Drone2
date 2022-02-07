/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

import java.util.ArrayList;
import java.util.List;

/*
Flights, Tricks and Movements can be executed on a Drone.
 */

public class Drone {
    //Fields
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

    public void add(Move pMove){
        droneMovementList.add(pMove);
    }

    public void add(DroneTrick pDroneTrick){
        droneMovementList.add(pDroneTrick);
    }

    public void add(Flight pFlight){
        droneMovementList.add(pFlight);
    }



    /**
     * Remove last from droneMovementList
     */
    public void removeLastMovement(){
        droneMovementList.remove(droneMovementList.size()-1);
    }

    /**
     * do 'execute' on all movements
     * should print out in MOVE format
     */
    public void executeAll(){
        for (Movement pMovement : droneMovementList){
            pMovement.execute();
        }
    }










}

/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

import Move.Move;

import java.util.LinkedList;
import java.util.List;

public class Drone {
    /**
     * Fields
     */

    final private String name;
    private List<? extends Move> droneMoveList = new LinkedList();

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















}

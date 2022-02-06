import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

/*
 * 1. client can change SPEED, recording of trick - configure
 * 2. group a series of tricksList into a flight - list implementation - done
 * 3. query number of unique movement DIRECTIONS - hashmap - done
 */

public class Flight implements Movement{



    public enum Tricks{
        TakeOff, Land, Pucker, Spindive;
    }

    //a trick = List<Move>
    //tricksList = List<trick>
    private final List<DroneTrick> tricksList = new ArrayList<>();
    String flightName;
    SavedFormat flightSavedFormat;

    public Flight(String pFlightName){
        this.flightName = pFlightName;
    }

    public Flight(String pFlightName, SavedFormat pFormat){
        this.flightName = pFlightName;
        this.flightSavedFormat = pFormat;
    }

    public int getUniqueDirections(){
        /*
        1. iterate through Move in list tricksList
        2. create hashmap <Direction, int>
        3. for every direction in Move, check if it exists in hashmap
         */
        HashMap<Direction, Integer> uniqueDirection = new HashMap<>();
        for (DroneTrick aTrick: tricksList){
            for (Move moveInsideATrick: aTrick.getDroneTrick()){
                Direction pDirection = moveInsideATrick.getDirection();
                if (!uniqueDirection.containsKey(pDirection)){
                    uniqueDirection.put(pDirection,1);
                }
            }
        }
        return uniqueDirection.size();
    }


    public void addTrick (DroneTrick.Tricks pTrick){
        DroneTrick aTrick = new DroneTrick(pTrick, flightSavedFormat);
        tricksList.add(aTrick);
    }

    public void removeLastTrick(){
        tricksList.remove(tricksList.size()-1);
    }



    @Override
    public boolean isRecording() {
        return this.flightSavedFormat != null;
    }

    @Override
    public void setRecordingOff() {
        this.flightSavedFormat = null;
    }

    @Override
    public String getSavedFormat() {
        return this.flightSavedFormat.toString();
    }

    @Override
    public void setSavedFormat(SavedFormat pFormat) {
        this.flightSavedFormat = pFormat;
    }

    @Override
    public void execute() {
        for (DroneTrick aTrick : tricksList){
            aTrick.execute();
        }
    }



}


/*
I would like to confirm if my understanding of the terms "unique movement" is correct.

Let's say, we have a flight that contains these movements :

 "Move: UP, HIGH, 3m" and "Move: UP, LOW, 5m"
1) For Q3: When the client queries the number of unique movement directions (i.e., forward, backward, left, etc.), the client receive 1 as an answer. Since both movements are in the UP direction.

2) For Q4: When we compare the moves, we say that "Move: UP, HIGH, 3m" is not the same as "Move: UP, LOW, 5m", since the other parameters are different (ie velocity and distance).

A confirmation would be greatly appreciated!


1) yep 1 by your definition since ur looking at unique movement dir

2) should be 2 unique look at thread below


1 - I was wondering if a flight can be composed of both movements as well as tricksList

2 - For tricksList can we have a set speed and distance or should we allow the user to set the specifics.
Also is it required that the consumer can individually change each speed and distance for each movement that's part of the trick
or is it possible to have the same speed and distance for each move.

3 - For inputting a trick in the flight do we even need to specify a speed and distance or instead have it a set maneuver.

4 - For takeoff the example is up at low speed then up at medium speed. Does this mean the client only needs to input a distance for takeoff?


1 "The flight class should allow a client to group a series of tricksList into a flight. " (NO)

2 Your client should be able to have variable trick attributes

3 This is your choice

4 Your choice.

 */
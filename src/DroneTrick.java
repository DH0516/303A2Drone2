/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DroneTrick implements Movement{


    public enum Tricks {
        TakeOff, Land, Pucker, Spindive;
    }

    private String currentTrickName;
    private SavedFormat currentTrickFormat;
    private List<Move> currentTrick = new ArrayList<>(); //list of Moves

    /**
     * Constructor v.1
     * @param pTrick TakeOff, Land, Pucker, Spindive
     * @param pFormat set format
     */
    public DroneTrick(Tricks pTrick, SavedFormat pFormat) {
        buildTrick (pTrick, pFormat);
    }

    /**
     * Constructor v.2 (no recording)
     * @param pTrick TakeOff, Land, Pucker, Spindive
     */
    public DroneTrick(Tricks pTrick) {
        buildTrick (pTrick, null);
    }


    /**
     * Helper Method for constructor, load default trick
     * @param pTrick TakeOff, Land, Pucker, Spindive
     * @param pFormat MP4, MOV, WMV, AVI, FLV, MKV
     */
    private void buildTrick(Tricks pTrick, SavedFormat pFormat) {
        if (pTrick.equals(Tricks.TakeOff)) {
            makeTakeOff();
        }
        else if(pTrick.equals(Tricks.Land)) {
            makeLand();
        }
        else if(pTrick.equals(Tricks.Pucker)){
            makePucker();
        }
        else if(pTrick.equals(Tricks.Spindive)){
            makeSpindive();
        }
        else {
            return;
        }
        currentTrickName = pTrick.toString();
        currentTrickFormat = pFormat;
    }

    /**
     * 2 Moves
     * fly up at low speed, by 1m -> fly up at moderate speed, by 2m
     */
    private void makeTakeOff(){
        Move move1 = new Move(Direction.UP, Speed.LOW, 1);
        Move move2 = new Move(Direction.UP, Speed.MODERATE, 2);
        currentTrick.add(move1);
        currentTrick.add(move2);
    }

    /**
     * 2 Moves
     * fly down at low speed, by 1m -> fly down at moderate speed, by 2m
     */
    private void makeLand(){
        Move move1 = new Move(Direction.DOWN, Speed.LOW, 1);
        Move move2 = new Move(Direction.DOWN, Speed.MODERATE, 2);
        currentTrick.add(move1);
        currentTrick.add(move2);
    }

    /**
     * 6 Moves
     * fly up -> turn left -> turn left -> turn left -> turn left -> fly down
     */
    private void makePucker(){
        Move move1 = new Move(Direction.UP, Speed.MODERATE, 2);
        Move move2 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move3 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move4 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move5 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move6 = new Move(Direction.DOWN, Speed.MODERATE, 2);
        currentTrick.add(move1);
        currentTrick.add(move2);
        currentTrick.add(move3);
        currentTrick.add(move4);
        currentTrick.add(move5);
        currentTrick.add(move6);
    }

    /**
     * 4 moves
     * fly up -> turn left -> turn left -> fly down at fast speed
     */
    private void makeSpindive(){
        Move move1 = new Move(Direction.UP, Speed.MODERATE, 3);
        Move move2 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move3 = new Move(Direction.LEFT, Speed.HIGH, 1);
        Move move4 = new Move(Direction.DOWN, Speed.HIGH, 3);
        currentTrick.add(move1);
        currentTrick.add(move2);
        currentTrick.add(move3);
        currentTrick.add(move4);
    }


    /**
     * Manually edit a Move inside of Trick (List of Moves)
     * @param index Which Move
     * @param pDirection Enum
     * @param pSpeed Enum
     * @param distance int
     * @pre distance >= 0
     */
    public void configureMoveOfTrick(int index, Direction pDirection, Speed pSpeed, int distance){
        Move newMove = new Move (pDirection, pSpeed, distance);
        currentTrick.set(index, newMove);
    }


    /**
     * Trick Name Getter
     * @return name
     */
    public String getTrickName(){
        return this.currentTrickName;
    }

    /**
     * Trick (MoveList) getter
     * @return List<Move>
     */
    public List<Move> getDroneTrick(){
        return this.currentTrick;

    }

    /**
     * Only print the Tricks enums
     */
    public void printAllTricks(){
        System.out.println(Arrays.asList(Tricks.values()));
        System.out.println();
    }



    @Override
    public String getSavedFormat() {
        return currentTrickFormat.toString();
    }

    @Override
    public void setSavedFormat(SavedFormat pFormat){
        currentTrickFormat = pFormat;
    }

    @Override
    public boolean isRecording(){
        return currentTrickFormat != null;
    }

    @Override
    public void setRecordingOff() {
        currentTrickFormat = null;
    }

    /**
     * execute MOVE inside of TRICK (currentTrick)
     */
    @Override
    public void execute(){
        for (Move pMove : currentTrick){
            pMove.execute();
        }
    }

}

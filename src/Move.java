/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

public class Move implements Movement {

    /**
     * Fields
     */
    private Direction aDirection;
    private Speed aSpeed;
    private int distance = 0;
    private SavedFormat aSavedFormat = null;

    /**
     * Constructor
     * @param pDirection Direction
     * @param pSpeed Speed
     * @param distance int
     * @pre distance >= 0
     */
    public Move(Direction pDirection, Speed pSpeed, int distance){
        assert distance >= 0;
        this.aDirection = pDirection;
        this.aSpeed = pSpeed;
        this.distance = distance;
    }

    /**
     * Overload Constructor
     * @param pDirection Direction
     * @param pSpeed Speed
     * @param distance int
     * @param pSavedFormat MovedFormat
     * @pre distance >= 0
     */
    public Move(Direction pDirection, Speed pSpeed, int distance, SavedFormat pSavedFormat){
        assert distance >= 0;
        this.aDirection = pDirection;
        this.aSpeed = pSpeed;
        this.aSavedFormat = pSavedFormat;
        this.distance = distance;
    }


    /**
     * Move: Direction(Enum) getter
     * @return Direction
     */
    public Direction getDirection() {
        return this.aDirection;
    }

    /**
     * Move: Speed(Enum) getter
     * @return Speed
     */
    public Speed getSpeed() {
        return this.aSpeed;
    }

    /**
     * Move: Distance(int) getter
     * @return int
     */
    public int getDistance() {
        return this.distance;
    }




    @Override
    public String getSavedFormat() {
        return this.aSavedFormat.toString();
    }

    @Override
    public void setSavedFormat(SavedFormat aFormat) {this.aSavedFormat = aFormat;}

    @Override
    public boolean isRecording() {
        return aSavedFormat != null;
    }

    @Override
    public void setRecordingOff() {this.aSavedFormat = null;}

    @Override
    public void execute(){
        System.out.println("Move " + aDirection.toString() + " : " + distance + " distance" + " : at " + aSpeed.toString() + " speed");
    }



}

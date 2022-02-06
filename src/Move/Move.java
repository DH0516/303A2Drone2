package Move;
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
     * @param pSavedFormat Move.Move.SavedFormat
     * @pre distance >= 0
     */
    public Move(Direction pDirection, Speed pSpeed, int distance, SavedFormat pSavedFormat){
        assert distance >= 0;
        this.aDirection = pDirection;
        this.aSpeed = pSpeed;
        this.aSavedFormat = pSavedFormat;
        this.distance = distance;
    }

    public void printMove() {
        System.out.println("Move " + aDirection.toString() + " : " + distance + " distance" + " : at " + aSpeed.toString() + " speed");
    }


    public Direction getDirection() {
        return this.aDirection;
    }


    public Speed getSpeed() {
        return this.aSpeed;
    }


    public int getDistance() {
        return this.distance;
    }

    @Override
    public SavedFormat getSavedFormat() {
        return this.aSavedFormat;
    }

    @Override
    public boolean isRecording() {
        return aSavedFormat != null;
    }

    @Override
    public void execute(){

    }



}

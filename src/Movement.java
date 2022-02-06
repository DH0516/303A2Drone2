/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

public interface Movement {

    Direction getDirection();
    Speed getSpeed();
    int getDistance();
    SavedFormat getSavedFormat();

    /**
     * If Move has SavedFormat, true
     * @return boolean
     */
    boolean isRecording();

    /**
     * Execute a drone movement
     * Print statement method??
     */
    void execute(Direction pDirection, Speed pSpeed, int distance, SavedFormat pSavedFormat);
}

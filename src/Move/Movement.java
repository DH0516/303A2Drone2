package Move;/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

public interface Movement {


    SavedFormat getSavedFormat();

    /**
     * If Move.Move has Move.Move.SavedFormat, true
     * @return boolean
     */
    boolean isRecording();

    /**
     * Execute a drone movement
     * Print statement method??
     */
    void execute();
}

public interface Movement {

    /**
     * If SavedFormat != null
     * @return boolean
     */
    boolean isRecording();

    /**
     * Set SavedFormat = null
     */
    void setRecordingOff();

    /**
     * If Move/DroneTrick/Flight has SavedFormat
     * @return SavedFormat.toString
     */
    String getSavedFormat();

    /**
     * Set SavedFormat
     * @param aFormat SavedFormat
     */
    void setSavedFormat(SavedFormat aFormat);

    /**
     * Execute a drone movement
     * Print statement method??
     */
    void execute();
}

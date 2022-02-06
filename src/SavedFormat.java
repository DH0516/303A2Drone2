/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

public enum SavedFormat {
    MP4, MOV, WMV, AVI, FLV, MKV;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }

}

package Move;

/*
Daniel Ha
260911714
COMP303 W2022 A2
 */

public enum Direction {
    FORWARD, BACKWARD, LEFT, RIGHT, UP, DOWN;

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase();
    }
}

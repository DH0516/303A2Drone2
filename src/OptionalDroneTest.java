/*
Daniel Ha
260911714
COMP303 W2022 A2
 */


public class OptionalDroneTest {
    public static void main(String[] args) {
        Drone drone1 = new Drone("drone1");
        System.out.println("Adding Drone");
        System.out.println("---------------------");
        System.out.println();

        Flight flight1 = new Flight("flight1");
        flight1.addTrick(DroneTrick.Tricks.Spindive);
        flight1.addTrick(DroneTrick.Tricks.TakeOff);
        System.out.println("Adding Flight");
        flight1.execute();
        int uniqueMoves = flight1.getUniqueMoves();
        System.out.println("Unique moves of flight 1: " + uniqueMoves);
        System.out.println("---------------------");
        System.out.println();

        System.out.println("Adding DroneTrick");
        DroneTrick trick1 = new DroneTrick(DroneTrick.Tricks.TakeOff);
        System.out.println("Recording? : " + trick1.isRecording());
        trick1.setSavedFormat(SavedFormat.AVI);
        System.out.println("Recording? : " + trick1.isRecording());
        System.out.println();
        trick1.execute();
        System.out.println();
        System.out.println("Editing DroneTrick");
        trick1.configureMoveOfTrick(0, Direction.BACKWARD, Speed.HIGH, 5);
        trick1.execute();
        System.out.println("----------------------");
        System.out.println();

        System.out.println("Adding one MOVE");
        Move move1 = new Move(Direction.FORWARD, Speed.HIGH, 5, SavedFormat.MOV);
        Move move2 = new Move(Direction.FORWARD, Speed.HIGH, 5);
        move1.execute();
        System.out.println(move1.getDirection());
        System.out.println(move1.getDistance());
        System.out.println(move1.getSpeed());
        System.out.println(move2.isRecording()); //false
        System.out.println("-------------------------");
        System.out.println();

        System.out.println("Execute drone");
        drone1.add(move1);
        drone1.add(move2);
        drone1.add(trick1);
        drone1.add(flight1);
        drone1.executeAll();





    }
}

public class Goldfinch extends Animal implements Flyable, Walkable {
    private double wingSpan;

    // Empty-argument constructor
    public Goldfinch() {
        super();
        this.wingSpan = 9.0;
    }

    // Preferred constructor
    public Goldfinch(int simID, Location location, double wingSpan) {
        super(simID, location);
        if (wingSpan < 5.0 || wingSpan > 11.0) {
            throw new InvalidWingspanException("Invalid Wingspan: " + wingSpan);
        }
        this.wingSpan = wingSpan;
    }

    // Fly method
    public void fly(Location l) {
        this.location = l;
    }

    // Walk method
    public void walk(int direction) {
        int[] coords = location.getCoordinates();
        // Moves 1 unit in the specified direction
        switch (direction) {
            case 0: location.update(coords[0], coords[1] + 1); break; // Up
            case 1: location.update(coords[0] + 1, coords[1]); break; // Right
            case 2: location.update(coords[0], coords[1] - 1); break; // Down
            case 3: location.update(coords[0] - 1, coords[1]); break; // Left
        }
    }

    // Getters and setters
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        if (wingSpan < 5.0 || wingSpan > 11.0) {
            throw new InvalidWingspanException("Invalid Wingspan: " + wingSpan);
        }
        this.wingSpan = wingSpan;
    }

    // toString method
    @Override
    public String toString() {
        return "Goldfinch [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
                + ", wingSpan=" + wingSpan + "]";
    }
}


public abstract class Animal {
    protected int simID;
    protected Location location;
    protected boolean full;
    protected boolean rested;

    // Empty-argument constructor
    public Animal() {
        this.simID = 0;
        this.location = new Location();
        this.full = false;
        this.rested = true;
    }

    // Preferred constructor
    public Animal(int simID, Location location) {
        if (simID <= 0) {
            throw new InvalidSimIDException("Invalid Simulation ID: " + simID);
        }
        this.simID = simID;
        this.location = location;
        this.full = false;
        this.rested = true;
    }

    // Eat method
    public boolean eat() {
        this.full = Math.random() > 0.5;
        return this.full;
    }

    // Sleep method
    public boolean sleep() {
        this.rested = Math.random() > 0.5;
        return this.rested;
    }

    // Getters and setters
    public int getSimID() {
        return simID;
    }

    public void setSimID(int simID) {
        if (simID <= 0) {
            throw new InvalidSimIDException("Invalid Simulation ID: " + simID);
        }
        this.simID = simID;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public boolean isFull() {
        return full;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    public boolean isRested() {
        return rested;
    }

    public void setRested(boolean rested) {
        this.rested = rested;
    }
}


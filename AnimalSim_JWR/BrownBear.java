public class BrownBear extends Animal implements Walkable, Swimmable {
    private String subSpecies;

    // Empty-argument constructor
    public BrownBear() {
        super();
        this.subSpecies = "Alaskan";
    }

    // Preferred constructor
    public BrownBear(int simID, Location location, String subSpecies) {
        super(simID, location);
        if (!isValidSubSpecies(subSpecies)) {
            throw new InvalidSubspeciesException("Invalid SubSpecies: " + subSpecies);
        }
        this.subSpecies = subSpecies;
    }

    // Walk method
    public void walk(int direction) {
        int[] coords = location.getCoordinates();
        // Moves 3 units in the specified direction
        switch (direction) {
            case 0: location.update(coords[0], coords[1] + 3); break; // Up
            case 1: location.update(coords[0] + 3, coords[1]); break; // Right
            case 2: location.update(coords[0], coords[1] - 3); break; // Down
            case 3: location.update(coords[0] - 3, coords[1]); break; // Left
        }
    }

    // Swim method
    public void swim(int direction) {
        int[] coords = location.getCoordinates();
        // Moves 2 units in the specified direction
        switch (direction) {
            case 0: location.update(coords[0], coords[1] + 2); break; // Up
            case 1: location.update(coords[0] + 2, coords[1]); break; // Right
            case 2: location.update(coords[0], coords[1] - 2); break; // Down
            case 3: location.update(coords[0] - 2, coords[1]); break; // Left
        }
    }

    // Getters and setters
    public String getSubSpecies() {
        return subSpecies;
    }

    public void setSubSpecies(String subSpecies) {
        if (!isValidSubSpecies(subSpecies)) {
            throw new InvalidSubspeciesException("Invalid SubSpecies: " + subSpecies);
        }
        this.subSpecies = subSpecies;
    }

    // toString method
    @Override
    public String toString() {
        return "BrownBear [simID=" + simID + ", location=" + location + ", full=" + full + ", rested=" + rested
                + ", subSpecies=" + subSpecies + "]";
    }

    // Validation for subSpecies
    private boolean isValidSubSpecies(String subSpecies) {
        String[] validSubSpecies = {"Alaskan", "Asiatic", "European", "Grizzly", "Kodiak", "Siberian"};
        for (String valid : validSubSpecies) {
            if (valid.equals(subSpecies)) {
                return true;
            }
        }
        return false;
    }
}

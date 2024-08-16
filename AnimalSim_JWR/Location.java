
public class Location {
    private int xCoord;
    private int yCoord;

    // Empty-argument constructor
    public Location() {
        this.xCoord = 0;
        this.yCoord = 0;
    }

    // Preferred constructor
    public Location(int x, int y) {
        if (x < 0) {
            throw new InvalidCoordinateException("Invalid X Coordinate: " + x);
        }
        if (y < 0) {
            throw new InvalidCoordinateException("Invalid Y Coordinate: " + y);
        }
        this.xCoord = x;
        this.yCoord = y;
    }

    // Update method
    public void update(int x, int y) {
        if (x < 0) {
            throw new InvalidCoordinateException("Invalid X Coordinate: " + x);
        }
        if (y < 0) {
            throw new InvalidCoordinateException("Invalid Y Coordinate: " + y);
        }
        this.xCoord = x;
        this.yCoord = y;
    }

    // Get coordinates method
    public int[] getCoordinates() {
        return new int[]{xCoord, yCoord};
    }
}

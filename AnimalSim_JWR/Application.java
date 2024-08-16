import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {
        // Location Tests
        System.out.println("*********************************************");
        System.out.println("      Location Tests");
        System.out.println("*********************************************");
        Location loc1 = new Location();
        Location loc2 = new Location(3, 5);

        System.out.println("loc1 coordinates: " + loc1.getCoordinates()[0] + ", " + loc1.getCoordinates()[1]);
        System.out.println("loc2 coordinates: " + loc2.getCoordinates()[0] + ", " + loc2.getCoordinates()[1]);

        // Animal Tests
        System.out.println("*********************************************");
        System.out.println("    Animal Tests");
        System.out.println("*********************************************");
        Animal goldfinch1 = new Goldfinch();
        Animal brownbear1 = new BrownBear();

        System.out.println(goldfinch1.toString());
        System.out.println(brownbear1.toString());

        // Goldfinch Tests
        System.out.println("*********************************************");
        System.out.println("      Goldfinch Tests");
        System.out.println("*********************************************");
        Goldfinch goldfinch2 = new Goldfinch(1, new Location(1, 2), 8.5);
        System.out.println(goldfinch2.toString());
        goldfinch2.walk(1);
        System.out.println("The Goldfinch new location is: " + goldfinch2.getLocation().getCoordinates()[0] + ", " + goldfinch2.getLocation().getCoordinates()[1]);

        // BrownBear Tests
        System.out.println("*********************************************");
        System.out.println("       BrownBear Tests");
        System.out.println("*********************************************");
        BrownBear brownbear2 = new BrownBear(2, new Location(2, 3), "Grizzly");
        System.out.println(brownbear2.toString());
        brownbear2.swim(0);
        System.out.println("The BrownBear new location is: " + brownbear2.getLocation().getCoordinates()[0] + ", " + brownbear2.getLocation().getCoordinates()[1]);

        // Generics Tests
        System.out.println("*********************************************");
        System.out.println("Generics Tests");
        System.out.println("*********************************************");
        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(goldfinch1);
        animals.add(goldfinch2);
        animals.add(brownbear1);
        animals.add(brownbear2);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

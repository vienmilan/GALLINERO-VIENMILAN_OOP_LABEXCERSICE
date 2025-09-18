
public class Transportation {
    public final String make;
    public final String model;
    public final int year;
    public final String fuelType;

    public Transportation(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
        System.out.println("A new " + this.make + " " + this.model + " was created.");
    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }

    public void displayInfo() {
        System.out.println("Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year + ", Fuel: " + this.fuelType);
    }
}


class LandTransport extends Transportation {
    protected int numberOfWheels;

    public LandTransport(String make, String model, int year, String fuelType, int numberOfWheels) {
        super(make, model, year, fuelType);
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public void move() {
        System.out.println("The land vehicle is driving on its " + this.numberOfWheels + " wheels.");
    }
}


class Truck extends LandTransport {
    private final double maxLoadKg;

    public Truck(String make, String model, int year, String fuelType, double maxLoadKg) {
        super(make, model, year, fuelType, 4);
        this.maxLoadKg = maxLoadKg;
    }

    public void carryCargo() {
        System.out.println("The truck is carrying a heavy load of up to " + this.maxLoadKg + " kg.");
    }
}


class SUV extends LandTransport {
    private final int seatingCapacity;

    public SUV(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, fuelType, 4);
        this.seatingCapacity = seatingCapacity;
    }

    public void transportPassengers() {
        System.out.println("The SUV can transport up to " + this.seatingCapacity + " passengers.");
    }
}

class Tricycle extends LandTransport {
    private final int seatingCapacity;

    public Tricycle(String make, String model, int year, String fuelType, int seatingCapacity) {
        super(make, model, year, "gasoline", 3);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void move() {
        System.out.println("The tricycle is puttering along the road.");
    }
}

class Motorcycle extends LandTransport {
    private boolean isElectric;

    public Motorcycle(String make, String model, int year, String fuelType, boolean isElectric) {
        super(make, model, year, fuelType, 2);
        this.isElectric = isElectric;
    }

    public void popAWheelie() {
        if (!isElectric) {
            System.out.println("The motorcycle pops a wheelie! Vroom!");
        } else {
            System.out.println("The electric motorcycle zips forward silently.");
        }
    }
}


class Kariton extends LandTransport {
    public Kariton(String make, String model, int year) {
        super(make, model, year, "manual", 2);
    }

    @Override
    public void move() {
        System.out.println("The kariton is being pushed forward.");
    }
}


class WaterTransport extends Transportation {
    private String propulsion;

    public WaterTransport(String make, String model, int year, String fuelType, String propulsion) {
        super(make, model, year, fuelType);
        this.propulsion = propulsion;
    }

    @Override
    public void move() {
        System.out.println("The water vessel is sailing with its " + this.propulsion + " propulsion.");
    }
}


class Boat extends WaterTransport {
    private boolean hasSails;

    public Boat(String make, String model, int year, String fuelType, boolean hasSails) {
        super(make, model, year, fuelType, hasSails ? "sails" : "engine");
        this.hasSails = hasSails;
    }

    public void dropAnchor() {
        System.out.println("The boat has dropped its anchor. Ahoy!");
    }
}


class Submarine extends WaterTransport {
    private double maxDepthMeters;

    public Submarine(String make, String model, int year, String fuelType, double maxDepthMeters) {
        super(make, model, year, fuelType, "propeller");
        this.maxDepthMeters = maxDepthMeters;
    }

    public void dive() {
        System.out.println("The submarine is diving to a depth of " + this.maxDepthMeters + " meters.");
    }
}


class AirTransport extends Transportation {
    private int numberOfEngines;

    public AirTransport(String make, String model, int year, String fuelType, int numberOfEngines) {
        super(make, model, year, fuelType);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void move() {
        System.out.println("The aircraft is flying using its " + this.numberOfEngines + " engines.");
    }
}

class Airplane extends AirTransport {
    private double wingspanMeters;

    public Airplane(String make, String model, int year, String fuelType, int numberOfEngines, double wingspanMeters) {
        super(make, model, year, fuelType, numberOfEngines);
        this.wingspanMeters = wingspanMeters;
    }

    public void takeOff() {
        System.out.println("The airplane is taking off from the runway. Its wingspan is " + this.wingspanMeters + " meters.");
    }
}


class Helicopter extends AirTransport {
    private boolean hasTailRotor;

    public Helicopter(String make, String model, int year, String fuelType, int numberOfEngines, boolean hasTailRotor) {
        super(make, model, year, fuelType, numberOfEngines);
        this.hasTailRotor = hasTailRotor;
    }

    public void hover() {
        if (this.hasTailRotor) {
            System.out.println("The helicopter is hovering in place. Its tail rotor keeps it stable.");
        } else {
            System.out.println("The helicopter is trying to hover but it's unstable.");
        }
    }
}


class TransportationTester {
    public static void main(String[] args) {
        System.out.println("--- Creating Transportation Instances ---");
        
        Truck truck = new Truck("Ford", "F-150", 2023, "gasoline", 1300);
        SUV suv = new SUV("Toyota", "RAV4", 2022, "gasoline", 5);
        Tricycle tricycle = new Tricycle("Honda", "T-150", 2019, "gasoline", 3);
        Motorcycle motorcycle = new Motorcycle("Kawasaki", "Ninja", 2024, "electric", true);
        Kariton kariton = new Kariton("Filipino", "Classic", 2020);
       
        Boat boat = new Boat("Yamaha", "B-200", 2021, "gasoline", false);
        Submarine submarine = new Submarine("Nautilus", "U-12", 2018, "nuclear", 500.0);

        Airplane airplane = new Airplane("Boeing", "747", 1990, "jet fuel", 4, 64.4);
        Helicopter helicopter = new Helicopter("Sikorsky", "S-76", 2015, "jet fuel", 2, true);
        
        System.out.println("\n--- Testing All Vehicles ---");

        System.out.println("\n Truck:");
        truck.displayInfo();
        truck.move();
        truck.carryCargo();
        
        System.out.println("\n SUV:");
        suv.displayInfo();
        suv.move();
        suv.transportPassengers();

        System.out.println("\n Tricycle:");
        tricycle.displayInfo();
        tricycle.move();

        System.out.println("\n Motorcycle:");
        motorcycle.displayInfo();
        motorcycle.move();
        motorcycle.popAWheelie();

        System.out.println("\n Kariton:");
        kariton.displayInfo();
        kariton.move();

        System.out.println("\n Boat:");
        boat.displayInfo();
        boat.move();
        boat.dropAnchor();

        System.out.println("\n Submarine:");
        submarine.displayInfo();
        submarine.move();
        submarine.dive();

        System.out.println("\n Airplane:");
        airplane.displayInfo();
        airplane.move();
        airplane.takeOff();

        System.out.println("\n Helicopter:");
        helicopter.displayInfo();
        helicopter.move();
        helicopter.hover();
    }
}

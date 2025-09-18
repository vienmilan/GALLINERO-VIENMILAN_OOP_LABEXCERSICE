public class Transport {
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

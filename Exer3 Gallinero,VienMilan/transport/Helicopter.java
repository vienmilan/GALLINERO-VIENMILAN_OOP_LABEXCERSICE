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

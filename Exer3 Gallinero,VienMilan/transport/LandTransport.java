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

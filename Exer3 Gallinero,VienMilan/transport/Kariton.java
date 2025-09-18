class Kariton extends LandTransport {
    public Kariton(String make, String model, int year) {
        super(make, model, year, "manual", 2);
    }

    @Override
    public void move() {
        System.out.println("The kariton is being pushed forward.");
    }
}

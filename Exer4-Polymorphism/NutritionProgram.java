class NutritionProgram extends HealthProgram {
    public NutritionProgram(String targetDemographic) {
        super("Nutrition Program", targetDemographic, "nutritional support");
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Focus: Food Distribution");
    }

    public void provideFood() {
        System.out.println("Distributing food parcels and supplements to families.");
    }
}
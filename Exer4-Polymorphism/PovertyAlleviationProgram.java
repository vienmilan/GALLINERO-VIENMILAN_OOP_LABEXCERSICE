class PovertyAlleviationProgram {
    private final String name;
    private final String targetDemographic;

    public PovertyAlleviationProgram(String name, String targetDemographic) {
        this.name = name;
        this.targetDemographic = targetDemographic;
    }

    public void implement() {
        System.out.println("The program is being implemented to assist " + this.targetDemographic + ".");
    }

    public void describeProgram() {
        System.out.println("Program: " + this.name + ", Target: " + this.targetDemographic);
    }

    // Add public getter methods to allow subclasses to access private fields
    public String getName() {
        return name;
    }

    public String getTargetDemographic() {
        return targetDemographic;
    }
}
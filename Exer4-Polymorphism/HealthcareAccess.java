class HealthcareAccess extends HealthProgram {
    public HealthcareAccess(String targetDemographic) {
        super("Healthcare Access Program", targetDemographic, "medical care");
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Focus: Medical Care");
    }

    public void offerConsultation() {
        System.out.println("Offering free medical consultations and check-ups.");
    }
}
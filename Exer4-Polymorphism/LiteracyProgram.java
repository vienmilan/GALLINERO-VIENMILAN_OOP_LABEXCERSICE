class LiteracyProgram extends EducationProgram {
    public LiteracyProgram(String targetDemographic) {
        super("Literacy Program", targetDemographic, "basic literacy");
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Focus: Basic Literacy");
    }

    public void teachReading() {
        System.out.println("Teaching basic reading and writing to individuals.");
    }
}
class VocationalTraining extends EconomicEmpowermentProgram {
    private final String skill;

    public VocationalTraining(String targetDemographic, String skill) {
        super("Vocational Training Program", targetDemographic, "job skills");
        this.skill = skill;
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Skill: " + this.skill);
    }

    public void trainParticipants() {
        System.out.println("Training participants in the skill of " + this.skill + ".");
    }
}
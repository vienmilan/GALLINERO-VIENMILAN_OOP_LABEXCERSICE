class ScholarshipFund extends EducationProgram {
    public ScholarshipFund(String targetDemographic) {
        super("Scholarship Fund", targetDemographic, "higher education");
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Focus: Higher Education");
    }

    public void awardScholarship() {
        System.out.println("Awarding a scholarship to a deserving student.");
    }
}
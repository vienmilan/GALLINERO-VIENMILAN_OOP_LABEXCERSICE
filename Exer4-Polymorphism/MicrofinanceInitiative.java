class MicrofinanceInitiative extends EconomicEmpowermentProgram {
    private final double loanAmount;

    public MicrofinanceInitiative(String targetDemographic, double loanAmount) {
        super("Microfinance Initiative", targetDemographic, "small business loans");
        this.loanAmount = loanAmount;
    }

    @Override
    public void describeProgram() {
        System.out.println("Program: " + super.getName() + ", Target: " + super.getTargetDemographic() + ", Loan Amount: $" + this.loanAmount);
    }

    public void provideLoan() {
        System.out.println("Providing a small loan of $" + this.loanAmount + " to a community member.");
    }
}
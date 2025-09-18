class PovertyAlleviationProgram {
    private final String name;
    private final String targetDemographic;

    public PovertyAlleviationProgram(String name, String targetDemographic) {
        this.name = name;
        this.targetDemographic = targetDemographic;
        System.out.println("A new program called " + this.name + " was initiated.");
    }

    public void implement() {
        System.out.println("The program is being implemented to assist " + this.targetDemographic + ".");
    }

    public void describeProgram() {
        System.out.println("Program: " + this.name + ", Target: " + this.targetDemographic);
    }
}

class EconomicEmpowermentProgram extends PovertyAlleviationProgram {
    protected final String focusArea;

    public EconomicEmpowermentProgram(String name, String targetDemographic, String focusArea) {
        super(name, targetDemographic);
        this.focusArea = focusArea;
    }

    public void provideResources() {
        System.out.println("This program provides resources for economic development, focusing on " + this.focusArea + ".");
    }
}


class MicrofinanceInitiative extends EconomicEmpowermentProgram {
    private final double loanAmount;

    public MicrofinanceInitiative(String targetDemographic, double loanAmount) {
        super("Microfinance Initiative", targetDemographic, "small business loans");
        this.loanAmount = loanAmount;
    }

    public void provideLoan() {
        System.out.println("Providing a small loan of $" + this.loanAmount + " to a community member.");
    }
}

class VocationalTraining extends EconomicEmpowermentProgram {
    private final String skill;

    public VocationalTraining(String targetDemographic, String skill) {
        super("Vocational Training Program", targetDemographic, "job skills");
        this.skill = skill;
    }

    public void trainParticipants() {
        System.out.println("Training participants in the skill of " + this.skill + ".");
    }
}


class EducationProgram extends PovertyAlleviationProgram {
    protected final String educationLevel;

    public EducationProgram(String name, String targetDemographic, String educationLevel) {
        super(name, targetDemographic);
        this.educationLevel = educationLevel;
    }

    public void teach() {
        System.out.println("This program teaches skills for " + this.educationLevel + ".");
    }
}
class LiteracyProgram extends EducationProgram {
    public LiteracyProgram(String targetDemographic) {
        super("Literacy Program", targetDemographic, "basic literacy");
    }

    public void teachReading() {
        System.out.println("Teaching basic reading and writing to individuals.");
    }
}


class ScholarshipFund extends EducationProgram {
    public ScholarshipFund(String targetDemographic) {
        super("Scholarship Fund", targetDemographic, "higher education");
    }

    public void awardScholarship() {
        System.out.println("Awarding a scholarship to a deserving student.");
    }
}

class HealthProgram extends PovertyAlleviationProgram {
    protected final String serviceType;

    public HealthProgram(String name, String targetDemographic, String serviceType) {
        super(name, targetDemographic);
        this.serviceType = serviceType;
    }

    public void provideHealthService() {
        System.out.println("This program provides " + this.serviceType + " health services.");
    }
}


class NutritionProgram extends HealthProgram {
    public NutritionProgram(String targetDemographic) {
        super("Nutrition Program", targetDemographic, "nutritional support");
    }

    public void provideFood() {
        System.out.println("Distributing food parcels and supplements to families.");
    }
}


class HealthcareAccess extends HealthProgram {
    public HealthcareAccess(String targetDemographic) {
        super("Healthcare Access Program", targetDemographic, "medical care");
    }

    public void offerConsultation() {
        System.out.println("Offering free medical consultations and check-ups.");
    }
}


public class Poverty {
    public static void main(String[] args) {
        System.out.println("--- Creating Poverty Alleviation Program Instances ---");


        MicrofinanceInitiative microfinance = new MicrofinanceInitiative("small business owners", 500.00);
        VocationalTraining vocational = new VocationalTraining("unemployed youth", "Carpentry");


        LiteracyProgram literacy = new LiteracyProgram("adult learners");
        ScholarshipFund scholarship = new ScholarshipFund("high school graduates");

        NutritionProgram nutrition = new NutritionProgram("at-risk children");
        HealthcareAccess healthcare = new HealthcareAccess("rural communities");

        System.out.println("\n--- Testing All Programs ---");

        System.out.println("\nTesting Microfinance Initiative:");
        microfinance.describeProgram();
        microfinance.provideResources();
        microfinance.provideLoan();

        System.out.println("\nTesting Vocational Training:");
        vocational.describeProgram();
        vocational.provideResources();
        vocational.trainParticipants();

        System.out.println("\nTesting Literacy Program:");
        literacy.describeProgram();
        literacy.teach();
        literacy.teachReading();
        
        System.out.println("\nTesting Scholarship Fund:");
        scholarship.describeProgram();
        scholarship.teach();
        scholarship.awardScholarship();
        
        System.out.println("\nTesting Nutrition Program:");
        nutrition.describeProgram();
        nutrition.provideHealthService();
        nutrition.provideFood();
        
        System.out.println("\nTesting Healthcare Access:");
        healthcare.describeProgram();
        healthcare.provideHealthService();
        healthcare.offerConsultation();
    }
}

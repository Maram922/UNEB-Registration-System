public class UNEBCandidates {
    static int examYear;
    static double registrationFee;
    static String gradingPolicy;

    String studentName;
    String registrationStatus;
    String examinationCentre;

    static {
        System.out.println("STATIC BLOCK EXECUTING");
        System.out.println("Initializing examination settings");

        examYear = 2027;
        registrationFee = 150000.0;
        gradingPolicy = "A-F Grading System";

        System.out.println("Exam Year: " +examYear);
        System.out.println("Registration Fee: UGX " + registrationFee);
        System.out.println("Grading Policy: " + gradingPolicy);
        System.out.println();
    }

    {
        System.out.println("Instance Initialization Block Executing");
        registrationStatus = "Pending";
        examinationCentre = "Not assigned";

        System.out.println("Default Registration Status: " + registrationStatus);
        System.out.println("Default Examination Centre: " + examinationCentre);
        System.out.println();
    }

    public UNEBCandidates(String studentName, String examinationCentre) {
        System.out.println("Constructor Executing");

        this.studentName = studentName;
        this.examinationCentre = examinationCentre;
        registrationStatus = "Registered";

        System.out.println("Candidate Registered: " + studentName);
        System.out.println("Assigned centre: " + examinationCentre);
        System.out.println();
    }

    public void displayDetails(){
        System.out.println("Candidate Name: " + studentName);
        System.out.println("Registration Status: " + registrationStatus);
        System.out.println("Examination Centre: " + examinationCentre);
        System.out.println("Exam Year: " + examYear);
    }
}

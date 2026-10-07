public class Main{
    static void main() {
        UNEBCandidate candidate1 = new UNEBCandidate("Victor Musika", "Makerere College School");
        UNEBCandidate candidate2 = new UNEBCandidate("Kismat Salima", "King's College Budo");
        UNEBCandidate candidate3 = new UNEBCandidate("David Ouma", "Gulu High School");

        System.out.println("Registered Candidates");
        System.out.println();

        candidate1.displayDetails();
        System.out.println();

        candidate2.displayDetails();
        System.out.println();

        candidate3.displayDetails();
    }
}
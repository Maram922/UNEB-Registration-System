public class Main{
    static void main() {
        UNEBCandidates c1 = new UNEBCandidates("Victor Musika", "Makerere College School");
        UNEBCandidates c2 = new UNEBCandidates("Kismat Salima", "King's College Budo");
        UNEBCandidates c3 = new UNEBCandidates("David Ouma", "Gulu High School");

        System.out.println("Registered Candidates");
        System.out.println();

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
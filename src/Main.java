public class Main{
    static void main() {
        UNEBCandidate c1 = new UNEBCandidate("Victor Musika", "Makerere College School");
        UNEBCandidate c2 = new UNEBCandidate("Kismat Salima", "King's College Budo");
        UNEBCandidate c3 = new UNEBCandidate("David Ouma", "Gulu High School");

        System.out.println("Registered Candidates");
        System.out.println();

        c1.displayDetails();
        System.out.println();

        c2.displayDetails();
        System.out.println();

        c3.displayDetails();
    }
}
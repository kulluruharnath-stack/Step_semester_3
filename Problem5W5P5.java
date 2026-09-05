import java.util.Arrays;

public class Problem5W5P5 {

    static class Candidate implements Comparable<Candidate> {

        private String name;
        private double cgpa;
        private int codingScore;

        // Constructor
        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        // CGPA-only eligibility
        static boolean isEligible(double cgpa) {
            return cgpa >= 7.5;
        }

        // CGPA + coding score eligibility
        static boolean isEligible(double cgpa, int codingScore) {
            return cgpa >= 6.5 && codingScore >= 60;
        }

        // Composite score
        double getCompositeScore() {
            return cgpa * 10 + codingScore;
        }

        // Sort by composite score in descending order
        @Override
        public int compareTo(Candidate other) {

            return Double.compare(
                other.getCompositeScore(),
                this.getCompositeScore()
            );
        }
    }

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] shortlisted = new Candidate[candidates.length];

        int count = 0;

        for (int i = 0; i < candidates.length; i++) {

            if (Candidate.isEligible(candidates[i].cgpa) ||
                Candidate.isEligible(
                    candidates[i].cgpa,
                    candidates[i].codingScore)) {

                shortlisted[count] = candidates[i];
                count++;
            }
        }

        // Create array containing only shortlisted candidates
        Candidate[] finalList =
                Arrays.copyOf(shortlisted, count);

        // Sort using compareTo()
        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result +
                    (i + 1) + ". " +
                    finalList[i].name +
                    " (" +
                    finalList[i].getCompositeScore() +
                    ")";

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {

            new Candidate("Aisha", 8.2, 40),

            new Candidate("Rohit", 6.8, 65),

            new Candidate("Meena", 6.0, 90),

            new Candidate("Karan", 7.5, 20)
        };

        System.out.println(
            shortlistAndRank(candidates)
        );
    }
}
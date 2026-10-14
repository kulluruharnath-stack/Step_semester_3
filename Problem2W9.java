import java.util.*;

class Problem2W9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double grandTotal = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double weight = sc.nextDouble();
            double value = sc.nextDouble();

            double charge;
            double insurance = 0;

            switch (type) {
                case "STANDARD":
                    charge = 40 + 10 * weight;
                    break;

                case "EXPRESS":
                    charge = 80 + 15 * weight;
                    insurance = value * 0.02;
                    break;

                default:
                    charge = 40 + 10 * weight + 50;
                    insurance = value * 0.02;
            }

            double total = charge + insurance;

            System.out.printf(
                "%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",
                type, charge, insurance, total
            );

            grandTotal += total;
        }

        System.out.printf("Grand Total: %.2f%n", grandTotal);
        sc.close();
    }
}
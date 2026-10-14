import java.util.*;

class Problem5W9P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        final double BOOKING_FEE = 50.0;

        for (int i = 0; i < n; i++) {
            String mode = sc.next();
            double distance = sc.nextDouble();
            double fare;

            switch (mode) {
                case "BUS":
                    fare = distance * 2.0;
                    break;

                case "TRAIN":
                    fare = distance * 1.5;
                    break;

                default:
                    fare = 2500 + distance * 4.0;
            }

            double total = fare + BOOKING_FEE;
            System.out.printf("%s: %.2f%n", mode, total);
        }

        sc.close();
    }
}
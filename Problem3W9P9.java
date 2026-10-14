import java.util.*;

class Problem3W9P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String title = sc.next();
            int days = sc.nextInt();
            double fine;

            switch (type) {
                case "BOOK":
                    fine = days * 2.0;
                    break;

                case "DVD":
                    fine = Math.min(days * 5.0, 50.0);
                    break;

                default:
                    fine = days * 1.0;
            }

            System.out.printf("%s: %.2f%n", title, fine);
            total += fine;
        }

        System.out.printf("Total Fines: %.2f%n", total);
        sc.close();
    }
}
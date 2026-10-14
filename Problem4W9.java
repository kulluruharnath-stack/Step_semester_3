import java.util.*;

class Problem4W9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String cab = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            if (cab.equals("MINI") && time.equals("NIGHT")) {
                System.out.println("MINI: night service not available");
                continue;
            }

            double rate;

            switch (cab) {
                case "MINI":
                    rate = 10;
                    break;
                case "SEDAN":
                    rate = 14;
                    break;
                default:
                    rate = 18;
            }

            double fare = Math.max(100, km * rate);

            if (time.equals("NIGHT")) {
                fare *= 1.20;
            }

            System.out.printf("%s: %.2f%n", cab, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
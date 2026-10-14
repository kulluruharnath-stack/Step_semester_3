import java.util.*;

class Problem5W8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double d = sc.nextDouble();
            double fare;

            switch (type) {
                case "BUS":
                    fare = Math.min(2 + 0.1 * d, 10);
                    break;
                case "TRAIN":
                    fare = 3 + 0.15 * d;
                    break;
                default:
                    fare = (1.5 + 0.2 * d) * sc.nextDouble();
            }

            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
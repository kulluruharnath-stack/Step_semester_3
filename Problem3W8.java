import java.util.*;

class Problem3W8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double w = sc.nextDouble();
            double d = sc.nextDouble();
            double fee;

            switch (type) {
                case "STANDARD":
                    fee = 5 + 0.5 * w + 0.1 * d;
                    break;
                case "EXPRESS":
                    fee = 15 + w + 0.2 * d;
                    break;
                default:
                    fee = 25 + 2 * w + 0.5 * d + sc.nextDouble();
            }

            System.out.printf("%s: %.2f%n", type, fee);
            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
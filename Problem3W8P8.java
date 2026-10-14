import java.util.*;

class Problem3W8P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            double bill;

            switch (type) {
                case "SINGLE":
                    bill = units * 8;
                    break;
                case "SHARED":
                    bill = units * 6.0 / sc.nextInt();
                    break;
                default:
                    bill = units * 10 + 200;
            }

            System.out.printf("%s: %.2f%n", type, bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
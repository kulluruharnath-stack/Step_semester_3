import java.util.*;

class Problem4W9P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();
            double bill;

            switch (type) {
                case "HOME":
                    if (units <= 100)
                        bill = units * 5.0;
                    else
                        bill = 100 * 5.0 + (units - 100) * 7.0;
                    break;

                case "SHOP":
                    bill = units * 8.0 + 100;
                    break;

                default:
                    bill = Math.max(units * 6.0, 1000);
            }

            System.out.printf("%s: %.2f%n", type, bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
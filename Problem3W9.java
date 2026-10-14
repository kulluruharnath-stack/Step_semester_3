import java.util.*;

class Problem3W9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double fee;

            switch (type) {
                case "DAY_SCHOLAR":
                    fee = 40000 + 12000;
                    break;

                case "HOSTELLER":
                    fee = 40000 + 60000;
                    break;

                default:
                    fee = 20000 + 12000;
            }

            System.out.printf("%s: %.2f%n", name, fee);
            total += fee;
        }

        System.out.printf("Total Collected: %.2f%n", total);
        sc.close();
    }
}
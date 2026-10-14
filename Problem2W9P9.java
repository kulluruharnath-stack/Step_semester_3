import java.util.*;

class Problem2W9P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double pay;

            switch (type) {
                case "FULLTIME":
                    pay = sc.nextDouble();
                    break;

                case "HOURLY":
                    double hours = sc.nextDouble();
                    double rate = sc.nextDouble();

                    if (hours <= 40)
                        pay = hours * rate;
                    else
                        pay = 40 * rate + (hours - 40) * rate * 1.5;
                    break;

                default:
                    pay = sc.nextDouble();
            }

            System.out.printf("%s: %.2f%n", name, pay);
            total += pay;
        }

        System.out.printf("Total Payroll: %.2f%n", total);
        sc.close();
    }
}
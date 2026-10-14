import java.util.*;

class Problem2W8P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int h = sc.nextInt();
            double charge;

            switch (type) {
                case "BIKE":
                    charge = h * 10;
                    break;
                case "CAR":
                    charge = 30 + (h - 1) * 20;
                    break;
                default:
                    charge = Math.max(100, h * 50);
            }

            System.out.printf("%s: %.2f%n", type, charge);
            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
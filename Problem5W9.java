import java.util.*;

class Problem5W9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalCost = 0;

        for (int i = 0; i < n; i++) {
            String appliance = sc.next();
            double hours = sc.nextDouble();

            boolean saver = false;

            if (sc.hasNext("SAVER")) {
                sc.next();
                saver = true;
            }

            double power;

            switch (appliance) {
                case "FRIDGE":
                    power = 150;
                    break;
                case "AC":
                    power = 1500;
                    break;
                case "TV":
                    power = 100;
                    break;
                default:
                    power = 500;
            }

            if (saver &&
                !appliance.equals("AC") &&
                !appliance.equals("WASHER")) {
                System.out.println(
                    appliance + ": saver mode not supported"
                );
                continue;
            }

            double units = power * hours / 1000.0;

            if (saver) {
                units *= 0.75;
            }

            double cost = units * 8;

            System.out.printf(
                "%s: Units=%.2f Cost=%.2f%n",
                appliance, units, cost
            );

            totalCost += cost;
        }

        System.out.printf("Total Cost: %.2f%n", totalCost);
        sc.close();
    }
}
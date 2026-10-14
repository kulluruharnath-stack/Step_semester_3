import java.util.*;

class Problem1W9P9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String shape = sc.next();
            String owner = sc.next();
            double area;

            switch (shape) {
                case "CIRCLE":
                    area = Math.PI * sc.nextDouble()
                                 * sc.nextDouble();
                    // Corrected below: radius is read once.
                    break;
                case "RECTANGLE":
                    area = sc.nextDouble() * sc.nextDouble();
                    break;
                default:
                    area = 0.5 * sc.nextDouble() * sc.nextDouble();
            }

            System.out.printf("%s (%s): %.2f%n",
                              owner, shape, area);
            total += area;
        }

        System.out.printf("Total Area: %.2f%n", total);
        sc.close();
    }
}
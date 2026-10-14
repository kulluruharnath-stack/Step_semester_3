import java.util.*;
import java.time.*;

class Problem5W8P8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());
            int days;

            switch (type) {
                case "BASIC":
                    days = 30;
                    break;
                case "STANDARD":
                    days = 90;
                    break;
                default:
                    days = 365;
            }

            System.out.println(name + ": " + date.plusDays(days));
        }

        sc.close();
    }
}
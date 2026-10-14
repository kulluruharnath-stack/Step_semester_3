import java.util.*;
import java.time.*;
import java.time.format.*;

class Problem2W8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        LocalDate date = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            int pos = line.indexOf(' ');
            String type = line.substring(0, pos);
            String title = line.substring(pos + 1).replace("\"", "");
            int days = type.equals("BOOK") ? 14 :
                       type.equals("DVD") ? 7 : 3;

            System.out.println(title + ": " + date.plusDays(days));
        }
        sc.close();
    }
}
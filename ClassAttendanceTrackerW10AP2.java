import java.util.*;

class ClassAttendanceTrackerW10AP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int present = 0, streak = 0, longest = 0;

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();

            if (d == 1) {
                present++;
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
        }

        System.out.println("Present: " + present +
                           ", Longest streak: " + longest);
        sc.close();
    }
}
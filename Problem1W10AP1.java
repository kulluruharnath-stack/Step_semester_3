import java.util.*;

class Problem1W10AP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int best = -1, max = -1;

        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++)
                sum += sc.nextInt();

            if (sum > max) {
                max = sum;
                best = i;
            }
        }

        System.out.println("Row " + best + ", Total " + max);
        sc.close();
    }
}
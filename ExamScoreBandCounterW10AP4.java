import java.util.*;

class ExamScoreBandCounterW10AP4 {

    static int lowerBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] < x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    static int upperBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] <= x)
                l = m + 1;
            else
                r = m;
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++)
            scores[i] = sc.nextInt();

        int low = sc.nextInt();
        int high = sc.nextInt();

        System.out.println(
            upperBound(scores, high) - lowerBound(scores, low)
        );

        sc.close();
    }
}
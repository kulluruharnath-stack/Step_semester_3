import java.util.*;

class Problem5W10P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sum = 0, rev = 0, x = n;

        while (x > 0) {
            int d = x % 10;
            sum += d;
            rev = rev * 10 + d;
            x /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + rev);
        sc.close();
    }
}
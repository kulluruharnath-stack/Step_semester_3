import java.util.*;
import java.util.regex.*;

class Problem4W8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double total = 0;

        Pattern p = Pattern.compile("\"([^\"]*)\"|(\\S+)");

        for (int i = 0; i < n; i++) {
            Matcher m = p.matcher(sc.nextLine());
            ArrayList<String> a = new ArrayList<>();

            while (m.find())
                a.add(m.group(1) != null ? m.group(1) : m.group(2));

            String type = a.get(0);
            String correct = a.get(2);
            String answer = a.get(3);
            double points = Double.parseDouble(a.get(4));
            double score = 0;

            if (type.equals("MCQ") || type.equals("TF")) {
                if (correct.equalsIgnoreCase(answer))
                    score = points;
            } else {
                int count = 0;
                for (String k : correct.split(",")) {
                    if (answer.toLowerCase().contains(k.trim().toLowerCase()))
                        count++;
                }

                if (count >= 2) score = points * 0.75;
                else if (count == 1) score = points * 0.50;
            }

            System.out.printf("%s: %.2f%n", type, score);
            total += score;
        }

        System.out.printf("Total Score: %.2f%n", total);
        sc.close();
    }
}
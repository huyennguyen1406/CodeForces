package Functions;

import java.util.Scanner;

public class SystemOfEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = countPairs(n, m);
        System.out.println(count);
        sc.close();
    }

    private static int countPairs(int n, int m) {
        int count = 0;
        for (int a = 0; a <= n; a++) {
            for (int b = 0; b <= m; b++) {
                if (a * a + b == n && a + b * b == m) {
                    count++;
                }
            }
        }
        return count;
    }
}

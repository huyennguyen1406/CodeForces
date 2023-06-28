package Arrays;

import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        int count = 0;
        while (count < n && scores[count] >= scores[k - 1] && scores[count] > 0) {
            count++;
        }
        System.out.println(count);
        sc.close();
    }
}

package Sorting;

import java.util.Scanner;

public class BuggySorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n <= 2) {
            System.out.println("-1");
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.printf("%d ", i);
            }
            System.out.println();
            scanner.close();
        }
    }
}

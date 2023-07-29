package Sorting;

import java.util.Scanner;

public class Towers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] count = new int[1001]; // Đếm số lượng thanh gỗ của mỗi độ dài
        for (int i = 0; i < n; i++) {
            int length = scanner.nextInt();
            count[length]++;
        }

        int maxHeight = 0; // Chiều cao của tòa tháp cao nhất
        int towerCount = 0; // Tổng số tòa tháp
        for (int i = 1; i <= 1000; i++) {
            if (count[i] > 0) {
                towerCount += 1;
                if (count[i] > maxHeight) {
                    maxHeight = count[i];
                }
            }
        }

        System.out.printf("%d %d\n", maxHeight, towerCount);
        scanner.close();
    }
}

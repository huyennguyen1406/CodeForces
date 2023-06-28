package Loops;

import java.util.Scanner;

public class VanyaCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height = 1;
        int remaining = n;
        while (remaining >= height * (height + 1) / 2) {
            remaining -= height * (height + 1) / 2;
            height++;
        }
        System.out.println(height - 1);
        sc.close();
    }
}

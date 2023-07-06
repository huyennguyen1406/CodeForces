package Statement;

import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int max_dominoes;
        if (M % 2 == 1 && N % 2 == 1) {
            max_dominoes = (M*N - 1) / 2;
        } else {
            max_dominoes = (M*N) / 2;
        }
        System.out.println(max_dominoes);
        sc.close();
    }
}

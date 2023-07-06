import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int max_dominoes;
        if (M % 2 == 1 && N % 2 == 1) {
            // If both dimensions are odd, we can place one vertical domino in the middle
            max_dominoes = (M*N - 1) / 2;
        } else {
            // Otherwise, we can cover the entire board with horizontal dominoes
            max_dominoes = (M*N) / 2;
        }
        System.out.println(max_dominoes);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true; // 처음에 모두 소수라고 가정
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!isPrime[i]) continue; // 이미 소수가 아니라고 표시된 경우 건너뜀
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false; // i의 배수를 소수가 아니라고 표시
            }
        }

        for (int i = m; i <= n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
}
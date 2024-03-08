import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int numbers[] = new int[N];
		for (int i = 0; i < N; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
		int cnt = 0; // 소수 개수
		for (int i = 0; i < numbers.length; i++) {
			int a = 0;
			if (numbers[i] == 1)
				continue;
			for (int j = 2; j < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					a++;
				}
			}
			if(a == 0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

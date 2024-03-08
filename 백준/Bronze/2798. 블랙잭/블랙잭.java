import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] card = new int[N];
		for(int i=0; i<card.length; i++) {
			card[i] = sc.nextInt();
		}
		
		int max = 0;
		int sum = 0;
		for(int j=0; j<N; j++) {
			for(int k=0; k<N; k++) {
				for(int l=0; l<N; l++) {
					if(j == k || k == l || l == j)
						continue;
					else if(card[j] + card[k] + card[l] > M) 
						continue;
					sum = card[j] + card[k] + card[l];
					if (max < sum) 
						max = sum;
				}
			}
		}
		System.out.println(max);
	}

}

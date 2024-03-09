import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 각 변들의 길이 정수 배열로 입력 받기 
			int[] triangle = new int[3];
			for(int i=0; i<3; i++) {
				triangle[i] = sc.nextInt();
			}
			
			// 0 0 0 입력 시 while문 종료 
			if(triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0)
				break;
			
			// 가장 큰 길이를 trianle[2]로 두기 위해 정렬
			Arrays.sort(triangle);
			// 피타고라스 정리 사용 
			int a2 = triangle[0] * triangle[0];
			int b2 = triangle[1] * triangle[1];
			int c2 = triangle[2] * triangle[2];
			
			String result;
			if(c2 == a2 + b2) 
				result = "right";     // 맞다면 right
			else
				result = "wrong";     // 아니라면 wrong
			
			System.out.println(result);
		}
		sc.close();  
	}
}

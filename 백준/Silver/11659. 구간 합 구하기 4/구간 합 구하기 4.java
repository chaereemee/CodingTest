import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] sArr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();

            if(i==0) sArr[i] = arr[i];
            else sArr[i] = sArr[i-1] + arr[i];
        }

        for(int i=0; i<m; i++) {
            int i_idx = sc.nextInt();
            int j_idx = sc.nextInt();

            if(i_idx == 1) System.out.println(sArr[j_idx-1]);
            else System.out.println(sArr[j_idx-1] - sArr[i_idx-2]);
        }
    }
}
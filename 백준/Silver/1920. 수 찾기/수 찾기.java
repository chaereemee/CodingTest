import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<m; i++) {
            int target = sc.nextInt();
            int start = 0;
            int end = arr.length - 1;
            boolean find = false;
            while(start <= end) {
                int mid = (start + end) / 2;
                int midValue = arr[mid];
                
                if(target > midValue) {
                    start = mid + 1;
                } else if (target < midValue) {
                    end = mid - 1;
                } else {
                    find = true;
                    break;
                }
            }
            if(find) sb.append("1\n");
            else sb.append("0\n");
        }
        System.out.println(sb.toString());
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine(); // "55-50+4"
        
        String[] strArr = expression.split("-"); // ["55", "50+4"]
        int answer = 0;
        for(int i=0; i<strArr.length; i++) {
            int temp = mySum(strArr[i]);
            if(i == 0) answer += temp;
            else answer -= temp;
        }
        System.out.println(answer);
    }
    
    private static int mySum(String str) {
        int sum = 0;
        String[] temp = str.split("[+]"); // ["50", "4"]
        for(int i=0; i<temp.length; i++) {
            sum += Integer.parseInt(temp[i]);
        }
        return sum;
    }
}
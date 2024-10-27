import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        
        sum1(a, b, c);
        sum2(a, b, c);
    }
    
    private static void sum1(String a, String b, String c) {
        int abc = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        System.out.println(abc);
    }
    
    private static void sum2(String a, String b, String c) {
        int abc = Integer.parseInt(a+b) - Integer.parseInt(c);
        System.out.println(abc);
    }
}
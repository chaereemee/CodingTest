import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        String s3 = br.readLine();
        
        int result = 0;
        
        if(isNumber(s1)) result = Integer.parseInt(s1) + 3;
        else if(isNumber(s2)) result = Integer.parseInt(s2) + 2;
        else if(isNumber(s3)) result = Integer.parseInt(s3) + 1;
        
        if(result % 3 == 0 && result % 5 == 0) System.out.println("FizzBuzz");
        else if(result % 3 == 0) System.out.println("Fizz");
        else if(result % 5 == 0) System.out.println("Buzz");
        else System.out.println(result);
    }
    
    private static boolean isNumber(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
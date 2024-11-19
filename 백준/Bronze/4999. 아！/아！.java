import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String jhSay = br.readLine();
        String drSay = br.readLine();
        
        if(jhSay.contains(drSay)) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
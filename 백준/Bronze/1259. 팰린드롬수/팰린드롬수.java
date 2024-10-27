import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean stop = false;
        while (!stop) {
            String str = br.readLine();
            if(str.charAt(0) == '0') {
                stop = true;
                break;
            }
            int start = 0;
            int end = str.length() - 1;
            boolean 팰린드롬수 = false;
            while(start <= end) {
                if(str.charAt(start++) == str.charAt(end--))
                    팰린드롬수 = true;
                else {
                    팰린드롬수 = false;
                    break;
                }
            }
            if(팰린드롬수)
                System.out.println("yes");
            else
                System.out.println("no");
        }
    }
}
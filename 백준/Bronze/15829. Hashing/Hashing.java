import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        String s = br.readLine();

        final int r = 31;
        final int M = 1234567891;

        long hashValue = 0;
        long power = 1;

        for (int i = 0; i < L; i++) {
            int charValue = s.charAt(i) - 'a' + 1;
            hashValue = (hashValue + charValue * power) % M;
            power = (power * r) % M;
        }

        System.out.println(hashValue);
    }
}

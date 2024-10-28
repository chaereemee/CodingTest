import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        TreeSet<Integer> sortedSet = new TreeSet<>();
        for(int i=0; i<N; i++) {
            sortedSet.add(Integer.parseInt(br.readLine()));
        }

        StringBuilder sb = new StringBuilder();
        for(int num : sortedSet) {
            sb.append(num+"\n");
        }
        
        System.out.println(sb);
    }
}
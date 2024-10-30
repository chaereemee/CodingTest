import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<String> sortedList = new ArrayList<>();
        for(int i=0; i<N; i++) {
            sortedList.add(br.readLine());
        }
        
        sortedList.sort(
            Comparator.comparingInt((String s) -> Integer.parseInt(s.split(" ")[1]))
                      .thenComparingInt(s -> Integer.parseInt(s.split(" ")[0]))
        );
        
        StringBuilder sb = new StringBuilder();
        for(String s : sortedList) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}
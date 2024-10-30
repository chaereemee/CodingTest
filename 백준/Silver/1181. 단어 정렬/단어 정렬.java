import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 중복 제거
        Set<String> wordsSet = new HashSet<>();
        for(int i=0; i<N; i++) {
            wordsSet.add(br.readLine());
        }
        
        // Set -> List
        List<String> wordsList = new ArrayList<>(wordsSet);
        wordsList.sort(
            Comparator.comparingInt(String::length)
                      .thenComparing(String::compareTo)
        );
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(String word : wordsList) {
            sb.append(word).append("\n");
        }
        System.out.println(sb);
    }
}
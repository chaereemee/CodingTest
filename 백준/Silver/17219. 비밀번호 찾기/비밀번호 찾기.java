import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, String> program = new HashMap<>();
        for(int i=0; i<N; i++) {
            String line = br.readLine();
            String[] tokens = line.split(" ");
            program.put(tokens[0], tokens[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++) {
            String site = br.readLine();
            if(program.containsKey(site)) {
                sb.append(program.get(site)).append("\n");
            }
        }
        System.out.println(sb);
    }
}

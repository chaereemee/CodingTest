import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            String str = br.readLine();
            String[] parts = str.split(" ");
            String command = parts[0];

            if (command.equals("add")) {
                set.add(Integer.parseInt(parts[1]));
            } else if (command.equals("remove")) {
                set.remove(Integer.parseInt(parts[1]));
            } else if (command.equals("check")) {
                if (set.contains(Integer.parseInt(parts[1]))) {
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if (command.equals("toggle")) {
                int num = Integer.parseInt(parts[1]);
                if (set.contains(num)) {
                    set.remove(num);
                } else {
                    set.add(num);
                }
            } else if (command.equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (command.equals("empty")) {
                set.clear();
            }
        }

        System.out.print(sb);
    }
}
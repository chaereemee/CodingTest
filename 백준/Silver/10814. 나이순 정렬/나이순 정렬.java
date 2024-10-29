import java.util.*;
import java.io.*;

class Member {
    int age;
    String name;
    
    Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        List<Member> members = new ArrayList<>();
        // 회원 정보 입력
        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            members.add(new Member(age, name));
        }
        
        // 정렬 : 나이순으로 정렬, 나이가 같으면 입력 순서 유지
        members.sort(Comparator.comparingInt((Member m) -> m.age));
        
        // 출력
        StringBuilder sb = new StringBuilder();
        for(Member m : members) {
            sb.append(m.age+" ").append(m.name).append("\n");
        }
        System.out.println(sb);
    }
}
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static StringTokenizer st;
    static int N;
    static Person NH[];

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        while(true) {
            N = Integer.parseInt(br.readLine());
            if (N == 0) break;
            input();
            logic();
        }
        System.out.println(sb);
    }

    static class Person implements Comparable<Person> {
        String name;
        double height;

        public Person(String name, double height) {
            this.name = name;
            this.height = height;
        }

        @Override
        public int compareTo(Person other) { // 나의 키와 상대방의 키를 비교
            if (this.height < other.height) { // 내 키가 상대방 키보다 작을 경우
                return Double.compare(other.height, this.height); // 내림차순
            }
            else if (this.height == other.height) { // 같을 경우
                return Double.compare(this.height, other.height); // 입력 순이니 그대로 둠
            }
            else { // 작을 경우
                return Double.compare(other.height, this.height); // 내림차순
            }
        }
    }
    static void input() throws IOException {
        NH = new Person[N];
        for (int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double height = Double.parseDouble(st.nextToken());
            NH[i] = new Person(name, height); // 이름, 키 집어넣기
        }
    }

    static void logic() {
        Arrays.sort(NH);
        for (int i=0; i<N-1; i++) {
            if (NH[i].height == NH[i+1].height) {
                sb.append(NH[i].name).append(" ").append(NH[i+1].name).append(" ");
                i++;
                if (i >= N)
                    break;
            }
            else {
                sb.append(NH[0].name).append("\n");
                break;
            }
        }
    }
}
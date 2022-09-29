import java.io.*;
import java.util.Stack;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;
    static Stack<Integer> st;
    static int K, num, cnt;

    public static void main(String[] args) throws IOException {
        st = new Stack();
        input();
    }

    static void input() throws IOException {
        // https://st-lab.tistory.com/174
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
        K = Integer.parseInt(br.readLine());

        for (int i = 0; i < K; i++) {
            num = Integer.parseInt(br.readLine());
            if (num == 0) {
                st.pop();
                continue;
            }
            st.push(num);
        }

        if (st.empty()){ // 스택 전체를 보는 거라 for문 안에 넣으면 X
            System.out.println("0");
        }
        else {
            for (int i = 0; i < st.size(); i++) {
                cnt += st.get(i); // st의 인덱스값 더하기
            }
            System.out.println(cnt);
        }
    }
}
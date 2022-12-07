import java.io.*;
import java.util.*;

public class Main {
    // https://zzang9ha.tistory.com/220
    static BufferedReader br;
    static StringBuilder sb;
    static String str;

    public static void main(String[] args) throws IOException {
        input();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();

        while(true) {
            str = br.readLine();
            if(str.equals(".")) {
                break;
            }
            Stack<Character> st = new Stack<Character>();
            String result = "";
            boolean flag = true;

            for(int i=0; i<str.length(); i++) {
                /* 여는 괄호 '(' 나 '[' 는 스택에 넣기 */
                if(str.charAt(i) == '(') {
                    st.push('(');
                }

                else if(str.charAt(i) == '[') {
                    st.push('[');
                }

                /* 닫는 괄호 ')' 나 ']' 는 스택이 비어 있거나 여는 괄호와 짝이 맞지 않는 경우 -> 탈출 */
                /* 스택이 비어 있는 경우 -> 입력이 ))] 와 같은 경우, */
                /* 짝이 맞지 않는 경우 -> (([) 와 같은 경우, */
                else if(str.charAt(i) == ')') {
                    if(st.isEmpty() || st.peek() != '(') {
                        flag = false;
                        break;
                    }
                    st.pop();
                }
                else if(str.charAt(i) == ']') {
                    if(st.isEmpty() || st.peek() != '[') {
                        flag = false;
                        break;
                    }
                    st.pop();
                }
            }

            // 스택이 비어 있지 않으면 균형이 맞지 않는 경우
            if(!st.isEmpty()) {
                flag = false;
            }
            result = (flag) ? "yes" : "no";
            sb.append(result).append("\n");
        }
        System.out.println(sb);
    }
}
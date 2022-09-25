import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        input();
        logic();
    }

    static void input() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        sb = new StringBuilder();
    }

    static void logic() {
        sb.append("         ,r'\"7").append("\n");
        sb.append("r`-_   ,'  ,/").append("\n");
        sb.append(" \\. \". L_r'").append("\n");
        sb.append("   `~\\/").append("\n");
        sb.append("      |").append("\n");
        sb.append("      |").append("\n");
        System.out.println(sb);
    }
}
/*
         ,r'"7
r`-_   ,'  ,/
 \. ". L_r'
   `~\/
      |
      |
 */

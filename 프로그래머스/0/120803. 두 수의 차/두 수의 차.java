import java.io.*;
import java.util.*;

class Solution {
    // static BufferedReader br;
    // static StringBuilder sb;
    // static StringTokenizer st;
    
    public int solution(int num1, int num2) { // 프로그래머스 : 백준과 다르게 내가 값을 입력할 필요가 없음
        // br = new BufferedReader(new InputStreamReader(System.in));
        // st = new StringTokenizer(br.readLine());
        // sb = new StringBuilder();
        int answer = 0;
        // num1 = Integer.parseInt(st.nextToken());
        // num2 = Integer.parseInt(st.nextToken());
        
        answer = num1 - num2;
        return answer;
    }
}
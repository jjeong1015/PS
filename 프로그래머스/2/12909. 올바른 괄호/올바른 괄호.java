import java.util.*;

class Solution {
    // https://silverji.tistory.com/229?category=1320822
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('('); // 삽입
            } else { // '(' 또는 ')' 만 입력하기에 else문이 if (s.charAt('i') == ')') 인 것과 같음
                if (stack.isEmpty()) return false;
                stack.pop(); // 삭제
            } 
        }
        if (!stack.isEmpty()) return false;
        return answer;
    }
}
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        
        String answer1 = as + bs;
        String answer2 = bs + as;
        
        int aas = Integer.parseInt(answer1);
        int bbs = Integer.parseInt(answer2);
        
        if (aas >= bbs) {
            answer = aas;
        } else {
            answer = bbs;
        }
        
        return answer;
    }
}
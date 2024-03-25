class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int numLen = num_list.length;
        answer = new int[numLen+1];
        
        for (int i=0; i<num_list.length; i++) {
            answer[i] = num_list[i];
        }
        
        if (num_list[numLen-2] < num_list[numLen-1]) {
            answer[numLen] = num_list[numLen-1] - num_list[numLen-2]; 
        } else {
            answer[numLen] = num_list[numLen-1] * 2;
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for (int i=0; i<num_list.length; i++) {
            multi *= num_list[i];
            sum += num_list[i];
        }
        int square = sum * sum;
        
        if (multi < square) {
            answer = 1;
        }
        if (multi > square) {
            answer = 0;
        }
        return answer;
    }
}
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;

        String odd = "";
        String even = "";
        
        for (int i=0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 1) {
                odd += Integer.toString(num_list[i]);
            }
            if (num_list[i] % 2 == 0) {
                even += Integer.toString(num_list[i]);
            }
        }
        
        int answer1 = Integer.parseInt(odd);
        int answer2 = Integer.parseInt(even);
        answer = answer1 + answer2;
        return answer;
    }
}
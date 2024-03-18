class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        
        int myLen = my_string.length();
        int overLen = overwrite_string.length();
        
        answer += my_string.substring(s+overLen);
        
        return answer;
    }
}
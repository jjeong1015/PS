class Solution {
    public String solution(String code) {
        String answer = "";
        int mode = 0;
        System.out.println("mode : " + mode);
        for (int i=0; i<code.length(); i++) {
            if (code.charAt(i) == '1') {
                if (mode == 0) {
                    // System.out.println("0 -> 1");
                    mode = 1;
                    // System.out.println("mode : " + mode + ", code[ " + i + " ] : " + code.charAt(i));
                    continue; // 중요
                }
                if (mode == 1) {
                    // System.out.println("1 -> 0");
                    mode = 0;
                    // System.out.println("mode : " + mode + ", code[ " + i + " ] : " + code.charAt(i));
                    continue; // 중요
                }
            }
            if (mode == 0) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 0) {
                        answer += code.charAt(i);
                    }
                }
            }
            if (mode == 1) {
                if (code.charAt(i) != '1') {
                    if (i % 2 == 1) {
                        answer += code.charAt(i);
                    }
                }
            }
        }
        if (answer == "") {
            answer += "EMPTY";
        }
        return answer;
    }
}
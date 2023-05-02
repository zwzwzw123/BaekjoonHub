class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] strArr = my_string.split("");
        for(int i =0;i<my_string.length();i++){
            answer+=strArr[i].repeat(n);
        }
        return answer;
    }
}
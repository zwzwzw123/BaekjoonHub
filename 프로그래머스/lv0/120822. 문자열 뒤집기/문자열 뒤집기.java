class Solution {
    public String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        sb.append(my_string);
        String answer = sb.reverse().toString();
        
        return answer;
    }
}
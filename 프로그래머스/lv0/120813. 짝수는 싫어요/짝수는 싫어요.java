class Solution {
    public int[] solution(int n) {
        //n짝수, 홀수 판별
        int[] answer={};
        int m=0;
        //홀수 일때
        if(n%2==1){
            m = n/2+1;
            answer =new int[m];
            
        }
        //짝수 일때
        else{
            n=n-1;
            m =n/2+1;
             answer =new int[m];
            
        }
        
       for(int i =0;i<m;i++){
       answer[i]=2*i+1;
        }
        
        
        return answer;
    }
}
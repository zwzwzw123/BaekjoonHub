class Solution {
    public int solution(int balls, int share) {
       double answer = 0;
        int i;
        double n = 1; 
        double m = 1;
        double nm = 1;

        for(i =1 ; i <=balls; i++){
            n *= i;
        }
        for(i = 1; i <= balls-share; i++){
            nm *= i;
        }
        for(i = 1; i <=share; i++){
            m *= i;
        }

        answer = n / nm / m;
        return (int)Math.round(answer);
    }
}
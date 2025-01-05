class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int[] newWallet = change(wallet);
        int[] newBill = change(bill);

        while(newWallet[0] < newBill[0] || newWallet[1] <newBill[1]){
            answer++;
            newBill[0] /=2;
            newBill= change(newBill);
        }
        return answer;
    }
    public int[] change(int[] value){
        int max = Math.max(value[0],value[1]);
        int min = Math.min(value[0],value[1]);
        return new int[]{max,min};
    }
}
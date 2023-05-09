import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();
        for(String player : participant)
            map.put(player,map.getOrDefault(player,0)+1);
        for(String player : completion)
            map.put(player, map.get(player)-1);
        
        Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();
        while(itr.hasNext()){
            Map.Entry<String, Integer>entry = itr.next();
            if(entry.getValue()!=0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int openStart = convertTime(op_start);
        int openEnd = convertTime(op_end);
        int present = convertTime(pos) ;
        int video = convertTime(video_len);
        
        present = skipOpening(present,openStart,openEnd);  
        for(int i = 0; i<commands.length; i++) {
            present = commands[i].equals("prev") ? prev(present) : next(video, present);
            present = skipOpening(present,openStart,openEnd);
        }
        return convertTime(present);

    }

    public int prev(int present){
        return Math.max(0, present-10);
    }
    public int next(int video, int present){
        return Math.min(video, present +10);

    }
    public int convertTime(String value){
        String[] part = value.split(":");
        return Integer.parseInt(part[0])*60 +Integer.parseInt(part[1]);
    }

    public String convertTime(int value){
        int minute = value / 60;
        int second = value % 60;
        return String.format("%02d:%02d", minute,second);
    }
    public static int skipOpening(int present, int openStart, int openEnd){
        if(openStart <= present && present <= openEnd){
            present = openEnd;
        }
        return present;
    }
}
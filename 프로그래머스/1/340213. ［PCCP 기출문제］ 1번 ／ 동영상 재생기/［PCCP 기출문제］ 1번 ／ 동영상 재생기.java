class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int openStart = convertTime(op_start);
        int openEnd = convertTime(op_end);
        int present = convertTime(pos) ;
        if(openStart <= present && present <= openEnd){
            present = openEnd;
        }
        
        for(int i = 0; i<commands.length; i++){ 
            present = commands[i].equals("prev") ? prev(present, openStart, openEnd) : next(video_len,present, openStart, openEnd);
                        if (openStart <= present && present <= openEnd) {
                present = openEnd;
            }
        }
        return convertTime(present);

    }

    public int prev(int present,int openStart,int openEnd){
        present-=10;
        if(present <=0){
            return 0;
        } 
        // else if(openStart <= present && present <= openEnd) {
        //     return openEnd;
        // } 
        else {
            return present;
        }

    }
    public int next(String video_len, int present,int openStart,int openEnd){
        present+=10;
        int video = convertTime(video_len);
        if(present >= video){
            return video;
        } 
        // else if(openStart <= present && present <= openEnd) {
        //     return openEnd;
        // }
        else {
            return present;        
        }
    }
    public int convertTime(String value){
         int minute = Integer.parseInt(value.split(":")[0]);
        int second = Integer.parseInt(value.split(":")[1]);
        return minute*60 + second ;
    }

    public String convertTime(int value){
        int minute = value / 60;
        int second = value % 60;

        String strMinute = String.valueOf(minute);
        String strSecond = String.valueOf(second);

        if(minute < 10){
            strMinute = "0" + strMinute;
        }
        if(second < 10){
            strSecond = "0" +strSecond;
        }
        return strMinute+":"+strSecond;
    }
}
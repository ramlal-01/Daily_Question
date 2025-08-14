// Last updated: 14/8/2025, 4:26:00 pm
class Solution {
    public int countSeniors(String[] details) {
        int ag=0;
        int f=0;
        for(int i=0;i<details.length; i++){
            ag = (details[i].charAt(11)-'0')*10 + (details[i].charAt(12)-'0');
            
            if(ag>60){
                f+=1;
            }
        }
        return f;
    }
}
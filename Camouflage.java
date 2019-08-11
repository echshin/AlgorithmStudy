import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int cnt = 0;
        
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
        for(int i=0; i<clothes.length; i++){
            if(hMap.containsKey(clothes[i][1])){ //카테고리쓰
                hMap.put(clothes[i][1], hMap.get(clothes[i][1]) + 1);
            }else{
                 hMap.put(clothes[i][1], 1);
            }
        }
        
        for(String key : hMap.keySet()){
            answer *= hMap.get(key) + 1; // 암껏도 안입는경우
        }
        answer--; // 하나도 안입는조건 제외
        
        return answer;
    }
}
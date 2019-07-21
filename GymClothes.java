import java.util.Arrays;

public class GymClothes {

	public static void main(String[] args) {
		GymClothes gym = new GymClothes();
		int lost[] = new int[] {2, 4};
		int reserve[] = new int[] {1, 3, 5};
		System.out.println("결과 " + gym.solution(5, lost, reserve));
	}	
	
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
        answer = n - lost.length; // 리얼 가지고 있는 애들 구하기
        int front = 0, back = 0;
        
        Arrays.sort(lost);
		Arrays.sort(reserve);
        
        //겹치는 것 삭제
        for(int i=0; i<lost.length; i++){
            if(lost[i] == 0){ continue; }
        	for(int j=0; j<reserve.length; j++) {
        		if(reserve[j] == 0){ continue; }
        		else if(lost[i] == reserve[j]){
                    lost[i] = 0; reserve[j] = 0;
                    answer++;
                }
        	}
        }
        
        for(int i=0; i<lost.length; i++){
            if(lost[i] == 0){ continue; }
            for(int j=0; j<reserve.length; j++){
                if(reserve[j] == 0){ continue; }
                else{
                    front = lost[i] - 1;
                    back = lost[i] + 1;
                    
                    if(reserve[j] == front || reserve[j] == back){
                        lost[i] = 0;
                        reserve[j] = 0;
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}

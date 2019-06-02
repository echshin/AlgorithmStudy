import java.util.PriorityQueue;

public class MoreSpicy {
	public static void main(String[] args) {		
		int scoville[] = new int[] { 1, 2, 3, 9, 10, 12 };
		System.out.println(solution(scoville, 7));
	}
	
	public static int solution(int[] scoville, int K) {
		int answer = 0;
		int calculate = 0;

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++) {
        	priorityQueue.add(scoville[i]);
        }
        
        while(true) {
			if (priorityQueue.peek() >= K) {
				break;
			} else if (priorityQueue.size() == 1) {
				answer = -1;
				break;
			} else {
				calculate = priorityQueue.poll();
				calculate += priorityQueue.poll() * 2;
				priorityQueue.add(calculate);
				
				answer++;
			}
		}
        return answer;
    }	
}

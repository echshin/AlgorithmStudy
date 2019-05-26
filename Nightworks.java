public class Nightworks {
	public static void main(String[] args) {
		int[] works = new int[] {4, 3, 3};
		int n = 4;
		Nightworks nw = new Nightworks();
		
		System.out.println(nw.solution(works, n));
	}
	public long solution(int[] works, int n) {
		long answer = 0;
		while(n > 0) {
			int maxIdx = 0;
			for(int i=maxIdx; i<works.length-1; i++) {
				if(works[maxIdx] < works[i+1]) {
					maxIdx = i+1;
				}
			}
			if(works[maxIdx] == 0) {
				break;
			}
			works[maxIdx]--;
			n--;
		}
		
		for(int i=0; i<works.length; i++) {
			answer += Math.pow(works[i], 2);
//			System.out.print(works[i]+" ");
//			System.out.println();
		}
		return answer;
	}
}

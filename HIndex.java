public class HIndex {

	public static void main(String[] args) {
		int citations[] = new int[] {51, 22, 20, 14, 10, 4, 3};
		System.out.println(solution(citations));
	}
	
	 static public int solution(int[] citations) {
	        int answer = citations.length;	  
	        sortingDesc(citations);
	        
	        int cnt=0; //카운트 
	        for(int i=0; i<citations.length; i++) {
	        	cnt++;
	        	if(cnt > citations[i]) {
	        		answer = --cnt;
	        		break;
	        	}
	        }
	        return answer;
	    }
	 
	 public static void sortingDesc(int []arr) {
		 int temp;
		 for(int i=0; i<arr.length; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i] < arr[j]) {
					 temp = arr[j];
					 arr[j] = arr[i];
					 arr[i] = temp;
				 }
			 }
		 }
	 }
}

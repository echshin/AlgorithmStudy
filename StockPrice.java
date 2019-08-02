
public class StockPrice {

	public static void main(String[] args) {
		int[] prices = new int[] {1, 2, 3, 2, 3};
		int[] result;
		
		StockPrice stock = new StockPrice();
		result = stock.solution(prices);
		
		for(int i=0; i<result.length; i++) { System.out.println(result[i]); }
	}
	
	 public int[] solution(int[] prices) {
		 int[] answer = {};
		 
		 answer = new int[prices.length];
		 for(int i=0; i<prices.length; i++){
			answer[i] = 0;
			for(int j=i+1; j<prices.length; j++) {
				if(prices[i] > prices[j]) {
					answer[i]++;
					break;
				}else {
					answer[i]++;
				}
			}
	            
		 }
		 return answer;
	  }
	 
}


public class PhoneNumber {
	public static void main(String[] args) {
		String[] pb = new String[] {"119", "97674223", "1195524421"};
		System.out.println(solution(pb));
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        
        for(int i=0; i<phone_book.length; i++) {
        	for(int j=0; j<phone_book.length; j++) {
        		if(i != j && phone_book[i].startsWith(phone_book[j])) { //접두사 비교
        			return false;
        		}
        	}
        }
        return answer;
    }
}

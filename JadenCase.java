
public class JadenCase {
	public static void main(String[] args) {
		String s = "3people unFollowed     me";
		JadenCase jaden = new JadenCase();
		
		System.out.println(jaden.solution(s));
	}
	
	public String solution(String s) {
		String answer = "";
		
		boolean space = true; // 앞 스페이스 여부 구분
		char temp;
	    
	    for(int i=0; i<s.length(); i++){
	    	temp = s.charAt(i);
	    	if(temp == ' ') {
	    		space = true;
	    	}
	    	else {
	    		if(space) {
	    			temp = Character.toUpperCase(temp);
	    			space = false;
	    		}
	    		else {
	    			temp = Character.toLowerCase(temp);
	    		}
	    	}
	    	answer += temp;
	      }
	    return answer;
	 }  
}

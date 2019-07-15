
public class BaseballGame {

	public static void main(String[] args) {
		int example[][] = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};
		BaseballGame bsg = new BaseballGame();
		
		System.out.println("결과 : "+bsg.solution(example));
	}
	
	public int solution(int[][] baseball) {
		int answer = 0;

		for (int i = 100; i <= 987; i++) {
			int cnt = 0, strike = 0, ball = 0;
			for (int j = 0; j < baseball.length; j++) {
				if (isOkExample(String.valueOf(i))) {
					int x = (i / 100);
					int y = (i / 10) % 10;
					int z = i % 10;

					int real_x = (baseball[j][0] / 100);
					int real_y = (baseball[j][0] / 10) % 10;
					int real_z = baseball[j][0] % 10;

					strike = 0; ball = 0; // 초기화

					if (x == real_x) { strike++; }
					if (y == real_y) { strike++; }
					if (z == real_z) { strike++; }

					if ((x == real_y) || (x == real_z)) { ball++; }
					if ((y == real_x) || (y == real_z)) { ball++; }
					if ((z == real_x) || (z == real_y)) { ball++; }
					
					// 확인 //
					if (strike == baseball[j][1] && ball == baseball[j][2]) {
						cnt++;
					}
					if (baseball.length == cnt) {
						answer++;
					}
				}
				else {
					break;
				}
			}
		}
		return answer;
	}

	public boolean isOkExample(String ex) {
		boolean result = true;
		if (ex.charAt(0) == ex.charAt(1) || ex.charAt(0) == ex.charAt(2) || ex.charAt(1) == ex.charAt(2)) {
			result = false;
		}
		if (ex.charAt(0) == '0' || ex.charAt(1) == '0' || ex.charAt(2) == '0') {
			result = false;
		}
		return result;
	}
	
	
}

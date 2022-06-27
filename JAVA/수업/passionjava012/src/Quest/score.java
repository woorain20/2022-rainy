package Quest;
	public class score {
		
		private int kicker1;
		private int kicker2;
		private int enemykicker;
		private int score;
		
		public score(int first, int second , int lose, int goal) {
			first=kicker1;
			second=kicker2;
			lose= enemykicker;
			goal=score;
		}
		public int k1scoring(int amount) {
			score+=amount;
			return score;
		}
		public int k2scoring(int amount) {
			score+=amount;
			return score;
		}
		public int keeping(int amount) {
			score-=amount;
			return score;
		}
		public int scoreboard() {
			System.out.println("첫번째 키커득점: " + kicker1);
			System.out.println("두번째 키커득점: " + kicker2);
			System.out.println("실점: " + enemykicker);
			System.out.println("점수: " + score);
			return score;
		}
		
	}

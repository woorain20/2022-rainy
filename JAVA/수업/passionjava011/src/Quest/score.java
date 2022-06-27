package Quest;
	public class score {
		int score = 0;
		public int MiddleShoot(int goal) {
			score += goal;
			return score;
		}
		public int LongLangeShoot(int thirdpointgoal) {
			score += thirdpointgoal;
			return score;
		}
		public int point() {
			System.out.println("½ºÄÚ¾î:" + score);
			return score;
		}
		public static void main(String[] args) {
			score team1 = new score();
			score team2 = new score();
			
			team1.MiddleShoot(4);
			team2.MiddleShoot(14);
			
			team1.LongLangeShoot(30);
			team2.LongLangeShoot(12);
			
			team1.point();
			team2.point();
		}
	}

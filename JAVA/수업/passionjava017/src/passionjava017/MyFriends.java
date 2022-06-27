package passionjava017;

public class MyFriends {
	public static void main(String[] args) {
		UnivFriend[]ufrns=new UnivFriend[5];
		int unct=0;
		
		CompFriend[]cfrns=new CompFriend[5];
		int ccnt=0;
		
		ufrns[unct++]=new UnivFriend("Tom", "computer", "010-111-1111");
		ufrns[unct++]=new UnivFriend("Bill", "Electornics", "010-222-1221");
		
		cfrns[ccnt++]=new CompFriend("Kelly", "Financial", "010-448-4449");
		cfrns[ccnt++]=new CompFriend("John", "R&D", "010-158-1215");
		
		for(int i=0;i<unct;i++) {
			ufrns[i].showInfo();
			System.out.println();
		}
		for(int i=0;i<ccnt;i++) {
			cfrns[i].showInfo();
			System.out.println();
		}
	}
}

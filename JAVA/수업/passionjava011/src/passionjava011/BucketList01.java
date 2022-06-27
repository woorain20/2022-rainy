package passionjava011;

public class BucketList01 {
	private String name;
	private String goal;
	private String place;
	private String season;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGoal(String goal) {
		this.goal=goal;
	}
	public void setPlace(String place) {
		this.place=place;
	}
	public void setSeason(String season) {
		this.season=season;
	}
	public void print() {
		System.out.println("NAME: "+name);
		System.out.println("GOAL: "+goal);
		System.out.println("PLACE: "+place);
		System.out.println("SEASON: "+season);
	}
	public void cheer() {
		System.out.println("Fighting!!");
	}
	public static void main(String[] args) {
		BucketList01 bucketlist=new BucketList01();
		bucketlist.setName("Tom");
		bucketlist.setGoal("Trip");
		bucketlist.setPlace("Finland");
		bucketlist.setSeason("Winter");
		bucketlist.print();
		bucketlist.cheer();

		BucketList01 bucketlist1=new BucketList01();
		bucketlist1.setName("Jack");
		bucketlist1.setGoal("Festival");
		bucketlist1.setPlace("Brasil");
		bucketlist1.setSeason("Summer");
		bucketlist1.print();
		bucketlist1.cheer();
	}

}

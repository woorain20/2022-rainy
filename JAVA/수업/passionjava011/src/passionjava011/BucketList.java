package passionjava011;

public class BucketList {
	private String name;
	private String goal;
	private String season;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setGoal(String goal) {
		this.goal=goal;
	}
	public void setSeason(String season) {
		this.season=season;
	}
	public void printBucket() {
		System.out.println("�̸�: "+name);
		System.out.println("��ǥ: "+goal);
		System.out.println("����: "+season);
	}
	public void cheerUp() {
		System.out.println("�� �̷���!");
	}
	public static void main(String[] args) {
		BucketList bucketlist=new BucketList();
		bucketlist.setName("KIM");
		bucketlist.setGoal("Trip");
		bucketlist.setSeason("Summer");
		bucketlist.printBucket();
		bucketlist.cheerUp();
		
		BucketList bucketlist2=new BucketList();
		bucketlist2.setName("Lee");
		bucketlist2.setGoal("Going to Finland");
		bucketlist2.setSeason("Winter");
		bucketlist2.printBucket();
		bucketlist2.cheerUp();
	}
}

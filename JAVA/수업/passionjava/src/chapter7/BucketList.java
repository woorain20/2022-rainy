package chapter7;

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
		System.out.println("이름: "+name);
		System.out.println("목표: "+goal);
		System.out.println("언제: "+season);
	}
	public void cheerUp() {
		System.out.println("꼭 이루자!!");
	}
	public static void main(String[] args) {
		BucketList bucketList=new BucketList();
		bucketList.setName("John Doe");
		bucketList.setGoal("해외 여행 - 발리");
		bucketList.setSeason("여름 휴가");
		bucketList.printBucket();
		bucketList.cheerUp();
		
		BucketList bucketList2=new BucketList();
		bucketList2.setName("Foo Bar");
		bucketList2.setGoal("동아리 모임 - 축구");
		bucketList2.setSeason("빠른 시일 내");
		bucketList2.printBucket();
		bucketList2.cheerUp();
		
	}

}

package Quest;

public class chap07 {

	public static void main(String[] args) {

		
		private String name; 
		private String goal; 
		private String season;
		
		public void setName(String name) {
			this.name=name;
		}
		public void setJob(String job) {
			this.job=job;
			
		}
		public void setSeason(String season) {
			this.season=season;
		}
		public void setHobby(String hobby) {
			this.hobby=hobby;
		}		
		public void setSports(String sports) {
			this.sports=sports;
		}		
		public void printBucket() {
			System.out.println("이름:"+name);
			System.out.println("직업:"+goal);
			System.out.println("계절:"+season);
			System.out.println("취미:"+hobby);
			System.out.println("스포츠:"+sports);
			
		}
		public static void main(String[] args)  {
			BucketList.BucketList=new BucketList();
			BucketList.setName("ChoiAreum");
			BucketList.setJob("student");
			BucketList.setSeason("winter");
			BucketList.setHobby("Music");
			BucketList.setSports("Football");
			BucketList.printBucket();
			
			
		
	}

		
		
}

package Quest;

public class T0414 {
	public static void main(String[] args) {
		T04141 a1=new T04141(4,5);
		System.out.println(a1.c(2));
	}
	
}

 class T04141 {
	 int a;
		int b;
		public T04141(int a, int b) {
			this.a=a;
			this.b=b;
		}
		int c(int d) {
			int result=this.a*this.b*d;
			return result;
		}
	
}
package parctice2;

public class Information {
	public static void main(String[] args) {
		System.out.println("������ ��������\n");
		
		Pass pa=new Pass();
		pa.takeTotal(new Total());
		System.out.println(" ");
		Pass pa2=new Pass();
		pa2.takeTotal2(new Total());
		System.out.println(" ");
		Pass pa3=new Pass();
		pa3.takeTotal3(new Total());
		
		System.out.println("\n���� �Ϸ� �Ǽ���");
	}
}

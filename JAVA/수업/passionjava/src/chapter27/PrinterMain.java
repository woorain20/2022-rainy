package chapter27;

public class PrinterMain {
	public static void main(String[] args) {
		/*�������̽� ���� ��� - ���̺귯�� �� �� (��Ƽ������)
		 * 1. Ŭ������ ����
		 * 2. �͸�Ŭ����
		 * 3. ���� - �޼ҵ� �Ű����� + ��ü
		 */
		Printable printable=new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		printable.print("Hello World!");
		
		Printable printable2=(String s)->{
			System.out.println(s);
		};	//���ٽ��� �߰��� �� ; �ʼ�
		
		printable2.print("Hello Lambda!");
		
		Printable printable3=s->System.out.println(s); //2���� �� Ex) (s,o)->System.out.println ��������
		printable3.print("Hello Lambda2!");
	}

}

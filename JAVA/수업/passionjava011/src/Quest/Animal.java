package Quest;

public class Animal {
	private String color;
	private String kind;
	private String point;
	
	public void setAnimal(String color) {
		this.color=color;
	}
	public void setKind(String kind) {
		this.kind=kind;
	}
	public void setPoint(String point) {
		this.point=point;
	}
	public void printAnimal() {
		System.out.println("�� �� : "+color);
		System.out.println("�� �� : "+kind);
		System.out.println("Ư ¡ : "+point);
	}
	public void next() {
		System.out.println("���� �����ϱ��");
	}
	public static void main(String[] args) {
		Animal prog=new Animal();
		prog.setAnimal("�ʷϻ�");
		prog.setKind("�缭��");
		prog.setPoint("�ܿ���, �մ���");
		prog.printAnimal();
		prog.next();
		System.out.println("\n");
		
		Animal monkey=new Animal();
		monkey.setAnimal("��ȸ��");
		monkey.setKind("�����");
		monkey.setPoint("ŷ��");
		monkey.printAnimal();
		monkey.next();
		
		
		
		
		
	}
}
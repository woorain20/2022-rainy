package passionjava013;

public class Circle {
	private double rad=0;	//���� ������
	final double PI=3.14;
	
	public Circle(double r) {
		setRad(r);	//�Ʒ��� ���ǵ� setRad �޼ҵ� ȣ���� ���� �ʱ�ȭ
	}
	public void setRad(double r) {
		if(r<0) {	//�������� 0���� ���� �� �����Ƿ�
			rad=0;
			return;	//�� ��ġ���� �޼ҵ� ���� ����
		}
		rad=r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return(rad*rad)*PI;		//���� ���� ��ȯ
	}

}

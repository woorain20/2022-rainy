package traineephonebook;

//�Ʒû�-�ν��Ͻ�
//���� �Ʒû�-��̸���Ʈ
public class Trainee {
	private String tName;
	private String tPhone;
	
	public Trainee() {	//�����ε���
		
	}
	
	//������
	public Trainee(String tName, String tPhone) {
		super();
		this.tName = tName;
		this.tPhone = tPhone;
	}
	
	//����
	public void setName(String tName) {
		this.tName=tName;
	}
	
	public void setPhone(String tPhone) {
		this.tPhone = tPhone;
	}
	
	//����
	public String getName() {
		return tName;
	}
	public String getPhone() {
		return tPhone;
	}
	
	@Override
	public String toString() {
		return "Trainee [tName=" + tName + ", tPhone=" + tPhone + "]";
	}
	
	public static void main(String[] args) {
		//�ѻ�� �̸�-���ڹ� ����ȣ 010-1234-5678
		Trainee trainee=new Trainee("���ڹ�", "010-1234-5678");
		//�޼ҵ�(���Ͱ���)
		//�ѻ�� �̸�-��Ŭ���� ����ȣ 010-9876-5432
		Trainee trainee2=new Trainee();
		trainee2.setName("��Ŭ����");
		trainee2.setPhone("010-9876-5432");
		
		System.out.println(trainee.toString());
		System.out.println(trainee2.toString());
		
		System.out.println(trainee.getName());
		System.out.println(trainee2.getPhone());
		//����Ʈ
		
	}


}

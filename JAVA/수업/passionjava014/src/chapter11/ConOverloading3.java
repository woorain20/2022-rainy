package chapter11;

public class ConOverloading3 {
	private int shopNum;
	private int worker;
	private int shopSize;
	private int table;
	
	public ConOverloading3(int num, int size, int wo, int ta) {
		this.shopNum=num;
		this.shopSize=size;
		this.worker=wo;
		this.table=ta;
	}
	
	public void showShopInfo() {
		System.out.println("����ڹ�ȣ: "+shopNum);
		System.out.println("���� ũ��: "+shopSize+"��");
		if(worker!=0) {
			System.out.println("������ ��: "+worker);
		}else {
			System.out.println("1�� ����");
		}
		if(table!=0) {
			System.out.println("���̺� ��: "+table+'\n');
		}else {
			System.out.println("�������\n");
		}
	}
	public static void main(String[] args) {
		ConOverloading3 kfood=new ConOverloading3(15487, 36, 10, 22);
		ConOverloading3 jfood=new ConOverloading3(42411, 20, 2, 8);
		ConOverloading3 cfood=new ConOverloading3(12345, 42, 12, 36);
		ConOverloading3 wfood=new ConOverloading3(47521, 68, 18, 62);
		ConOverloading3 afood=new ConOverloading3(15748, 16, 0, 0);
		
		kfood.showShopInfo();
		jfood.showShopInfo();
		cfood.showShopInfo();
		wfood.showShopInfo();
		afood.showShopInfo();

	}
}

package practice;

public class BusInformation2 {
	public static void main(String[] args) {
		
		int n=1;
		
		System.out.println("������ ��������\n");
		
		BusCompany com=new BusCompany();
		BusDriver dr=new BusDriver();
		BusNum num=new BusNum();
		BusStart art=new BusStart();
		BusStop op=new BusStop();
		BusFirst fi=new BusFirst();
		BusLast la=new BusLast();
		BusTime ti=new BusTime();
		
		switch(n) {
		case 1:
			BusPass pa=new BusPass();
			pa.takeBusTotal(new BusTotal());
			System.out.println("ȸ ��: "+"\t"+com.take());
			System.out.println("������: "+"\t"+dr.take());
			System.out.println("�� ȣ: "+"\t"+num.take());
			System.out.println("�����: "+"\t"+art.take());
			System.out.println("������: "+"\t"+op.take());
			System.out.println("ù ��: "+"\t"+fi.take());
			System.out.println("�� ��: "+"\t"+la.take());
			System.out.println("�� ��: "+"\t"+ti.take());
			break;
			
		case 2:
			BusPass pa2=new BusPass();
			pa2.takeBusTotal2(new BusTotal());
			System.out.println("ȸ ��: "+"\t"+com.take2());
			System.out.println("������: "+"\t"+dr.take2());
			System.out.println("�� ȣ: "+"\t"+num.take2());
			System.out.println("�����: "+"\t"+art.take2());
			System.out.println("������: "+"\t"+op.take2());
			System.out.println("ù ��: "+"\t"+fi.take2());
			System.out.println("�� ��: "+"\t"+la.take2());
			System.out.println("�� ��: "+"\t"+ti.take2());
			break;
			
		case 3:
			BusPass pa3=new BusPass();
			pa3.takeBusTotal3(new BusTotal());
			System.out.println("ȸ ��: "+"\t"+com.take3());
			System.out.println("������: "+"\t"+dr.take3());
			System.out.println("�� ȣ: "+"\t"+num.take3());
			System.out.println("�����: "+"\t"+art.take3());
			System.out.println("������: "+"\t"+op.take3());
			System.out.println("ù ��: "+"\t"+fi.take3());
			System.out.println("�� ��: "+"\t"+la.take3());
			System.out.println("�� ��: "+"\t"+ti.take3());
			break;
		
		case 4:
			BusPass pa4=new BusPass();
			pa4.takeBusTotal4(new BusTotal());
			System.out.println("ȸ ��: "+"\t"+com.take4());
			System.out.println("������: "+"\t"+dr.take4());
			System.out.println("�� ȣ: "+"\t"+num.take4());
			System.out.println("�����: "+"\t"+art.take4());
			System.out.println("������: "+"\t"+op.take4());
			System.out.println("ù ��: "+"\t"+fi.take4());
			System.out.println("�� ��: "+"\t"+la.take4());
			System.out.println("�� ��: "+"\t"+ti.take4());
			break;
			
		case 5:
			BusPass pa5=new BusPass();
			pa5.takeBusTotal5(new BusTotal());
			System.out.println("ȸ ��: "+"\t"+com.take5());
			System.out.println("������: "+"\t"+dr.take5());
			System.out.println("�� ȣ: "+"\t"+num.take5());
			System.out.println("�����: "+"\t"+art.take5());
			System.out.println("������: "+"\t"+op.take5());
			System.out.println("ù ��: "+"\t"+fi.take5());
			System.out.println("�� ��: "+"\t"+la.take5());
			System.out.println("�� ��: "+"\t"+ti.take5());
			break;
		
		default:
			System.out.println("�������� �ʴ� ���������Դϴ�.");
		}
		
		System.out.println("\n���� �Ϸ� �Ǽ���.");
	}
}

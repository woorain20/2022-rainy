package practice;

public class BusInformation {
	public static void main(String[] args) {
		System.out.println("오늘의 버스정보\n");
		
		BusCompany com=new BusCompany();
		BusDriver dr=new BusDriver();
		BusNum num=new BusNum();
		BusStart art=new BusStart();
		BusStop op=new BusStop();
		BusFirst fi=new BusFirst();
		BusLast la=new BusLast();
		BusTime ti=new BusTime();
		
		BusPass pa=new BusPass();
		pa.takeBusTotal(new BusTotal());
		System.out.println("회 사: "+"\t"+com.take());
		System.out.println("운전자: "+"\t"+dr.take());
		System.out.println("번 호: "+"\t"+num.take());
		System.out.println("출발지: "+"\t"+art.take());
		System.out.println("종착지: "+"\t"+op.take());
		System.out.println("첫 차: "+"\t"+fi.take());
		System.out.println("막 자: "+"\t"+la.take());
		System.out.println("배 자: "+"\t"+ti.take());
		System.out.println(" ");
		
		System.out.println("회 사: "+"\t"+com.take2());
		System.out.println("운전자: "+"\t"+dr.take2());
		System.out.println("번 호: "+"\t"+num.take2());
		System.out.println("출발지: "+"\t"+art.take2());
		System.out.println("종착지: "+"\t"+op.take2());
		System.out.println("첫 차: "+"\t"+fi.take2());
		System.out.println("막 자: "+"\t"+la.take2());
		System.out.println("배 자: "+"\t"+ti.take2());
		System.out.println(" ");
		
		BusPass pa3=new BusPass();
		pa3.takeBusTotal3(new BusTotal());
		System.out.println("회 사: "+"\t"+com.take3());
		System.out.println("운전자: "+"\t"+dr.take3());
		System.out.println("번 호: "+"\t"+num.take3());
		System.out.println("출발지: "+"\t"+art.take3());
		System.out.println("종착지: "+"\t"+op.take3());
		System.out.println("첫 차: "+"\t"+fi.take3());
		System.out.println("막 자: "+"\t"+la.take3());
		System.out.println("배 자: "+"\t"+ti.take3());
		System.out.println(" ");
		
		BusPass pa4=new BusPass();
		pa4.takeBusTotal4(new BusTotal());
		System.out.println("회 사: "+"\t"+com.take4());
		System.out.println("운전자: "+"\t"+dr.take4());
		System.out.println("번 호: "+"\t"+num.take4());
		System.out.println("출발지: "+"\t"+art.take4());
		System.out.println("종착지: "+"\t"+op.take4());
		System.out.println("첫 차: "+"\t"+fi.take4());
		System.out.println("막 자: "+"\t"+la.take4());
		System.out.println("배 자: "+"\t"+ti.take4());
		System.out.println(" ");
		
		BusPass pa5=new BusPass();
		pa5.takeBusTotal5(new BusTotal());
		System.out.println("회 사: "+"\t"+com.take5());
		System.out.println("운전자: "+"\t"+dr.take5());
		System.out.println("번 호: "+"\t"+num.take5());
		System.out.println("출발지: "+"\t"+art.take5());
		System.out.println("종착지: "+"\t"+op.take5());
		System.out.println("첫 차: "+"\t"+fi.take5());
		System.out.println("막 자: "+"\t"+la.take5());
		System.out.println("배 자: "+"\t"+ti.take5());
		
		System.out.println("\n좋은 하루 되세요.");
	}
}

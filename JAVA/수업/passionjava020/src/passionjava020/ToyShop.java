package passionjava020;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {
	List<String> toy=new ArrayList<>();
	List<Integer> price=new ArrayList<>();
	
	public List<String> getToy() {
		return toy;
	}

	public void setToy(List<String> toy) {
		this.toy = toy;
	}
	
	
	public List<Integer> getPrice() {
		return price;
	}

	public void setPrice(List<Integer> price) {
		this.price = price;
	}

	public void addToy(String item) {
		toy.add(item);
	}
	
	public void addPrice(int pay) {
		price.add(pay);
	}

	public static void main(String[] args) {
		ToyShop ts=new ToyShop();
		
		ts.addToy("로봇");
		ts.addToy("인형");
		ts.addToy("미니카");
		ts.addToy("레고");
		ts.addToy("프라모델");
		ts.addToy("낚시놀이");
		ts.addToy("보드게임");
		ts.addToy("카드게임");
		
		
		ts.addPrice(25000);
		ts.addPrice(9000);
		ts.addPrice(70000);
		ts.addPrice(65000);
		ts.addPrice(10000);		
		ts.addPrice(15000);
		ts.addPrice(12000);		
		ts.addPrice(33000);
		
		for(int i=0;i<ts.getToy().size();i++) {
			System.out.println(ts.getToy().get(i));
		}
		
		for(int i=0;i<ts.getPrice().size();i++) {
			System.out.println(ts.getPrice().get(i));
		}
		
		
	}
}

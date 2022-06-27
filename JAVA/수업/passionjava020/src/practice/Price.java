package practice;

import java.util.ArrayList;
import java.util.List;

public class Price {
	List<Integer> price=new ArrayList<>();
	
	public List<Integer> getPrice() {
		return price;
	}

	public void setPrice(List<Integer> price) {
		this.price = price;
	}
	
	public void addPrice(int pay) {
		price.add(pay);
	}

}

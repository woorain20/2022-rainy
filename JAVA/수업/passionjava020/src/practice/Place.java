package practice;

import java.util.ArrayList;
import java.util.List;

public class Place {
	List<String> place=new ArrayList<>();

	public List<String> getPlace() {
		return place;
	}

	public void setPlace(List<String> place) {
		this.place = place;
	}
	
	public void addPlace(String spot) {
		place.add(spot);
	}

}

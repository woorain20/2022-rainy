package plactice;

public class BusTotal {
	
	BusNum num=new BusNum();
	BusDestination des=new BusDestination();
	BusNow now=new BusNow();
	BusTime ti=new BusTime();
	
	void take() {
		num.take();des.take();now.take();ti.take();
	}
	void take2() {
		num.take2();des.take2();now.take2();ti.take2();
	}
	void take3() {
		num.take3();des.take3();now.take3();ti.take3();
	}

}

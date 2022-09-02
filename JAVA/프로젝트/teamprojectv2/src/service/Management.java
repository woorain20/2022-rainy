package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import dto.HotelVO;
import operate.Booknumber;
import view.HotelView;


public class Management {
	List<HotelVO> hotellist=new ArrayList<>();
	Booknumber bn=new Booknumber();
	
	public List<HotelVO> getHotellist() {
		return hotellist;
	}

	public void setHotellist(List<HotelVO> hotellist) {
		this.hotellist = hotellist;
	}


	public void createRervation(HotelVO hotelVO) {
		writeReserve(hotelVO);
		hotellist.add(hotelVO);
		hotelVO.print();
		
	}


		//파일로 저장

	public void writeReserve(HotelVO hotelVO) {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(new FileOutputStream(hotelVO.getBooknumber()+".txt")))
		{oo.writeObject(hotellist);
			System.out.println(hotelVO.getBooknumber());
			System.out.println("파일 저장 성공");
		}catch(IOException e) {
			e.getMessage();
			System.out.println("파일 저장 실패");
		}
	}
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(new FileInputStream("hotel.txt"))){
			hotellist=(List<HotelVO>)oi.readObject();
		}catch(ClassNotFoundException e) {
			System.out.println("아직 저장 된 것은 없습니다");
		}catch(IOException e) {
			System.out.println("저장된 것이 없거나 파일 읽기 실패");
		}
		//처음 실행하여 저장된 것이 없을 때
		if(hotellist==null) {
			hotellist=new ArrayList<>();
		}
	}
	public void makeReserve(){
		
	
	}
	
	

}

package service;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import dto.HotelVO;
import operate.Booknumber;



public class Management {
	
	
	List<HotelVO> hotellist=new ArrayList<>();
	Booknumber bn=new Booknumber();
	Scanner sc=new Scanner(System.in);
	private Path hotelFile=Paths.get("hotelList.txt");
	
	
	public Management() {
		try {
			hotelFile=Files.createFile(hotelFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("파일 로드 성공");
		}
	}

	public List<HotelVO> getHotellist() {
		return hotellist;
	}

	public void setHotellist(List<HotelVO> hotellist) {
		this.hotellist = hotellist;
	}

	// DB생성
	public void createRervation(HotelVO hotelVO) {
		hotellist.add(hotelVO);
		writeReserve();
		getHotelLists();
//		hotelVO.print();
	
	}

	//파일로 저장
	//writeReserve(HotelVO hotelVO)-> hoteldVO 인트턴스 불러오기(HotelView에서 만든 인스턴스)
	public void writeReserve() {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(Files.newOutputStream(hotelFile))){
			oo.writeObject(hotellist);
			System.out.println("파일 저장 성공");
		}catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
			System.out.println("파일 저장 실패");
		}
	}
	
	//파일 불러 오기
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(Files.newInputStream(hotelFile))){
			hotellist=(List<HotelVO>)oi.readObject();
			System.out.println("파일 불러오기 성공");
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
	public void putResreve(HotelVO hotelVO) {
		Iterator<HotelVO> itr=hotellist.iterator();
		while(itr.hasNext()) {
			HotelVO arrhotelVO=itr.next();
			if(arrhotelVO.getBooknumber()==hotelVO.getBooknumber()) {
				arrhotelVO.setRoom(hotelVO.getRoom());
				arrhotelVO.setNight(hotelVO.getNight());
				arrhotelVO.setYear(hotelVO.getYear());
				arrhotelVO.setMonth(hotelVO.getMonth());
				arrhotelVO.setDay(hotelVO.getDay());
			}
		}
	}
	public void getReservation(HotelVO hotelVO) {
		int booknumbker =sc.nextInt();
		hotellist.get(booknumbker);
		hotelVO.print();
//		if(hotelVO.getBooknumber()!=null&&hotelVO.getBooknumber().length()>0) {
//			System.out.println(hotelVO.toString());
//		}else {
//			System.out.println("없는 예약번호 입니다.");	
//		}
	}
	
	public void getHotelLists() {
		for(HotelVO hotelVO:hotellist) {
			System.out.println(hotelVO);
		}
	}
	
	public void makeReserve(){

	}
	
	
}

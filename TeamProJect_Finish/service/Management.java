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
import operate.Receipt;



public class Management {
	
	
	List<HotelVO> hotelList=new ArrayList<HotelVO>();
	Booknumber bn=new Booknumber();
	Scanner sc=new Scanner(System.in);
	private Path hotelFile=Paths.get("hotelList.bin");

	//파일 로드 및 생성
	public Management() {
		try {
			hotelFile=Files.createFile(hotelFile); //파일 생성(없을시)
		} catch (IOException e) {
			System.out.println("파일 로드 성공");  //파일 로드(기존파일)
			readResrve();
		}
	}

	public List<HotelVO> getHotellist() {
		return hotelList;
	}

	public void setHotellist(List<HotelVO> hotelList) {
		this.hotelList = hotelList;
	}

	//DB 파일 생성
	public void createRervation(HotelVO hotelVO) {
		hotelList.add(hotelVO);
		writeReserve();
	}
	
	//파일 저장
	public void writeReserve() {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(Files.newOutputStream(hotelFile))){
			oo.writeObject(hotelList);
			System.out.println("파일 저장 성공");
		}catch(IOException e) {
			System.out.println("파일 저장 실패");
		}
	}
	
	//파일 불러 오기
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(Files.newInputStream(hotelFile))){
			hotelList=(List<HotelVO>)oi.readObject();
			System.out.println("파일 불러오기 성공");
		}catch(ClassNotFoundException e) {
			System.out.println("아직 저장 된 것은 없습니다");
		}catch(IOException e) {
			System.out.println("저장된 것이 없거나 파일 읽기 실패");
		}
		//처음 실행하여 저장된 것이 없을 때
		if(hotelList==null) {
			hotelList=new ArrayList<>();
		}
	}
	//파일 수정하기(Update)
	public void reviseResreve(HotelVO hotelVO) {
		Iterator<HotelVO> itr=hotelList.iterator();
		while(itr.hasNext()) {
			HotelVO arrhotelVO=itr.next();
			if(arrhotelVO.getBooknumber().equals(hotelVO.getBooknumber())) {				
				arrhotelVO.setRoom(hotelVO.getRoom());
				arrhotelVO.setNight(hotelVO.getNight());
				arrhotelVO.setYear(hotelVO.getYear());
				arrhotelVO.setMonth(hotelVO.getMonth());
				arrhotelVO.setDay(hotelVO.getDay());
				arrhotelVO.setCost(hotelVO.getCost());
				
			}else {
				System.out.println("수정대상아님");				
			}
			arrhotelVO.print();
			System.out.println("수정완료");
		}writeReserve();
	}
	//파일 조회
	public void getReservation(String booknumbker) {
		for(HotelVO hotelVO:hotelList) {
			if(hotelVO.getBooknumber()!=null&&hotelVO.getBooknumber().equals(booknumbker)) {
				hotelVO.print();
			}else {
				System.out.println("없는 예약번호 입니다.");	
			}
		}
	}
	public void deleteReservation(HotelVO hotelVO) {
		Iterator<HotelVO> itr=hotelList.iterator();
		while(itr.hasNext()) {
			HotelVO arrFortuneVO=itr.next();
			if(arrFortuneVO.getBooknumber().equals(hotelVO.getBooknumber())) {
				itr.remove();
			}
		}
	}
}

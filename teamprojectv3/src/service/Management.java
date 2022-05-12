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
			System.out.println("���� �ε� ����");
		}
	}

	public List<HotelVO> getHotellist() {
		return hotellist;
	}

	public void setHotellist(List<HotelVO> hotellist) {
		this.hotellist = hotellist;
	}

	// DB����
	public void createRervation(HotelVO hotelVO) {
		hotellist.add(hotelVO);
		writeReserve();
		getHotelLists();
//		hotelVO.print();
	
	}

	//���Ϸ� ����
	//writeReserve(HotelVO hotelVO)-> hoteldVO ��Ʈ�Ͻ� �ҷ�����(HotelView���� ���� �ν��Ͻ�)
	public void writeReserve() {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(Files.newOutputStream(hotelFile))){
			oo.writeObject(hotellist);
			System.out.println("���� ���� ����");
		}catch(IOException e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
			System.out.println("���� ���� ����");
		}
	}
	
	//���� �ҷ� ����
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(Files.newInputStream(hotelFile))){
			hotellist=(List<HotelVO>)oi.readObject();
			System.out.println("���� �ҷ����� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("���� ���� �� ���� �����ϴ�");
		}catch(IOException e) {
			System.out.println("����� ���� ���ų� ���� �б� ����");
		}
		//ó�� �����Ͽ� ����� ���� ���� ��
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
//			System.out.println("���� �����ȣ �Դϴ�.");	
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

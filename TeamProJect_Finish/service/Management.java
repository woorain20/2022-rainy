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

	//���� �ε� �� ����
	public Management() {
		try {
			hotelFile=Files.createFile(hotelFile); //���� ����(������)
		} catch (IOException e) {
			System.out.println("���� �ε� ����");  //���� �ε�(��������)
			readResrve();
		}
	}

	public List<HotelVO> getHotellist() {
		return hotelList;
	}

	public void setHotellist(List<HotelVO> hotelList) {
		this.hotelList = hotelList;
	}

	//DB ���� ����
	public void createRervation(HotelVO hotelVO) {
		hotelList.add(hotelVO);
		writeReserve();
	}
	
	//���� ����
	public void writeReserve() {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(Files.newOutputStream(hotelFile))){
			oo.writeObject(hotelList);
			System.out.println("���� ���� ����");
		}catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
	
	//���� �ҷ� ����
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(Files.newInputStream(hotelFile))){
			hotelList=(List<HotelVO>)oi.readObject();
			System.out.println("���� �ҷ����� ����");
		}catch(ClassNotFoundException e) {
			System.out.println("���� ���� �� ���� �����ϴ�");
		}catch(IOException e) {
			System.out.println("����� ���� ���ų� ���� �б� ����");
		}
		//ó�� �����Ͽ� ����� ���� ���� ��
		if(hotelList==null) {
			hotelList=new ArrayList<>();
		}
	}
	//���� �����ϱ�(Update)
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
				System.out.println("�������ƴ�");				
			}
			arrhotelVO.print();
			System.out.println("�����Ϸ�");
		}writeReserve();
	}
	//���� ��ȸ
	public void getReservation(String booknumbker) {
		for(HotelVO hotelVO:hotelList) {
			if(hotelVO.getBooknumber()!=null&&hotelVO.getBooknumber().equals(booknumbker)) {
				hotelVO.print();
			}else {
				System.out.println("���� �����ȣ �Դϴ�.");	
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

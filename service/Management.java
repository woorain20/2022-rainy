package service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dto.HotelVO;
import operate.Booknumber;
import view.HotelView;


public class Management {
	List<HotelVO> hotellist=new ArrayList<>();
	Booknumber bn=new Booknumber();
	Scanner sc=new Scanner(System.in);
	
	public List<HotelVO> getHotellist() {
		return hotellist;
	}

	public void setHotellist(List<HotelVO> hotellist) {
		this.hotellist = hotellist;
	}

	// DB����
	public void createRervation(HotelVO hotelVO) {
		writeReserve(hotelVO);
		hotellist.add(hotelVO);
		hotelVO.print();
		
	}

	//���Ϸ� ����
	//writeReserve(HotelVO hotelVO)-> hoteldVO ��Ʈ�Ͻ� �ҷ�����(HotelView���� ���� �ν��Ͻ�)
	public void writeReserve(HotelVO hotelVO) {
		try(ObjectOutputStream oo=
				new ObjectOutputStream(new FileOutputStream(hotelVO.getBooknumber()+".txt")))
		{oo.writeObject(hotellist);
			System.out.println("���� ���� ����");
		}catch(IOException e) {
			e.getMessage();
			System.out.println("���� ���� ����");
		}
	}
	
	//���� �ҷ� ����
	public void readResrve() {
		try(ObjectInputStream oi=
				new ObjectInputStream(new FileInputStream(sc.nextInt()+".txt"))){
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
	public void makeReserve(){
		
	
	}
	
	

}

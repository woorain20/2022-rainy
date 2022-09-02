package view;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import dto.FortuneVO;

public class FortuneView {
	
	private Scanner scanner=new Scanner(System.in);
	private Random random=new Random();
	
	public int getMenu() {
		System.out.println("� �ܼ� ���Դϴ�.");
		System.out.println("0.����");
		System.out.println("1.� ���� ����");
		System.out.println("2.� �����");
		System.out.println("3.� ����");
		System.out.println("4.� ����");
		System.out.println("5.� ��ü Ȯ��");
		System.out.print("����:");
		int choice=-1;
		try {
			choice=scanner.nextInt();
			scanner.nextLine();
		}catch(InputMismatchException e) {
			scanner.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}
		return choice;
	}
	
	public String getCreateMenu() {
		System.out.println("� ����� �Դϴ�.");
		System.out.print("� �Է�: ");
		String fortuneStr=scanner.nextLine();
		return fortuneStr;
	}
	
	public FortuneVO getUpdateMenu() {
		FortuneVO fortuneVO=new FortuneVO();
		System.out.println("� ���� �ϱ� �Դϴ�.");
		System.out.print("������ � ID �Է�: ");
		int id=scanner.nextInt();
		scanner.nextLine();
		System.out.print("������ � �Է�: ");
		String fortuneStr=scanner.nextLine();
		fortuneVO.setId(id);
		fortuneVO.setFortuneStr(fortuneStr);
		return fortuneVO;
	}
	
	public FortuneVO getDeleteMenu() {
		FortuneVO fortuneVO=new FortuneVO();
		System.out.println("� ���� �ϱ� �Դϴ�.");
		System.out.print("������ � ID �Է�: ");
		int id=scanner.nextInt();
		scanner.nextLine();
		fortuneVO.setId(id);
		return fortuneVO;
	}
	
	//print All
	public void getFortunes(List<FortuneVO> fortuneList) {
		Iterator<FortuneVO> itr=fortuneList.iterator();
		while(itr.hasNext()) {
			FortuneVO fortuneVO=itr.next();
			System.out.println(fortuneVO.toString());
		}
	}
	
	//print One
	public void getFortune(List<FortuneVO> fortuneList) {
		int randomIndex=random.nextInt(fortuneList.size());
		FortuneVO fortuneVO=fortuneList.get(randomIndex);
		if(fortuneVO.getName()!=null&&fortuneVO.getName().length()>0) {
			System.out.println(fortuneVO.toString());
		}else {
			System.out.println(fortuneVO.getEmptyName());
		}
	}
	
}

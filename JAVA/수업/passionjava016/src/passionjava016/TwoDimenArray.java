package passionjava016;

public class TwoDimenArray {
	public static void main(String[] args) {
		int[][]arr=new int[3][4];
		int num=1;
		
		//�迭�� ���� ����
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				arr[i][j]=num;
				num++;
			}
		}
		
		//�迭�� ����� ���� ���
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}

package Quest;

public class BaeminOrder {
		public String orderNum;
		public String customerID;
		public String orderDate;
		public String customerName;
		public String productName;
		public String shippingAddress;
		public void orderInfo() {
			System.out.println("�ֹ� ��ȣ :"+orderNum);
			System.out.println("�ֹ��� ���̵� :"+customerID);
			System.out.println("�ֹ� ��¥ :"+orderDate);
			System.out.println("�ֹ��� �̸� :"+customerName);
			System.out.println("�ֹ� ��ǰ ��ȣ :"+productName);
			System.out.println("��� �ּ�:"+shippingAddress);
	}
		public static void main(String[] args) {
			BaeminOrder order0001 = new BaeminOrder();
			order0001.orderNum = "B17C01EP2P"; 
			order0001.customerID = "Namildong1";
			order0001.orderDate = "2022�� 4�� 10��"; 
			order0001.customerName = "�輼ȯ";
			order0001.productName = "Ȳ�ݿø���ݹ�+�ݶ�1.25L 1��"; 
			order0001.shippingAddress = "�뱸 ������ ûȣ�� 370";
			order0001.orderInfo();
		}
}
package example03;

public class Product {

	static int number = 0;
	int countNo;
	int[] arr = new int[10];
	
	//���� �ʱ�ȭ ��(��, �ѹ��� ����)
	static {
		System.out.println("���� �ʱ�ȭ �� ȣ���");
	}
	
	//�ν��Ͻ� �ʱ�ȭ ��(������� ����� �� ����)
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ �� ȣ���");
		++number;
		this.countNo = Product.number;
		//������ �ʱ�ȭ ���� ���� �ʱ�ȭ �� ���๮ �ۼ��ϸ� �������� ��������.
		for(int i=0; i<arr.length; i++) {
			this.arr[i] = (int)(Math.random()*10) + 1;
		}
	}
	
	public Product() {
		System.out.println("�⺻������ ȣ���");		
	}	
}

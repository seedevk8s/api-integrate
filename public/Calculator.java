package example02;

public class Calculator {

	//�ν��Ͻ� �޼���
	//�ν��Ͻ��� Ư¡ : new�����ڷ� �ν��Ͻ��� �����ؾ�����, ����������.�ν��Ͻ��޼���� ���ٰ���
	public int add(int x, int y) {
		int result = x + y;
		double dresult = Calculator.divide(10.5, 11.7);
		System.out.println("dresult : " + dresult);
		return result;
		//return x + y;   //���� 2���� 1�ٷ� �̿� ���� ���� �� �ִ�.
	}
	//�ν��Ͻ� �޼���
	public int substract(int x, int y) {
		return x - y;
	}
	
	//static(����)�޼���
	//static�� Ư�� : �ν��Ͻ� ���� ���� Ŭ������.�����޼�������� �ٷ� ���� �����ϴ�.
	public static long multiply(long x, long y) {
		//static�޼���� �̹� �޸� ��ܿ� �ö��ְ� �ν��Ͻ� �������� ������ �����ؾߵǴµ�,
		//�Ʒ��ڵ�� �ν��Ͻ��� �����Ǿ������ ��밡���� add()�� �Ա� ������ ���ܰ� �߻��ϴ� ���̴�.
		//�ν��Ͻ��� ���� �������� �ƹ��� �𸣱� ������ static�޼��� �ȿ��� �ν��Ͻ� �޼��尡 
		//����� ���� �ȵȴ�.
		//this.add(10,5);		
		return x * y;
	}
	//static(����)�޼���
	public static double divide(double x, double y) {
		return x / y;
	}	
}

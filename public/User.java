package example04;

public class User {

	//�ش� Ŭ���� �ڽ��� Ÿ������ ���� ��� ����� ���ÿ� ������ �ϰ� �ִ�.
	private static User singleton = new User();

	//�ش� Ŭ������ �ܺο��� new�����ڷ� �ν��Ͻ��� ���� ���ϰ� ����.
	private User() {
	}
	
	public void add() {
		System.out.println("add�޼��� ȣ��");
	}
	
	//�ش� Ŭ������ ����� �ּҸ� �Ѱ��ֱ�(����)���ؼ� �ܺο��� ȣ���Ҽ� �ִ�
	//getter�޼��带 �������ְ� �ִ�.
	public static User getInstance() {
		return User.singleton;
	}	
}

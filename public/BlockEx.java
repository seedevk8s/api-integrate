package example03;

public class BlockEx {
	
	//�ν��Ͻ� �ʱ�ȭ��, �ν��Ͻ��� ������ ������ ȣ��(���� ����)
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ�� �����");
	}
	//�����ʱ�ȭ ��, �� �ѹ� ������ �̷����.(Ŭ���� ������ �ö�)
	static {
		System.out.println("���� �ʱ�ȭ �� �����");
	}
	
	public BlockEx() {
		System.out.println("������ ȣ���");
	}
	
	//�ʱ�ȭ ����
	//Ŭ���� ���� �ʱ�ȭ ����
	//�⺻�� -> ����� �ʱ�ȭ -> Ŭ���� �ʱ�ȭ ��
	//�ν��Ͻ� ���� �ʱ�ȭ ����
	//�⺻�� -> ����� �ʱ�ȭ -> �ν��Ͻ� �ʱ�ȭ �� -> ������	
	@SuppressWarnings("unused")
	public static void main(String[] args) {		
		BlockEx b1 = new BlockEx();
	}

}

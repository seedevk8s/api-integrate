package example04;

import java.util.Calendar;
import java.util.Date;

public class UserEx {

	public static void main(String[] args) {
		
		//User user1 = new User();
		User user1 = User.getInstance();
		User user2 = User.getInstance();
		
		//�̱��� ������ ����ϴ� �������� ��
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		System.out.println(d);
		
		System.out.println("user1�� �ּ� : " + user1);
		System.out.println("user2�� �ּ� : " + user2);
		user1.add();
		//ObjectŬ������ equals()�ּ� ��
		//��ü�� ==������ �ּҰ� �񱳿���
		//if(user1 == user2) {
		if(user1.equals(user2)) {
			System.out.println("���� ��ü�Դϴ�.");
		}
		else {
			System.out.println("�ٸ� ��ü�Դϴ�.");
		
		}
		//�̱��� ������ ����ϴ� ����
		//��, �ϳ��� �ν��ϸ� �����ؼ� ���� ������ ���ϰ��� �� �� ���
		//ex)����� ȯ�漳��, Ŀ�ؼ�Ǯ, ������Ǯ, OS�� �ð��̳� ��¥ ��
	}
}
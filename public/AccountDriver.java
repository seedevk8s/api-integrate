// AccountDriver.java
// Account ��ü�� ����� �̿��Ѵ�
public class AccountDriver
{
   public static void main(String[ ] args)
   {
	  // �� ���ݰ��¸� �����
      Account acct = new Account( );

      // ������ �����ָ� ��ȫ�浿������ �Ѵ�
      acct.setOwnerName("ȫ�浿");

      // ���¹�ȣ�� 101�� �Ѵ�
      acct.setAccountNumber(101);

      // ������ �ʱ� �Աݾ��� 10,000���̴�
      acct.setBalance(10000);

      // ���¿� 3,000���� �Ա��Ѵ�
      acct.deposit(3000);

      // ���¿��� 5,000���� ����Ѵ�
      acct.withdraw(5000);

      // ������ ������ ����Ѵ�
      System.out.println(acct.toString( ));
   }
}
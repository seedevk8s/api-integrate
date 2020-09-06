// Account.java
// ���� ���¸� ���Ѵ�

public class Account
{
   private String ownerName; 	// ������ �̸�
   private int accountNumber; 	// ���¹�ȣ
   private int balance; 		// �ܰ�

   // ������ �̸��� �־��� ������ �����Ѵ�
   public void setOwnerName(String name)
   {
      ownerName = name;
   }

   // ���� ��ȣ�� �־��� ������ �����Ѵ�
   public void setAccountNumber(int number)
   {
      accountNumber = number;
   }

   // �ܰ� �־��� ������ �����Ѵ�
   public void setBalance(int amount)
   {
      balance = amount;
   }

   // ������ �̸��� ��ȯ�Ѵ�
   public String getOwnerName( )
   {
      return ownerName;
   }

   // ���� ��ȣ�� ��ȯ�Ѵ�
   public int getAccountNumber()
   {
      return accountNumber;
   }

   // �ܰ� ��ȯ�Ѵ�
   public int getBalance( )
   {
      return balance;
   }

   // �ܰ� �־��� �Աݾ׸�ŭ ������Ų��
   public void deposit(int amount)
   {
      balance = balance + amount;
   }

   // �ܰ� �־��� ��ݾ׸�ŭ ���ҽ�Ų��
   public void withdraw(int amount)
   {
	  if (amount > balance)
	    System.out.println("����: �� �ܰ� �湮���� �ʴ�");
	  else
	    balance = balance - amount;
   }

   // ��ü �������� ������ ���ڿ��� ���·� ��ȯ�Ѵ�
   public String toString( )
   {
      String resultString = "";
      resultString = resultString + "������ �̸�: " + getOwnerName( ) + "\n";
      resultString = resultString + "���¹�ȣ: " + getAccountNumber( ) + "\n";
      resultString = resultString + "�ܰ�: " + getBalance( );
      return resultString;
   }
}
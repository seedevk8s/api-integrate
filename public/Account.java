// Account.java
// 은행 계좌를 모델한다

public class Account
{
   private String ownerName; 	// 예금주 이름
   private int accountNumber; 	// 계좌번호
   private int balance; 		// 잔고

   // 예금주 이름을 주어진 값으로 변경한다
   public void setOwnerName(String name)
   {
      ownerName = name;
   }

   // 계좌 번호를 주어진 값으로 변경한다
   public void setAccountNumber(int number)
   {
      accountNumber = number;
   }

   // 잔고를 주어진 값으로 변경한다
   public void setBalance(int amount)
   {
      balance = amount;
   }

   // 예금주 이름을 반환한다
   public String getOwnerName( )
   {
      return ownerName;
   }

   // 계좌 번호를 반환한다
   public int getAccountNumber()
   {
      return accountNumber;
   }

   // 잔고를 반환한다
   public int getBalance( )
   {
      return balance;
   }

   // 잔고를 주어진 입금액만큼 증가시킨다
   public void deposit(int amount)
   {
      balance = balance + amount;
   }

   // 잔고를 주어진 출금액만큼 감소시킨다
   public void withdraw(int amount)
   {
	  if (amount > balance)
	    System.out.println("오류: 현 잔고가 충문하지 않다");
	  else
	    balance = balance - amount;
   }

   // 객체 변수들의 값들을 문자열의 형태로 반환한다
   public String toString( )
   {
      String resultString = "";
      resultString = resultString + "예금주 이름: " + getOwnerName( ) + "\n";
      resultString = resultString + "계좌번호: " + getAccountNumber( ) + "\n";
      resultString = resultString + "잔고: " + getBalance( );
      return resultString;
   }
}
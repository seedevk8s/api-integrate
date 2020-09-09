package bankApplication;

import java.util.Scanner;

public class BankApplication {

	//�迭 100�� ��������� �Ǿ��ְ�, �迭�̹Ƿ� �Ѱ谡 �ִ�.(�޸� ����, �����̴�)
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.�����ϱ� | 4.����ϱ� | 5.�����ϱ�");
			System.out.println("----------------------------------------------------");
			System.out.print("���� > ");
			
			int choice = sc.nextInt();
			
			if(choice == 1) {
				createAccount();
			}
			else if(choice == 2) {
				accountList();
			}
			else if(choice == 3) {
				deposit();
			}
			else if(choice == 4) {
				withdraw();
			}
			else if(choice == 5) {
				System.out.println("���°��� ���α׷��� �����մϴ�.!");
				run = false;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.!");
			}			
		}
	}
	//���� ����
	public static void createAccount() {
		System.out.println("-----------------");
		System.out.println("���¸� �����մϴ�.");
		System.out.println("-----------------");
		
		System.out.print("���� ��ȣ : ");
		//next() : �� �ܾ �Է¹��� �� ������ �޼���(������ �߰��ϸ� �� �ձ����� String����)
		//nextLine() : �� �����̳� �� ���� �Է¹��� �� ������ �޼���() 
		String ano = sc.next();  
		
		System.out.print("������ : ");
		String owner = sc.next();
		
		System.out.print("�ʱ� �Աݾ� : ");
		int balance  = sc.nextInt();
		
		Account newAccount = new Account(ano, owner, balance);
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("��� : ���� ���� �Ϸ�Ǿ����ϴ�.");
//				System.out.println(accountArray[i].getAno() + ", " + 
//				                   accountArray[i].getOwner() + " , " + 
//						           accountArray[i].getBalace());		
				break;
			}
		}
	}
	//���� ��� ����ϱ�
	public static void accountList() {
		System.out.println("-----------------");
		System.out.println("���¸���� ����մϴ�.");
		System.out.println("-----------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			//���¿� ���� ������ �����Ѵٸ�...
			if(account != null) {
				System.out.print(account.getAno());
				System.out.print("\t");
				System.out.print(account.getOwner());
				System.out.print("\t");
				System.out.print(account.getBalace());
				System.out.println();
			}			
		}		
	}
	
	//�����ϱ�
	public static void deposit() {
		System.out.println("-----------------");
		System.out.println("������ �մϴ�.");
		System.out.println("-----------------");
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next();
		System.out.print("���ݾ� : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�. Ȯ�� �ٶ��ϴ�.");
			return;
		}
		account.setBalace(account.getBalace() + money);
		System.out.println("��� : ������ �����߽��ϴ�. ���� �ܾ� : " + account.getBalace());		
	}
	
	//����ϱ�
	public static void withdraw() {
		System.out.println("-----------------");
		System.out.println("����� �մϴ�.");
		System.out.println("-----------------");
		
		System.out.print("���¹�ȣ �Է� : ");
		String ano = sc.next();
		System.out.print("��ݾ� : ");
		int money = sc.nextInt();
		
		Account account = findAccount(ano);
		if(account == null) {
			System.out.println("��� : ���°� �����ϴ�. Ȯ�� �ٶ��ϴ�.");
			return;
		}
		account.setBalace(account.getBalace() - money);
		System.out.println("��� : ��ݱ��� �����߽��ϴ�. ���� �ܾ� : " + account.getBalace());		
	}
	
	//���� ã��
	public static Account findAccount(String ano) {
		
		Account account = null;
		
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				//�Ű������� �Ѿ�� ���¹�ȣ�� �����ϴٸ�...
				if(accountArray[i].getAno().equals(ano)) {
					account = accountArray[i];
					break;
				}
			}
		}
		return account;	
	}	
}

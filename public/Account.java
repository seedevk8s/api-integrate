package bankApplication;

public class Account {

	private String ano;    //���¹�ȣ
	private String owner;  //������
	private int balance;    //�ܾ�
	
	//�Ű������� �ִ� ������
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalace() {
		return balance;
	}
	public void setBalace(int balance) {
		this.balance = balance;
	}	
}

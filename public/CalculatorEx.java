package example02;

public class CalculatorEx {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		//�ν��Ͻ� �޼��� ȣ��
		int addResult = cal.add(100, 200);
		System.out.println("addResult : " + addResult);
		
		//static�޼��� ȣ��
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("mulResult : " + mulResult);		
	 
		double divResult = Calculator.divide(100.88, 10.55);
		System.out.println("divResult : " + divResult );
		
		//���� �޼����� ����(����ο� static�����ڰ� �پ��ִ�.)--�ڹٴڽ����� Ȯ���� �ߴ�.		
		//Integer.parseInt("100");
		//Math.random();
	}
}

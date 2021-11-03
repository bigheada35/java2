package e_test2_calculator_with_exception_scanner.copy;

import java.util.Scanner;

/*
�Ʒ��� ����� ��Ÿ���� ��Ģ���� ���⸦ �ϼ��Ͻÿ�.
-���� �߸��� �Է��� ������ ó������ �ٽ� �Է��� �޵��� 
����ó�� ����(try catch)�� ������

*** ���� ***
��1 : 10
��2 : 20
���� : +
��� ��� : 30
��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N
y
*** ���� ***
��1 : R
�߸��� �Է��Դϴ�. �ٽ��Է��� �ּ���
*** ���� ***
��1 : 10
��2 : 20
���� : *
��� ��� : 200
��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N
y
*** ���� ***
��1 : 90
��2 : 80
���� : /
��� ��� : 1
��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N
n
�����Դϴ�.
*/


public class Test33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		while(true) {
			System.out.println("*** ���� ***");
			
			try {
				System.out.print("��1:");
				int n1 = sc.nextInt();
				calc.setN1(n1);
		
			
				System.out.print("��2:");
				int n2 = sc.nextInt();
				calc.setN2(n2);
	
			}catch(Exception e){
				System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��� �ּ���");
				sc.nextLine();
				continue;
			}
			
			System.out.print("����:");
			String str = sc.next();
			if(calc.checkOpErr(str)) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��� �ּ���");
				sc.nextLine();
				continue;
			}
			int res = calc.run(str);
			System.out.println("��� ��� :" + res);
				
	
			
			
			System.out.println("��� �Ͻðڽ��ϱ�? ��� : Y , ���� : N");
			String strExit = sc.next();
			System.out.println(strExit.length() + ", " + strExit.charAt(0));
			if(strExit.equals("N") || strExit.equals("n")) {
				System.out.println("�����Դϴ�.");
				break;
			}
			
		}
		
	}
}

class Calc{
	private int n1, n2, res;
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public void setN2(int n2) {
		this.n2 = n2;
	}
	int run(String oper) {
		res = 0;
		// ���� : String�� equals() ���.
		if(oper.equals("*")) {
			 res = n1 * n2;
		}else if(oper.equals("-")) {
			res = n1 - n2;
		}else if(oper.equals("+")) {
			res = n1 + n2;
		}else if(oper.equals("/")) {
			res = n1 / n2;
		}
		return res; 
	}
	boolean checkOpErr(String oper) {
		if(oper.equals("*") || oper.equals("-") || oper.equals("+") || oper.equals("/")){
			return false;
		}
		return true;
	}
}



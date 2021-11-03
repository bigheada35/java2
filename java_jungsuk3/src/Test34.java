package e_test2_calculator_with_exception_scanner.copy;

import java.util.Scanner;

/*
아래의 결과를 나타내는 사칙연산 계산기를 완성하시오.
-주의 잘못된 입력이 있으면 처음부터 다시 입력을 받도록 
예외처리 구문(try catch)을 넣을것

*** 계산기 ***
수1 : 10
수2 : 20
연산 : +
계산 결과 : 30
계속 하시겠습니까? 계속 : Y , 종료 : N
y
*** 계산기 ***
수1 : R
잘못된 입력입니다. 다시입력해 주세요
*** 계산기 ***
수1 : 10
수2 : 20
연산 : *
계산 결과 : 200
계속 하시겠습니까? 계속 : Y , 종료 : N
y
*** 계산기 ***
수1 : 90
수2 : 80
연산 : /
계산 결과 : 1
계속 하시겠습니까? 계속 : Y , 종료 : N
n
종료입니다.
*/


public class Test33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();
		while(true) {
			System.out.println("*** 계산기 ***");
			
			try {
				System.out.print("수1:");
				int n1 = sc.nextInt();
				calc.setN1(n1);
		
			
				System.out.print("수2:");
				int n2 = sc.nextInt();
				calc.setN2(n2);
	
			}catch(Exception e){
				System.out.println("잘못된 입력입니다. 다시입력해 주세요");
				sc.nextLine();
				continue;
			}
			
			System.out.print("연산:");
			String str = sc.next();
			if(calc.checkOpErr(str)) {
				System.out.println("잘못된 입력입니다. 다시입력해 주세요");
				sc.nextLine();
				continue;
			}
			int res = calc.run(str);
			System.out.println("계산 결과 :" + res);
				
	
			
			
			System.out.println("계속 하시겠습니까? 계속 : Y , 종료 : N");
			String strExit = sc.next();
			System.out.println(strExit.length() + ", " + strExit.charAt(0));
			if(strExit.equals("N") || strExit.equals("n")) {
				System.out.println("종료입니다.");
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
		// 주의 : String은 equals() 사용.
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



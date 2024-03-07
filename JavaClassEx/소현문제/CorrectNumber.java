package sohyun;

import java.util.Scanner;

public class CorrectNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rannum = (int)(Math.random()*6)+1;
		System.out.println("1이상 6이하의 정수 입력");
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num=sc.nextInt();
			if(rannum == num) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("입력 : "+num+ "랜덤숫자 : "+rannum);
				System.out.println("다시 입력하세요.");
			}
		}
		

	}

}

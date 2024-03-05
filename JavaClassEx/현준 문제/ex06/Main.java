package ex06;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			Person person = new Person();

			
			System.out.println("-----MENU-----");
			System.out.println("1.정보추가 2.정보삭제 3.정보보기 etc.종료");
			System.out.print("입력 : ");
			int num = sc.nextInt();
			switch (num) {
			
			case 1:
				System.out.println("-----정보 추가-----");
				System.out.print("이름: ");
				person.setName(sc.next());
				System.out.print("전화번호: ");
				person.setTel(sc.next());
				System.out.print("나이: ");
				person.setAge(sc.nextInt());
				list.add(person);
				break;
			case 2:
				System.out.println("-----정보 삭제-----");
				System.out.print("삭제할 이름 입력: ");
				String name = sc.next();
				list.remove(list.equals(name));
				break;
			case 3:
				System.out.println("-----정보 보기-----");
				for (int i = 0; i < list.size(); i++) {
					System.out.println("이름 : " + list.get(i).getName() + "\s나이 : " + list.get(i).getAge() + "\s전화번호 : "
							+ list.get(i).getTel());
				}
				break;
			default:
				System.out.println("프로그램 종료");
				break;
			}
		}
	}

}
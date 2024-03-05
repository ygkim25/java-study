package ex06;

public class Person {
	private String name, tel;
	private int age;
	
	public Person(String name, int age, String tel) {
		this.name = name;
		this.tel = tel;
		this.age = age;
	}
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

package ch13.hw1;


public class Reader {
	String name;
	int age;
	char sex;
	
	Book book;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public char getSex() {
		return sex;
	}
	
	public void setSex(char sex) {
		this.sex = sex;
	}
	
	
	public Reader(String name , int age, char sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		
	}
	
	
	public Reader() {
		
	}
	
	
	public String Read (Book book) {
		return name;
		
	}
	
	
	
}

package Comparable;

import java.util.concurrent.Callable;

public class Students implements Comparable{
	String name;
	int age;
	Students(String name, int age){
		this.name = name;
		this.age = age;
	}
	Students(){
		this("noname",0);
	}
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
	
	public int compareTo(Object oj){
		Students temp = (Students) oj;
		if(age== temp.getAge()){
			return 0;
		}
		else if(age > temp.getAge()){
			return -1;
		}
		else 
			return 1;
	}
}

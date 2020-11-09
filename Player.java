package practice;

import java.util.ArrayList;

public class Player{
	int age;
	Player(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void display()
	{
		System.out.println("Age: " + this.age);
	}
	
}

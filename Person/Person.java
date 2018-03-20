package one;

import java.util.*;
public class Person
{
	private String name;
	private String eyeColor;
	private String gender;
	public Person(String name)
	{
		this.name = name;
		Random random = new Random();
		if (random.nextInt(2)==0)
		{
			gender="male";
		}
		else
		{
			gender="female";
		}
	}
	public Person(String name, String gender)
	{
		this.name = name;
		this.gender = gender;
	}
//	public static void main(String[] args)
//	{
//		//Person Class
//	}
	public int numToes()
	{
		return 10;
	}
	public String name()
	{
		return name;
	}
	public void setEyeColor(String color)
	{
		eyeColor = color;
	}
	public String getEyeColor() //sets eye color
	{
		return eyeColor;
	}
	public String getGender() //gets eye color
	{
		return gender;
	}
}

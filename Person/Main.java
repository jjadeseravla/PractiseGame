package one;

import java.util.*;
public class One
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Person person = new Person("Sam", "male"); //given it a gender so calls the method in Person.java with gender hard coded, if dont give gender, calls other method where gender is randomised
//		System.out.println(person.getGender());
//		person.setEyeColor("blue");
//		System.out.println(person.getEyeColor());
//		System.out.println(person.name());
		person.setEyeColor("hazel");
		System.out.println(person.name() + " is a " + person.getGender() + " with " + person.getEyeColor() + " coloured eyes");
	}
}

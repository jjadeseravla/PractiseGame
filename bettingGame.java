package one;

import java.util.*;
public class bettingGame
{
	static int money;
	static String userName;
	static Scanner in = new Scanner(System.in);
	static Random random = new Random();
	public static void main(String[] args)
	{
		System.out.println("please enter your username");
				userName=in.nextLine();
				System.out.println("Welcome " + userName);
				money = 1000;
				System.out.println("You have: £" + money);
				rollDice();
	}
	public static void rollDice()
	{
		System.out.println("You have £" + money);
		System.out.println("What number would you like to bet on?");
		int betRoll = in.nextInt();
		System.out.println("How much would you like to bet?");
		int betMoney = in.nextInt();
		while (betMoney > money)
		{
			System.out.println("You dont have much money, you have : £" + money + "enter your bet");
			betMoney = in.nextInt();
		}
		int dice;
		dice = random.nextInt(6) + 1;
		if (betRoll==dice)
		{
			System.out.println("You won! You win " + betMoney*6);
			money+=betRoll*6;
		}
		else
		{
			System.out.println("You lost");
			money-=betMoney;
		}
		if(money <= 0){
			System.out.println("you are broke");
		}
		else
		{
			rollDice();
		}
	}
}

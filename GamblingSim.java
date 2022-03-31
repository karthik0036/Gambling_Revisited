package com.Bridge;


//UC1 Initializing stake and betting amount
public class GamblingSim {
	static final int TOTAL_AMT = 100;
	static final int BET_AMT = 1;

	public static void game() {

		int result;
		result = TOTAL_AMT;
//UC3 resign for day if stack reaches more of less than 50%
		while( result > (TOTAL_AMT/2) && result < (TOTAL_AMT+(TOTAL_AMT/2)) )
		{
			double game_check = Math.floor(Math.random()*10)%2;
//UC2 Betting $1 so either wins or lose
			if( game_check == 1 )
			{
				result = result + BET_AMT ;
				System.out.println("won "+ result);
			}
			else
			{
				result = result - BET_AMT ;
				System.out.println("lost "+result);
			}
		}
		System.out.println("Result at the end of day :"+result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gambling game");

		game();
	}

}

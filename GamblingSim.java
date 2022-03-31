package com.Bridge;

public class GamblingSim {
	static final int TOTAL_AMT=100;
	static final int BET_AMT=1;
	
	public static void game() {
		
		int result;
		result = TOTAL_AMT;
		double check = Math.floor(Math.random()*10)%2;
		if(result == check) {
			result = result + BET_AMT;
			System.out.println("won  game and Amt is "+result);
		}
		else {
			result = result - BET_AMT;
			System.out.println("lost game with Amount left  "+result);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gambling game");
		
		game();
	}

}

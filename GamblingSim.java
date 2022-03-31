package com.Bridge;

//UC1 Initializing stake and betting amount
public class GamblingSim {
	static final int TOTAL_AMT = 100;
	static final int BET_AMT = 1;
	static final int DAYSINMONTH = 20;

	public static void game() {

		int result;
		int totalamount = 0;
		int monthly_investment_amount = 0;
//UC4 Calculate total amount for 20 days
		for (int day = 1; day < DAYSINMONTH; day++) {
			result = TOTAL_AMT;
//UC3 resign for day if stack reaches more of less than 50%
			while (result > (TOTAL_AMT / 2) && result < (TOTAL_AMT + (TOTAL_AMT / 2))) {
				double game_check = Math.floor(Math.random() * 10) % 2;
//UC2 Betting $1 so either wins or lose
				if (game_check == 1) {
					result = result + BET_AMT;
					// System.out.println("won " + result);
				} else {
					result = result - BET_AMT;
					// System.out.println("lost " + result);
				}
			}
			if (result > TOTAL_AMT) {
				System.out.println("Result at end of day :" + day + " is  Gambler Won $" + result);
			} else {
				System.out.println("Result at end of day :" + day + " is Gambler lost $" + result);
			}

//UC5 Total month result by how much amount
			monthly_investment_amount = monthly_investment_amount + TOTAL_AMT;
			totalamount = totalamount + result;
		}
		System.out.println("Total Amount after a month " + totalamount);
		System.out.println("Total investment Amount after a month " + monthly_investment_amount);
		if (totalamount > monthly_investment_amount) {
			System.out.println("Gambler won $" + (totalamount - monthly_investment_amount));
		} else
			System.out.println("Gambler lost $" + (monthly_investment_amount - totalamount));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Gambling game");

		game();
	}

}

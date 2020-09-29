package week2;

public class codeassingmentweek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		boolean isWeekday = true;
		boolean hasMoneyInPocket = true;
		
		double costOfMilk = 2.99;
		double moneyInWallet = 20.12;
		int thirstLevel = 7;
		
		boolean shouldByIcecream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay =  isHotOutside && hasMoneyInPocket & !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk *2 ;
	}
	
	}

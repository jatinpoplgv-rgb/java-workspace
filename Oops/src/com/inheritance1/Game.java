package com.inheritance1;

public class Game {
	String gameId;
	String gameName;
	int price;

	public Game(String gameId, String gameName, int price) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
	}

	public void displayGame() {
		System.out.println("GAME ID : " + gameId);
		System.out.println("GAME NAME : " + gameName);
		System.out.println("PRICE : " + price);
	}

}

class OnlineGames extends Game {
	boolean internetRequired;
	int serverCharge;

	public OnlineGames(String gameId, String gameName, int price, boolean internetRequired, int serverCharge) {
		super(gameId, gameName, price);
		this.internetRequired = internetRequired;
		this.serverCharge = serverCharge;
	}

	public void displayOnlineGames() {
		super.displayGame();
		System.out.println("Internet Required " + internetRequired);
		System.out.println(serverCharge);
	}

}

class PremiumGame extends OnlineGames {
	boolean premiumMembership;
	int discountPercentage;

	public PremiumGame(String gameId, String gameName, int price, boolean internetRequired, int serverCharge,
			boolean premiumMembership, int discountPercentage) {
		super(gameId, gameName, price, internetRequired, serverCharge);
		this.premiumMembership = premiumMembership;
		this.discountPercentage = discountPercentage;
	}

	public void displayPremium() {
		super.displayOnlineGames();
		System.out.println("Premium MemberShip : " + premiumMembership);
		System.out.println("Discount : " + discountPercentage);

	}

	public double calculateFinalPrice() {

		if (price >= 3000) {
			discountPercentage = 20;
		} else if (price >= 1500) {
			discountPercentage = 10;
		} else {
			discountPercentage = 0;
		}

		double discountAmount = price * discountPercentage / 100;

		double finalPrice = price - discountAmount + serverCharge;

		if (premiumMembership) {
			finalPrice = finalPrice - 200;
		}

		return finalPrice;
	}

	public void displayPremiumDetails() {
		System.out.println("Premium Membership: " + premiumMembership);
		System.out.println("Discount Percentage: " + discountPercentage + "%");
	}
}

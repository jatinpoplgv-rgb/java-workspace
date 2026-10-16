package com.inheritance1;

public class GameDriver {

	public static void main(String[] args) 
	{
		 PremiumGame[] games = new PremiumGame[4];

	       games [0] = new PremiumGame("GAM3444", "SPIDERMAN", 5000, true, 5, true, 5);
	       games [1] = new PremiumGame("GAM3555", "GOD OF WAR", 2000, true, 3, true, 4);
	       games[2] = new PremiumGame("GAM3666", "RACING GAME", 1000, false, 0, true,6);
	       games[3] = new PremiumGame( "GAM3666", "ADVENTURE GAME", 3500, true, 150, false,8);
	    		   
	       int premiumCount = 0;

	        for (int i = 0; i < games.length; i++) {

	        	System.out.println("----------------------------");
	            System.out.println("GAME " + (i + 1) + " DETAILS");
	            System.out.println("----------------------------");

	           
	            games[i].displayOnlineGames();

	            System.out.println("Premium Membership: "+ games[i].premiumMembership);
	                    

	            double finalPrice = games[i].calculateFinalPrice();

	            System.out.println("Discount: "+ games[i].discountPercentage + "%");
	                    

	            System.out.println("Final Price: ₹" + finalPrice);

	            if (games[i].premiumMembership) 
	            {
	                premiumCount++;
	            }
	        }

	        System.out.println("============================");
	        System.out.println("Total Games: " + games.length);
	        System.out.println("Games with Premium Membership: "
	                + premiumCount);
	    }
	
	       
	}




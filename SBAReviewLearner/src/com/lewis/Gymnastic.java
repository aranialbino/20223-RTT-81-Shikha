package com.lewis;

import java.util.Arrays;

public class Gymnastic implements Sports{
	
	private int [] playerIDs;  

	public Gymnastic() {
		   
		   playerIDs = new int[11];
		   for(int i = 0; i < playerIDs.length; i++) {
			   playerIDs[i] = 1;
			  // System.out.print(playerIDs[i]);
		   }
	   }
	   
	
	public int[] getPlayerIDs() {
			return playerIDs;
		}
	
	public void setPlayerIDs(int[] playerIDs) {
			this.playerIDs = playerIDs;
		}
   
		@Override
		public String toString() {
			return "Gymnastic [playerIDs=" + Arrays.toString(playerIDs) + "]";
		}


		@Override
		public void calculateAvgAge(int[] age) {
			
			double sum = 0;
			for(int i =0; i < age.length; i++) {
				//accumulate total
				sum += age[i];  
			}
			double averageAge = (sum/age.length);
			System.out.printf("The average age of the team is %.2f%n", averageAge);
		}


		@Override
		public void retirePlayer(int id) {
			try {
				if(playerIDs[id]== -1) {
					System.out.println("Player has already retired");
				}else {
					playerIDs[id] = -1;
					System.out.println("Player with id: " + id + " now has retired");
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				
				System.out.println("Player index " + id + " does not exist");
			}
			
		}
		
		public void playerTransfer(int fee, int id) {
			try {
				if(playerIDs[id] == 1) {
					System.out.println("Player with id: " + id + " has been transfered with a fee of " + fee);
				}else {
					if(playerIDs[id] == -1) {     //or else the player has already retired
						System.out.println("Player has already retied");    
					}
				}
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Player with id: " + id + " does not exist");
			}
		}
		
		
}

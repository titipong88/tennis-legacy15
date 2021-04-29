package com.test.tennis_legacy15;

import java.util.Random;

public class RunPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String player1,player2 = ""; 
		int    point1 = 0;
		int    point2 = 0;
		int    dPoint1 = 0;
		int    dPoint2 = 0;
		int    winner = 0;
		boolean nextPoint = true;
		
		System.out.println("Play1 :"+pointName(point1)+ " : play2 :"+pointName(point2));
		System.out.println("====================================");
		while(nextPoint){
			
			winner = randomWinner();
			
			if(winner == 0){
				point1 = point1 + 1;
			}else if(winner == 1){
				point2 = point2 + 1;
			}
			
			
			if((point1 == 4 && point2 != 4)){
				nextPoint = false;
				System.out.println("Play1 : Win");
			}else if((point1 != 4 && point2 == 4)){
				nextPoint = false;
				System.out.println("Play2 : Win");
			}else if((point1 == 4 && point2 == 4)){
				System.out.println("deuce");
//				if(){
//					
//				}
			}else{
				System.out.println("Play1 :"+point1+ " || play2 :"+point2);
				System.out.println("Play1 :"+pointName(point1)+ " : play2 :"+pointName(point2));
				System.out.println("====================================");
			}
		}
		
	}
	
	private static int randomWinner(){
		Random Dice = new Random();
		int n = Dice.nextInt(2);
//		System.out.println("N = "+n);
		return n;
	}
	
//	private static String callPoint(){
//		
//	}
	
	private static String pointName(int point){
		String result = "";
		if(point == 0){
			result = "love";
		}else if(point == 1){
			result = "fifteen";
		}else if(point == 2){
			result = "thirty";
		}else if(point == 3){
			result = "forty";
		}
		
		return result;
	}
	

}

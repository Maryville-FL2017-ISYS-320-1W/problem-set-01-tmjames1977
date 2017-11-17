/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | VARIABLE NAME	 | VARIABLE NAME	 | VARIABLE NAME	 |
| initialization	 |				 |				 |				 | 
| 1				 |				 |				 |				 |


*/

public class FollowTheLoop {

	   public static final int MAX = 4;
	   public static void loopDeDoop() {
	      int number = 0;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}

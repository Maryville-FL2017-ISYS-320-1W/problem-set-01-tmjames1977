/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: November 26, 2017
*/

/*

1. Fill out the table for the loop below

| ITERATION 	|  MAX	| COUNT	|  PRODUCT 	        |  NUMBER	            |
| initialization|   4	|       | count * 2 - 1 = 0 | number + product = 0  |
| 1				|	4	|	4 	| 4 * 2 - 1 = 7	    | 0 + 7 = 7				|
| 2				|	4	|	3  	| 3 * 2 - 1 = 5	    | 7 + 5 = 12			|
| 3				|	4	|	2 	| 2 * 2 - 1 = 3	    | 12 + 3 = 15			|
| 4				|	4	|	1  	| 1 * 2 - 1 = 1     | 15 + 1 = 16			|
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

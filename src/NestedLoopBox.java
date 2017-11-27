/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: November 26, 2017
*/

/* 
 * 4. Your pseudocode algorithm here
 * for each line print six *  (nested loop)
 * 
*/

/*
 * 5. Translated into working algorithm.
 */


public class NestedLoopBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int line = 0; line <= 6; line++)
		{
			for(int star = 0; star <=5; star++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
		}
	}
}



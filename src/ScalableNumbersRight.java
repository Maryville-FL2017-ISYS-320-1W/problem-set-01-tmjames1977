/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

public class ScalableNumbersRight {

	public static void main(String[] args) {
		for( int line = 1; line <= 5; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= 5 - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}

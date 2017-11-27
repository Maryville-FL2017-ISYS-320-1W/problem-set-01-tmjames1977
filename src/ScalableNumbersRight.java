/*
  	ISYS 320
  	Name(s): Timothy James
  	Date: November 26,2017
*/

public class ScalableNumbersRight {

	public static void main(String[] args) {
		for( int line = 1; line <= 7; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= 7 - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}
	}
}
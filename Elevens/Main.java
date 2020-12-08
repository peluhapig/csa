//import jdk.javadoc.internal.doclets.toolkit.util.DocFinder.Output;

class Main 
{
  /**
	 * The main method in this class checks the Card 
   * operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) 
  	{
		Card diaQueen1 = new Card("queen", "diamond", 12);
		Card diaQueen2 = new Card("queen", "diamond", 12);
		Card diaKing = new Card("king", "diamond", 13);

		System.out.println(diaQueen1);
		System.out.println(diaQueen1.suit());
		System.out.println(diaQueen1.rank());
		System.out.println(diaQueen1.pointValue());
		System.out.println(diaQueen1.matches(diaQueen2));
		System.out.println(diaQueen1.matches(diaKing));

	}
}
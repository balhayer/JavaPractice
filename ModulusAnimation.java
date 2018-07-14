public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		int numberOfTime = 5;
		for ( int i=0; i<numberOfTime*16; i++ )
		{
			if ( i%16 == 0 )
				System.out.print("Randy is cool. \r");
			else if (i%16 == 1)
				System.out.print(" Randy is cool.\r");
			else if (i%16 == 2)
				System.out.print(". Randy is cool\r");
			else if (i%16 == 3)
				System.out.print("l. Randy is coo\r");
			else if (i%16 == 4)
				System.out.print("ol. Randy is co\r");
			else if (i%16 == 5)
				System.out.print("ool. Randy is c\r");
			else if (i%16 == 6)
				System.out.print("cool. Randy is \r");
			else if (i%16 == 7)
				System.out.print(" cool. Randy is\r");
			else if (i%16 == 8)
				System.out.print("s cool. Randy i\r");
			else if (i%16 == 9)
				System.out.print("is cool. Randy \r");
			else if (i%16 == 10)
				System.out.print(" is cool. Randy\r");
			else if (i%16 == 11)
				System.out.print("y is cool. Rand\r");
			else if (i%16 == 12)
				System.out.print("dy is cool. Ran\r");
			else if (i%16 == 13)
				System.out.print("ndy is cool. Ra\r");
			else if (i%16 == 14)
				System.out.print("andy is cool. R\r");
			else if (i%16 == 15)
				System.out.print("Randy is cool. \r");
			Thread.sleep(200);
		}
		
	}
}
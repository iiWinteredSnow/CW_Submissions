/*
 *
 *
*/
public static String getMonth(int n)
	{
		//
		String months = "January February March April May June "
				+ "July August September October November December ";

    //
		for (int i = 1; i <= 12; i++)
		{
			// 
			int sL = months.indexOf(' ');

      //
			if (n == i)
			{
        //
				return months.substring(0, sL);
			}
      //
			else
			{
        //
				months = months.substring(sL + 1);
			}
		}
		//
		return " /* What String would you put here? */ ";
		
	}

/*
 *
 *
*/
public static String getMonth(int n)
	{
		// a string with a list of months in a sequence of january to december
		String months = "January February March April May June "
				+ "July August September October November December ";

    // runs as much times as the max number of months in a year
		for (int i = 1; i <= 12; i++)
		{
			// checks for the first index of a space or ' '
			int sL = months.indexOf(' ');

      // runs only when n is equal to i
			if (n == i)
			{
        // returns the month(returns the start of the month substring to the space)
				return months.substring(0, sL);
			}
      // if only N is not equal to i
			else
			{
        // removes the first month and sets that as the new string.
				months = months.substring(sL + 1);
			}
		}
		// only when n is less than 1 or greater than 12 it shoudl return an error
		return " /* What String would you put here? */ ";
		
	}

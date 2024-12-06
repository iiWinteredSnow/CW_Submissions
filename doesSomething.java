	/**
	 * This method is not static. What does this mean about how the method works? After code tracing, also answer
   	 * the following question: what does this method do?
	 * 
	 */
	public int doesSomething(char c)
	{
		/*
		 * This line below works even though str was not instantiated in the method.
		 * What conclusion can you draw from this fact?
		 * 
		 * 
		 * 
		 * 
		 * */

		int l = str.length();
		
		/*
		 * Why might executing the loop below result in a syntax error?
		 * 
		 * 
		 * 
		 */
		for (int i = 0; i <= l; i++)
		{
			
			/*
			 * What is this line checking for? What does it return if it is true?
			 * 
			 * 
			 */
			if (str.charAt(i) == c)
			{
				return i;
			}
			
		}
		/*
		 * What is the purpose of this line below? 
		 * Think about what needs to happen for it to be reached. 
		 * 
		 * 
		 */
		return -1;
		
	}

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
		 * str was called oustide this method. Possibly in the class.
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
			 * this line is checking for the first matching character of char c. 
			 * It returns the index of where it is instead of the actual position. EX: str = Clock; char c = o; then i = 2 but not 3.
			* can be fixed to return i + 1.
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
		 * no letters in the str match char c.
   		 * Something has to be returned or there will be a logic error.
		 */
		return -1;
		
	}

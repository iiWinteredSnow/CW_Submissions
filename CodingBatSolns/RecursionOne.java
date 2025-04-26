public int factorial(int n) {
  if (n<2)
  {
    return n;
  }
  return n * factorial(n-1);
}

// non recursive for the funny
public int bunnyEars(int bunnies) {
  return bunnies + bunnies;
}

public int bunnyEars(int bunnies) {
   if (bunnies == 0){ 
     return 0;
   }
   return 2 + bunnyEars(bunnies-1);
}


public int fibonacci(int n) {
  if (n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);

}

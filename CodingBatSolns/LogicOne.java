public boolean cigarParty(int cigars, boolean isWeekend) {
    if (isWeekend) 
  {
    return cigars>=40;
  } 
    else 
  {
    return cigars>=40&&cigars<=60;
  }
}

public int dateFashion(int you, int date) 
{
  if (you <=2 || date <= 2) {
  return 0; 
}
  if (you >=8 || date >=8) {
  return 2;
}
  return 1;
}

public boolean squirrelPlay(int temp, boolean isSummer) 
{
   int limit = isSummer?100:90;
   return temp>=60&&temp<=limit;
}

public int caughtSpeeding(int speed, boolean isBirthday) 
{
  int adjSpeed=isBirthday?speed-5:speed;
  if (adjSpeed<=60) 
{
  return 0;  
} 
  else if (adjSpeed<=80) 
{
  return 1;  
} 
  else 
{
  return 2; 
}
}

public int sortaSum(int a, int b) 
{
  int sum=a+b;
  if (sum>=10 && sum<=19) 
{
  return 20;
}
  return sum;
}

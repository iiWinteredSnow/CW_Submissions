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
   int upperLimit = isSummer?100:90;
   return temp>=60&&temp<=upperLimit;
}

public int caughtSpeeding(int speed, boolean isBirthday) 
{
  int adjustedSpeed=isBirthday?speed-5:speed;
  if (adjustedSpeed<=60) 
{
  return 0;  
} 
  else if (adjustedSpeed<=80) 
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

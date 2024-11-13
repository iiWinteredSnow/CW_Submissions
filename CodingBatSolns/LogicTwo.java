public String alarmClock(int day, boolean vacation) {
  if (vacation==true)
  {
    if ((day>0)&&(day<6))
    {
      return "10:00";
    }
      return "off";
  }
  else if ((day>0)&&(day<6))
    {
      return "7:00";
    }
      return "10:00";
  
}

public boolean old35(int n) {
  if (n%3==n%5)
  {
    return false;
  }
  if ((n%3==0)||(n%5==0))
  {
    return true;
  }

  return false;
}



public boolean in1To10(int n, boolean outsideMode) {
  if (outsideMode == true)
  {
      if ((n>=10)||(n<=1))
    {
     return true;
    }
  return false;
  }
  if ((n>0)&&(n<11))
  {
    return true;
  }
  return false;
}


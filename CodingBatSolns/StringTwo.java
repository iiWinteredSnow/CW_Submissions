 public String makeOutWord(String out, String word) {
  return out.substring(0, 2) + word + out.substring(2);
}
public String firstTwo(String str) {
    // Check the string length with an if-else condition
    if (str.length() < 2) {
        return str;
    } 
     return str.substring(0, 2);
}
public String extraEnd(String str) {
    String lastTwo = str.substring(str.length() - 2);
    return lastTwo+lastTwo+lastTwo;
}
public String withoutEnd(String str) {
    if (str.length() > 2) {
        return str.substring(1, str.length() - 1);
    }
    return "";
}

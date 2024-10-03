public String helloName(String name) {
  return "Hello " + name+"!";
}
public String makeAbba(String a, String b) {
  return a+b+b+a;
}
public String makeTags(String tag, String word) {
  return "<"+tag+">"+word+"</"+tag+">";
}
public String firstHalf(String str) {
  int len = str.length();
  String half = new String(str.substring(0,len/2));
  return half;
}

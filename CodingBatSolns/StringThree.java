public String doubleChar(String str) {
    String result = "";
    for (char c : str.toCharArray()) { // the colon separates the loop iterations and .toCharArray() converts the String str into an array of characters
        result += c; // Adds the character once
        result += c; // Adds the character again
    }
    return result;
}

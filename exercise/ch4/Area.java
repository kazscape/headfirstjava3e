class Area {
  public static void main(String[] args) {
    int a = calcArea(7, 12);
    short c = 7;
    calcArea(c, 15);

    // int d = calcArea(57);     // not legal
    
    calcArea(2, 3);

    long t = 42;
    // int f = calcArea(t, 17);  // not legal

    //  int g = calcArea();      // not legal

    // calcArea();               // not legal

    // byte h = calcArea(4, 20); // not legal

    // int j = calcArea(2, 3, 5); // not legal
  }

  static int calcArea(int height, int width) {
    return height * width;
  }
}

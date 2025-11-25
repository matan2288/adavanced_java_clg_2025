interface Color {
  public int getRed(int i);

  public int getGreen(int i);

  public int getBlue(int i);
}

class ColoredItem implements Color {
  private int redColor = 0;
  private int greenColor = 0;
  private int blueColor = 0;

  void setColors(int r, int g, int b) {
    this.redColor = r;
    this.greenColor = g;
    this.blueColor = b;
  }

  public int getRed(int r) {
    return r;
  }

  public int getGreen(int g) {
    return g;
  }

  public int getBlue(int b) {
    return b;
  }
}

public class Main {

}

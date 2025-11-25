
class Distance {
  private int x = 0;

  public int getDistance() {
    return x;
  }

  public void setDistance(int i) {
    x = i;
  }

}

class PositiveDistance extends Distance {
  @Override
  public void setDistance(int i) {
    if (i > 0) {
      super.setDistance(i);
    } else {
      System.out.println("Please type a number bigger then 0");
    }
  }
}

public class Main {
    public static void main(String[] args) {
      PositiveDistance n = new PositiveDistance();
      n.setDistance(-1);
    }
}

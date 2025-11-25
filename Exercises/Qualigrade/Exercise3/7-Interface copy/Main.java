interface First {
  public int a();

  public int b();

  public int c();
}

interface Second {
  public int b();

  public int c(int i);

  public int d(int i);
}

class Age implements First, Second {
  @Override

  public int a() {
    return 0;
  }
  @Override
  public int b () {
    return 0;
  }
  @Override
  public int c () {
    return 0;
  }
  @Override
  public int c(int i) {
    return 0;
  }
  @Override
  public int d(int i) {
    return 0;
  }
}

public class Main {

}

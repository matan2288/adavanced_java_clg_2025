package Exercises.Polymorphisem_Constructors.Exec5;

// בהינתן שלושת המחלקות הבאות מה יהיה פלט התוכנית?
class Window {
    private String title;
    private int width;
    private int height;

    public Window(String title) {
        this(title, 600, 400);
    }

    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return title + ":" + width + "x" + height;
    }
}

class Button extends Window {
    private String value;
    public Button(String title, int width, int height) {
        super("Button", height, width);
        this.value = title;
    }

    @Override
    public String toString() {
        return super.toString() + ": " + value;
    }
}

class Test {
    public static void main(String[] args) {
        Window w = new Button("OK", 80, 20);
        System.out.println(w.toString());
    }
}

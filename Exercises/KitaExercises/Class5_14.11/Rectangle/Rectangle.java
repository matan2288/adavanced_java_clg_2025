import java.util.Arrays;

public class Rectangle {
    private Point topLeft;
    private Point bottomRight;
    private int length;
    private int width;

    // 1. Square Constructor
    public Rectangle(Point topLeft, int width) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = width;
    }

    // 2. Rec topLeft & bottomRight
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // 3. Rec topLeftCoordinates & bottomRight
    public Rectangle(int x, int y, Point bottomRight) {
        this.topLeft = new Point(x, y);
        this.bottomRight = bottomRight;
    }

    // 4. Rec topLeft Coordinates & bottomRight Coordinates
    public Rectangle(int topLeftx, int topLefty, int bottomRightx, int bottomRighty) {
        this.topLeft = new Point(topLeftx, topLefty);
        this.bottomRight = new Point(bottomRightx, bottomRighty);
    }

    // 5. Rec with length/width & left top left of (0.0)
    public Rectangle(int length, int width) {
        this.width = width;
        this.length = width;
        this.topLeft = new Point(0, 0);
    }

    // 6. Rec with width and top left(0.0)
    public Rectangle(int width) {
        this.width = width;
        this.length = width;
        this.topLeft = new Point(0, 0);
    }

    // 7. Rec constructor copy (copy of rec 6)
    public Rectangle(Rectangle recCopy) {
        this.length = recCopy.length;
        this.width = recCopy.width;
        this.topLeft = new Point(recCopy.topLeft.x, recCopy.topLeft.y);
    }

    // 8. Rec constructor with a different point
    public Rectangle(Rectangle recCopy, Point topLeft) {
        this.length = recCopy.length;
        this.width = recCopy.width;
        this.topLeft = topLeft;
    }

    public static void main(String[] args) {
        Point newTopLeftPoint = new Point(1, 2);
        Point newBottomRightPoint = new Point(5, 6);
        // 1. Square Constructor
        Rectangle Square = new Rectangle(newTopLeftPoint, 3);

        // 2. Rec topLeft & bottomRight
        Rectangle topLeftBottomRightRec = new Rectangle(newTopLeftPoint, newBottomRightPoint);

        // 3. Rec topLeftCoordinates & bottomRight
        Rectangle topLeftCoordinatesBottomRightRec = new Rectangle(newTopLeftPoint.x, newTopLeftPoint.y,
                newBottomRightPoint);

        // 4. Rec topLeft Coordinates & bottomRight Coordinates
        Rectangle topLeftBottomRightCoordinatesRec = new Rectangle(newTopLeftPoint, newBottomRightPoint);

        // 5. Rec with length/width & left top right of (0.0)
        Rectangle lengthWidthZeroZeroTopLeft = new Rectangle(1, 2);

        // 6. Square with width and top left(0.0)
        Rectangle squareWithZeroZeroTopLeft = new Rectangle(4);

        // 7. Square with width and top left(0.0), copy of 6
        Rectangle rectangleCopy = new Rectangle(squareWithZeroZeroTopLeft);

        // 8. Rec constructor with a different point
        Rectangle rectangleCopyDiffrentPoint = new Rectangle(squareWithZeroZeroTopLeft, newTopLeftPoint);
        System.out.println(rectangleCopyDiffrentPoint.length);
    }
}

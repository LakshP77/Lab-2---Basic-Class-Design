public class Square {
    // 1. Instance variables
    private int x;
    private int y;
    private double sideLength;
    private String shape = "[]";

    // 4. Constructors
    public Square() {
        this.x = 0;
        this.y = 0;
        this.sideLength = 0.0;
    }

    public Square(int nx, int ny) {
        this.x = nx;
        this.y = ny;
        this.sideLength = 0.0;
    }

    public Square(int nx, int ny, double sL) {
        this.x = nx;
        this.y = ny;
        this.sideLength = sL;
    }

    // 5. Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getSideLength() {
        return sideLength;
    }

    // 6. Setters
    public void setX(int nX) {
        this.x = nX;
    }

    public void setY(int nY) {
        this.y = nY;
    }

    public void setSideLength(double sL) {
        this.sideLength = sL;
    }

    // 7. draw() method + toString()
    public String draw() {
        return shape;
    }

    @Override
    public String toString() {
        return draw();
    }

    // 8. equals() method
    public boolean equals(Square that) {
        return this.x == that.x && this.y == that.y && this.sideLength == that.sideLength;
    }

    // 9. getArea() method
    public double getArea() {
        return sideLength * sideLength;
    }
}

public class Circle {
    // Instance variables
    private int x;
    private int y;
    private double radius;
    private String shape = "O";

    // Constructors
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.radius = 0.0;
    }

    public Circle(int nx, int ny) {
        this.x = nx;
        this.y = ny;
        this.radius = 0.0;
    }

    public Circle(int nx, int ny, double r) {
        this.x = nx;
        this.y = ny;
        this.radius = r;
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }

    // Setters
    public void setX(int nX) {
        this.x = nX;
    }

    public void setY(int nY) {
        this.y = nY;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    // draw() + toString()
    public String draw() {
        return shape;
    }

    @Override
    public String toString() {
        return draw();
    }

    // equals() method
    public boolean equals(Circle that) {
        return this.x == that.x && this.y == that.y && this.radius == that.radius;
    }

    // getArea() method
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

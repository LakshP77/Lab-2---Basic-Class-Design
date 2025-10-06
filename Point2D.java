/*
public class Point2D {
    private int x;
    private int y;
    // 1. Inside the class file, all methods can freely access x and y
    // 2. Code in other classes cannot access x and y
    // 3. No, they are instance variables, so you need an object to use them

    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public Point2D(int nX, int nY) {
        this.x = nX;
        this.y = nY;
    }

    // Setter methods (mutators)
    public void setX(int nX) {
        this.x = nX;
    }

    public void setY(int nY) {
        this.y = nY;
    }

    // Getter methods (accessors)
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // New method: reset both x and y to (0,0)
    public void resetToOrigin() {
        this.x = 0;
        this.y = 0;
    }

    // Translate (shift) the point by dx and dy
    public void translate(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    // A utility method to print the point
    @Override
    // Override essentially throws an error instead of silently making a new method
    // This will happen if you get the method signature wrong

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        // check if the same reference
        if (this == obj) {
            return true;
        }
        // check for null or wrong type
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // cast and compare field values
        Point2D other = (Point2D) obj;
        return this.x == other.x && this.y == other.y;
    }
}

*/

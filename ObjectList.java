public class ObjectList {
    // Array to hold all shapes (Squares, Circles, etc.)
    private Object[] myShapes = new Object[100];

    // Number of active shapes
    private int numElements = 0;

    // Add a new shape (Square or Circle)
    public void add(Object nx) {
        if (numElements < myShapes.length) {
            myShapes[numElements] = nx;
            numElements++;
        } else {
            System.out.println("List is full. Cannot add more shapes.");
        }
    }

    // Override toString() to "draw" the picture by printing all shapes
    @Override
    public String toString() {
        StringBuilder picture = new StringBuilder();

        for (int i = 0; i < numElements; i++) {
            // Each shape already has its own toString() (which calls draw())
            picture.append(myShapes[i].toString());

            // You can choose whether to print inline or newline-separated
            picture.append(" ");  // inline spacing
            // picture.append("\n"); // uncomment this line instead for stacked output
        }

        return picture.toString();
    }
}

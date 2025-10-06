public class IntList {
    private int[] data = new int[100];
    private int numElements = 0;

    public void add(int n) {
        if (numElements < data.length) {
            data[numElements] = n;   // insert value at current index
            numElements++;            // move to next position
        } else {
            System.out.println("List is full! Cannot add more integers.");
        }
    }

    @Override
    public String toString() {
        if (numElements == 0) {
            return "";
        }

        StringBuilder retVal = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            retVal.append(data[i]);
            if (i < numElements - 1) { // avoid trailing comma
                retVal.append(", ");
            }
        }
        return retVal.toString();
    }

    public int sum() {
        int total = 0;
        for (int i = 0; i < numElements; i++) {
            total += data[i];
        }
        return total;
    }
}

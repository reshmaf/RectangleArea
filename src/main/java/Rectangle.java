import exceptions.NegativeDimensionException;
import exceptions.zeroDimensionException;

public class Rectangle {

    private final float length;
    private final float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float area() throws NegativeDimensionException, zeroDimensionException {
        String isValid = validateDimensions(length, breadth);
        float area;

        if (isValid.equals("valid") ({
                area = Math.round((length * breadth) * 100) / (float) 100;
        }
        return area;
    }

    public String validateDimensions(float length, float breadth) throws NegativeDimensionException, zeroDimensionException {
        if (length < 0 || breadth < 0) {
            throw new NegativeDimensionException();
        }
        if (length == 0 || breadth == 0) {
            throw new zeroDimensionException();
        }
        return "valid";
    }
}


public class Activity1 {
    public static void main(String[] args) {
        
    }
    private int radius;
    private int diameter;
    private final double PI = 3.14159;
    private double area;

    public void DebugCircle(int r) {
        radius = r;
        diameter = 2 * r;
        area = PI * r * r;
    }

    public int getRadius() {
        return radius;
    }

    public int getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}

/*
 1. wrong placement of opening bracket
 2. Semicolon after method
 3. Mispelled method name
 4. public void instead of public int
 5. no main method
 */


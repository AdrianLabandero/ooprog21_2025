public class Activity3 {

     public static void main(String[] args) {
        Activity3 pen1 = new Activity3();
        System.out.println("Pen1 color: " + pen1.getColor());
        System.out.println("Pen1 point: " + pen1.getPoint());

        Activity3 pen2 = new Activity3("blue", "medium");
        System.out.println("Pen2 color: " + pen2.getColor());
        System.out.println("Pen2 point: " + pen2.getPoint());
    }

    private String color;
    private String point;

    
    public Activity3() {
        color = "black";
        point = "fine";
    }

    
    public Activity3(String color, String point) {
        this.color = color;
        this.point = point;
    }

    public String getColor() {
        return color;
    }

    public String getPoint() {
        return point;
    }

   
}


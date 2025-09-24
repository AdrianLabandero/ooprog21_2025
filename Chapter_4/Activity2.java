public class Activity2 {
     public static void main(String[] args) {
        Activity2 box1 = new Activity2();
        box1.showData();
        System.out.println("Volume: " + box1.getVolume());

        Activity2 box2 = new Activity2(3, 4, 5);
        box2.showData();
        System.out.println("Volume: " + box2.getVolume());
    }

    private int width;
    private int length;
    private int height;

    
    public Activity2() {
        length = 1;
        width = 1;
        height = 1;
    }

    
    public Activity2(int width, int length, int height) {
        this.width = width;
        this.length = length; 
        this.height = height;
    }

    public void showData() {
        System.out.println("Width: " + width + " Length: " +
                           length + " Height: " + height);
    }

    public double getVolume() {
        double vol = length * width * height;
        return vol;
    }

}

/*
 1. no main method  
 2. wrong placement of opening bracket
 3. wrong assignment of parameters
 4. wrong method names (Using Capital Letter)
 */
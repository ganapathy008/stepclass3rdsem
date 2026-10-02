package stepclass3rdsem.weekseven;
class TrafficLight {
    private String color;
    private final String id;

    TrafficLight(String id) {
        this.id = id;
        this.color = "RED";
    }

    void next() {
        if (color.equals("RED")) color = "GREEN";
        else if (color.equals("GREEN")) color = "YELLOW";
        else color = "RED";
        System.out.println("Next color: " + color);
    }

    String getColor() {
        return color;
    }

    String getId() {
        return id;
    }
}

public class TrafficLight1 {
    public static void main(String[] args) {
        TrafficLight t = new TrafficLight("TL-9");
        System.out.println("Initial: " + t.getColor());
        t.next();
        t.next();
        t.next();
    }
}



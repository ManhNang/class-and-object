public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5.0;
        color = "blue";
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getcolor() {
        return color;
    }

    public void setSpeed(String choice) {
        switch (choice) {
            case "SLOW":
                speed = SLOW;
                break;
            case "MEDIUM":
                speed = MEDIUM;
                break;
            case "FAST":
                speed = FAST;
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }

    public void setOn(boolean isOn) {
        this.on = isOn;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "speed: " + speed + ", color: " + color + ", radius: " + radius + ". fan is on!";
        }

        return "color: " + color + ", radius: " + radius + ". fan is off!";
    }
}

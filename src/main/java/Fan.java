/*Programmer: Austin Parker Date: July 3, 2020
 * Assignment: PE 9.8 FanClassD
 * Description: Program represents a fan containing speed, radius, and color*/

public class Fan {
    //Declared constants
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    //Declared data
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    //Accessor methods for data
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    //If statement to format output based on results
    public String toString() {
        if (on) {
            return String.format("A " + radius + " inch %s fan at a speed of %d", color, speed);
        } else {
            return String.format("A " + radius + " inch %s fan; fan is off", color);
        }
    }

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setOn(true);
        fan.setColor("red");
        fan.setRadius(10);
        fan.setSpeed(FAST);
        System.out.println(fan);

        fan = new Fan();
        System.out.println(fan);

    }
}

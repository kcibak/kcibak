
public class Fan {

	  public static final int SLOW = 1;
	    public static final int MEDIUM = 2;
	    public static final int FAST = 3;

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

	    public void setSpeed(int speed) {
	        this.speed = speed;
	    }

	    public boolean isOn() {
	        return on;
	    }

	    public void setRadius(double radius) {
	        this.radius = radius;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }
	    public void setOn(boolean on) {
	        this.on = on;
	    }

	    @Override
	    public String toString() {
	        if (on) {
	            return String.format("A " + radius + " inch %s fan at a speed of %d", color, speed);
	        } else {
	            return String.format("A " + radius + " inch %s fan; fan is off", color);
	        }
	    }

	    public static void main(String[] args) {
	        Fan fan1 = new Fan();
	        fan1.setOn(true);
	        fan1.setColor("yellow");
	        fan1.setRadius(10);
	        fan1.setSpeed(FAST);
	        System.out.println(fan1.toString());

	        Fan fan2 = new Fan();
	        fan2.setOn(true);
	        fan2.setSpeed(MEDIUM);
	        System.out.println(fan2.toString());
	    }
	}


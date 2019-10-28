public class Car extends Vehicle {
    private boolean aircondition;

    public Car(String name, double capacity, double burning, boolean aircondition) {
        super(name, capacity, burning);
        this.aircondition = aircondition;
    }

    public Car(String name,boolean aircondition) {
        super(name);
        this.aircondition = aircondition;
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " , Air Condition: " + aircondition;
    }

    @Override
     double range() {
        if (aircondition) {
            return (getCapacity() / (getBurning() + 0.8)) * 100;
        } else {
            return super.range();

        }

    }
}


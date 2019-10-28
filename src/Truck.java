public class Truck extends Car {
    private double loadWeight;

    public Truck(String name, double capacity, double burning, boolean aircondition, double loadWeight) {
        super(name, capacity, burning, aircondition);
        this.loadWeight = loadWeight;
    }

    public Truck(String name, boolean aircondition) {
        super(name, aircondition);
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

    @Override
    public double range() {
        if (isAircondition()) {
            return (getCapacity() / ((getLoadWeight() / 100) * 0.5) + (getBurning() + 1.6)) * 100;
        } else {
            return (getCapacity() / ((getLoadWeight() / 100) * 0.5) + getBurning()) * 100;
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " ,Load weight : " + loadWeight;
    }
}

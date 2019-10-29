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
            double extra=1.6;
            return rangeBasic() + (getBurning() + extra) * 100;
        } else {
            return rangeBasic() + getBurning() * 100;
        }
    }

    public double rangeBasic(){
        double extra = 0.5;
        return (getCapacity() / ((getLoadWeight() / 100) * extra));
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " ,Load weight : " + loadWeight;
    }
}

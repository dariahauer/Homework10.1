public class Vehicle {
    private String name;
    private double capacity;
    private double burning;

    public Vehicle(String name, double capacity, double burning) {
        this.name = name;
        this.capacity = capacity;
        this.burning = burning;
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getBurning() {
        return burning;
    }

    public void setBurning(double burning) {
        this.burning = burning;
    }

    public String getInfo() {
        return "Name: " + name + " ,Capacity: " + capacity + " ,Burning: " + burning;
    }

    double range() {
        return capacity / burning * 100;
    }
}

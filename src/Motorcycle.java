public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void getDescription() {
        super.getDescription();
        System.out.println("Has a sidecar: " + (hasSidecar ? "yes" : "no"));
    }
}

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void getDescription(){
        System.out.println();
        System.out.println(">>> Vehicle description (" + this.getClass().toString().substring(6)
                + ") <<<\nMake: " + make + "\nModel: " + model + "\nyear: " + year);
    }
}

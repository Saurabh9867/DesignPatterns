package CreationDesignPattern.Builder;

public class Car {

    private int id;
    private String brand;
    private String model;
    private String color;
    private String door;

    public Car(int id, String brand, String model, String color, String door) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.door = door;
    }

    // add more method as per business logic
}

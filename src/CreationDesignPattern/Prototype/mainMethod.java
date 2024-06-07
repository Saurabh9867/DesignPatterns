package CreationDesignPattern.Prototype;

public class mainMethod {
    public static void main(String[] args) {

        Bike bike = new Bike(1, "Hero", "z500", new Engine());
        Bike bikeDeepClone = (Bike) bike.clone();

    }
}

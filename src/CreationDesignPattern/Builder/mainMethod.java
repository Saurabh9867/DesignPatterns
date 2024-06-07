package CreationDesignPattern.Builder;

public class mainMethod {
    public static void main(String[] args) {

        CarBuilder carBuilder = new CarBuilder().setId(1)
                .setBrand("Tata")
                .setModel("Harrier")
                .setColor("Green");

        Car car = carBuilder.build();

    }
}

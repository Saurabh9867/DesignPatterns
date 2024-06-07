package CreationDesignPattern.Prototype;

public class Bike implements ProtoType{

    private int id;
    private String name;
    private String model;
    private Engine engine;

    public Bike(int id, String name, String model, Engine engine) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.engine = engine;
    }

    Bike(Bike bike){
        this.id = bike.id;
        this.name = bike.name;
        this.model = bike.model;
        this.engine = new Engine();
    }

    @Override
    public Object clone(){
        return new Bike(this);
    }
}

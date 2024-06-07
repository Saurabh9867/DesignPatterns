package CreationDesignPattern.Factory;

public class nonVegBurger implements Burger{

    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void prepare() {
        //steps to create burget
    }
}

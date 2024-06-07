package CreationDesignPattern.Factory;

public abstract class Resto {

    public Burger orderBurger(){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}

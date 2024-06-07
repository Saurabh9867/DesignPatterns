package CreationDesignPattern.Factory;

public class nonVegBurgerResto extends Resto{

    @Override
    public Burger createBurger(){
        return new nonVegBurger();
    }
}

package CreationDesignPattern.Factory;

public class vegBurgerResto extends Resto{

    @Override
    public Burger createBurger(){
        return new vegBurger();
    }
}

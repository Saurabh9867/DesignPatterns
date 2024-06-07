package CreationDesignPattern.Factory;

public class mainMethod {
    public static void main(String[] args) {

        Resto vegBurger = new vegBurgerResto();
        Burger burger = vegBurger.orderBurger();

        Resto nonVegBurger = new nonVegBurgerResto();
        Burger burger1 = nonVegBurger.orderBurger();
    }
}

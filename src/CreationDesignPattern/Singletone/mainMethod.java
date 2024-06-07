package CreationDesignPattern.Singletone;

public class mainMethod {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance("Object1");
        Singleton obj2 = Singleton.getInstance("Object2");

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
    }
}

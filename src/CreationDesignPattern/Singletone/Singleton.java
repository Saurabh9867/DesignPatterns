package CreationDesignPattern.Singletone;

public class Singleton {

    private static volatile Singleton instance;
    private String data;

    private Singleton(String data){
        this.data = data;
    }

    public static Singleton getInstance(String data){
        Singleton result = instance;
        if(result == null){
            synchronized (Singleton.class) {
                result = instance;
                if(instance == null) {
                    result = instance = new Singleton(data);
                }
            }
        }
        return result;
    }
}

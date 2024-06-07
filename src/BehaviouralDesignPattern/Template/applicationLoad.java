package BehaviouralDesignPattern.Template;

public abstract class applicationLoad {

    public void loadApp(){
        loadSystemFile();
        loadUIFile();
        allocateMemory();
        deleteTempFile();
        launchApplication();
    }

    abstract boolean loadSystemFile();
    abstract boolean loadUIFile();
    abstract boolean allocateMemory();
    abstract boolean deleteTempFile();
    abstract void launchApplication();

}

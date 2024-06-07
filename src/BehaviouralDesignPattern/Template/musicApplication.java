package BehaviouralDesignPattern.Template;

public class musicApplication extends applicationLoad{

    @Override
    protected boolean loadSystemFile() {
        return false;
    }

    @Override
    protected boolean loadUIFile() {
        return false;
    }

    @Override
    protected boolean allocateMemory() {
        return false;
    }

    @Override
    protected boolean deleteTempFile() {
        return false;
    }

    @Override
    protected void launchApplication() {

    }
}

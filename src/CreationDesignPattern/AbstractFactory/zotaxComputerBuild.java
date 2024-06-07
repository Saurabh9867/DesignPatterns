package CreationDesignPattern.AbstractFactory;

public class zotaxComputerBuild extends computerBuild{

    @Override
    public GPU getGPUComponent(){
        return new zotaxGPU();
    }

    @Override
    public Monitor getMonitorComponent(){
        return new zotaxMonitor();
    }
}

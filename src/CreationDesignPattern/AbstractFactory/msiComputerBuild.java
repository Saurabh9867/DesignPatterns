package CreationDesignPattern.AbstractFactory;

public class msiComputerBuild extends computerBuild{

    @Override
    public GPU getGPUComponent(){
        return new msiGPU();
    }

    @Override
    public Monitor getMonitorComponent(){
        return new msiMonitor();
    }
}

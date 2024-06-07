package CreationDesignPattern.AbstractFactory;

public class mainMethod {
    public static void main(String[] args) {

        computerBuild build = new zotaxComputerBuild();
        GPU zotaxGPU = build.getGPUComponent();
        Monitor zotaxMonitor = build.getMonitorComponent();

        computerBuild build1 = new msiComputerBuild();
        GPU msiGPU = build1.getGPUComponent();
        Monitor msiMonitor = build.getMonitorComponent();


    }
}

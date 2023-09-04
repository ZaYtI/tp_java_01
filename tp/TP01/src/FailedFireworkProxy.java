public class FailedFireworkProxy implements LaunchFireWork{

    Firework firework;
    public FailedFireworkProxy(Firework firework){
        this.firework = firework;
    }
    @Override
    public void launchFirework() {
        System.out.println("System.out.print(\"pschit\");");
    }
}

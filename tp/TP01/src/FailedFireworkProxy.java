public class FailedFireworkProxy implements LaunchFireWork{

    LaunchFireWork firework;
    public FailedFireworkProxy(LaunchFireWork firework){
        this.firework = firework;
    }
    @Override
    public void launchFirework() {
        if(Math.random() < 0.2){
            System.out.println("pschit");
            return;
        }
        firework.launchFirework();
    }
}

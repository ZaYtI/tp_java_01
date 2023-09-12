public class FireworkDecorator implements LaunchFireWork{

    private final Firework decoreFirework;

    public FireworkDecorator(Firework decoreFirework) {
        this.decoreFirework = decoreFirework;
    }
    @Override
    public void launchFirework() {
        decoreFirework.launchFirework();
        decoreFirework.launchFirework();
    }
}

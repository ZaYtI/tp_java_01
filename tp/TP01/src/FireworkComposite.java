import java.util.ArrayList;
import java.util.List;

public class FireworkComposite implements LaunchFireWork{

    private List<Firework> feuxEnfants = new ArrayList<>();

    public void addFirework(Firework feu) {
        feuxEnfants.add(feu);
    }
    @Override
    public void launchFirework() {
        for (Firework feu : feuxEnfants) {
            feu.launchFirework();
        }
    }
}

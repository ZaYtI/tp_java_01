import java.util.ArrayList;
import java.util.List;

public class FireworkComposite implements LaunchFireWork{

    private List<LaunchFireWork> feuxEnfants = new ArrayList<>();

    public void addFirework(LaunchFireWork feu) {
        feuxEnfants.add(feu);
    }
    @Override
    public void launchFirework() {
        for (LaunchFireWork feu : feuxEnfants) {
            feu.launchFirework();
        }
    }
}

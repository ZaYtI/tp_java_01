/**
 * La classe CometFirework représente un type particulier de feux d'artifice,
 * qui se comportent comme des comètes.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class CometFirework implements LaunchFireWork{



    /**
     * Donne la chaîne de caractères à afficher pour représenter l'explosion
     * de ce feu d'artifice.
     *
     * @return La chaîne de caractères représentant l'explosion.
     */
    public String getCometExplosionString() {
        return "PIOUUUUU!";
    }

    @Override
    public void launchFirework() {
        System.out.println(this.getCometExplosionString());
    }
}


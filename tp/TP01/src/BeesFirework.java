/**
 * La classe BeesFirework représente un type particulier de feux d'artifice,
 * qui se comportent comme un groupe d'abeilles.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class BeesFirework {

    private static BeesFirework instance = null;

    /**
     * Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur.
     */
    BeesFirework() {
        // Initialisation du Singleton
    }

    /**
     * Méthode pour obtenir l'instance unique du Singleton.
     *
     * @return L'instance unique de BeesFirework.
     */
    public static BeesFirework getInstance() {
        if (instance == null) {
            instance = new BeesFirework();
        }
        return instance;
    }

    /**
     * Donne la chaîne de caractères à afficher pour représenter l'explosion
     * de ce feu d'artifice.
     *
     * @return La chaîne de caractères représentant l'explosion.
     */
    public String getBeesExplosionString() {
        return "Bzzzzzz!";
    }
}


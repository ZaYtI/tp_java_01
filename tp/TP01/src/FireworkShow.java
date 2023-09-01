/**
 * Ce logiciel est distribué à des fins éducatives.
 *
 * Il est fourni "tel quel", sans garantie d’aucune sorte, explicite
 * ou implicite, notamment sans garantie de qualité marchande, d’adéquation
 * à un usage particulier et d’absence de contrefaçon.
 * En aucun cas, les auteurs ou titulaires du droit d’auteur ne seront
 * responsables de tout dommage, réclamation ou autre responsabilité, que ce
 * soit dans le cadre d’un contrat, d’un délit ou autre, en provenance de,
 * consécutif à ou en relation avec le logiciel ou son utilisation, ou avec
 * d’autres éléments du logiciel.
 *
 * (c) 2022-2023 Romain Wallon - Université d'Artois.
 * Tous droits réservés.
 */

import java.util.ArrayList;
import java.util.Collections;

/**
 * La classe Firework représente un feu d'artifice dans le spectacle.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
class Firework {

    /**
     * La taille du feu d'artifice.
     */
    int size;

    /**
     * La couleur du feu d'artifice.
     */
    String color;

    /**
     * Si le feu d'artifice explose deux fois.
     */
    boolean isDouble;

    /**
     * Crée une nouvelle instance de Firework.
     *
     * @param size La taille du feu d'artifice.
     * @param color La couleur du feu d'artifice.
     * @param isDouble Si le feu d'artifice explose deux fois.
     */
    public Firework(int size, String color, boolean isDouble) {
        this.size = size;
        this.color = color;
        this.isDouble = isDouble;
    }

}

/**
 * La classe BeesFirework représente un type particulier de feux d'artifice,
 * qui se comportent comme un groupe d'abeilles.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
class BeesFirework {

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

/**
 * La classe FireworkShow permet de simuler un spectacle de feux d'artifice.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class FireworkShow {

    /**
     * La taille d'un feu d'artifice hors service.
     */
    public static final int FAILED = 0;

    /**
     * La taille d'un petit feu d'artifice.
     */
    public static final int SMALL = 1;

    /**
     * La taille d'un feu d'artifice moyen.
     */
    public static final int MEDIUM = 2;

    /**
     * La taille d'un grand feu d'artifice.
     */
    public static final int BIG = 3;

    /**
     * Lance un feu d'artifice.
     * 
     * @param firework Le feu d'artifice à lancer.
     */
    static void launchFirework(Firework firework) {
        // On change l'affichage dans la console pour avoir la couleur appropriée.
        if ("RED".equals(firework.color)) {
            System.out.print("\033[0;31m");
            
        } else if ("GREEN".equals(firework.color)) {
            System.out.print("\033[0;32m");
            
        } else if ("BLUE".equals(firework.color)) {
            System.out.print("\033[0;34m");
            
        } else if ("YELLOW".equals(firework.color)) {
            System.out.print("\033[0;33m");
            
        } else {
            System.out.print("\033[0;37m");
        }
        
        // On affiche le feu d'artifice.
        try {
            switch (firework.size) {
                case FAILED:
                    // Ce feu d'artifice est hors service.
                    System.out.print("pschit");
                    break;

                case SMALL:
                    // C'est un petit feu d'artifice.
                    System.out.print("boum !");
                    if (firework.isDouble) System.out.print(" boum !");
                    Thread.sleep(500);
                    break;

                case MEDIUM:
                    // C'est un feu d'artifice moyen.
                    System.out.print("Boouum !!");
                    if (firework.isDouble) System.out.print(" Boouum !!");
                    Thread.sleep(1000);
                    break;

                default:
                    // C'est un grand feu d'artifice.
                    System.out.print("BOOOOUUUUM !!!!");
                    if (firework.isDouble) System.out.print(" BOOOOUUUUM !!!!");
                    Thread.sleep(1500);
                    break;
            }
            
        } catch (InterruptedException e) {
            // Ceci ne doit jamais se produire.
            e.printStackTrace();
        }
       
        // On remet la console dans son état d'origine.
        System.out.println("\033[0m");
    }
    
    /**
     * Démarre le programme.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        ArrayList<Object> fireworks = new ArrayList<Object>();

        fireworks.add(new Firework(FAILED, "RED", true));
        fireworks.add(new Firework(FAILED, "GREEN", true));
        fireworks.add(new Firework(FAILED, "BLUE", true));
        fireworks.add(new Firework(FAILED, "YELLOW", true));
        fireworks.add(new Firework(FAILED, "WHITE", true));
        
        fireworks.add(new Firework(FAILED, "RED", false));
        fireworks.add(new Firework(FAILED, "GREEN", false));
        fireworks.add(new Firework(FAILED, "BLUE", false));
        fireworks.add(new Firework(FAILED, "YELLOW", false));
        fireworks.add(new Firework(FAILED, "WHITE", false));
        
        fireworks.add(new Firework(SMALL, "RED", true));
        fireworks.add(new Firework(SMALL, "GREEN", true));
        fireworks.add(new Firework(SMALL, "BLUE", true));
        fireworks.add(new Firework(SMALL, "YELLOW", true));
        fireworks.add(new Firework(SMALL, "WHITE", true));
        
        fireworks.add(new Firework(SMALL, "RED", false));
        fireworks.add(new Firework(SMALL, "GREEN", false));
        fireworks.add(new Firework(SMALL, "BLUE", false));
        fireworks.add(new Firework(SMALL, "YELLOW", false));
        fireworks.add(new Firework(SMALL, "WHITE", false));
        
        fireworks.add(new Firework(MEDIUM, "RED", true));
        fireworks.add(new Firework(MEDIUM, "GREEN", true));
        fireworks.add(new Firework(MEDIUM, "BLUE", true));
        fireworks.add(new Firework(MEDIUM, "YELLOW", true));
        fireworks.add(new Firework(MEDIUM, "WHITE", true));
        
        fireworks.add(new Firework(MEDIUM, "RED", false));
        fireworks.add(new Firework(MEDIUM, "GREEN", false));
        fireworks.add(new Firework(MEDIUM, "BLUE", false));
        fireworks.add(new Firework(MEDIUM, "YELLOW", false));
        fireworks.add(new Firework(MEDIUM, "WHITE", false));
        
        fireworks.add(new Firework(BIG, "RED", true));
        fireworks.add(new Firework(BIG, "GREEN", true));
        fireworks.add(new Firework(BIG, "BLUE", true));
        fireworks.add(new Firework(BIG, "YELLOW", true));
        fireworks.add(new Firework(BIG, "WHITE", true));
        
        fireworks.add(new Firework(BIG, "RED", false));
        fireworks.add(new Firework(BIG, "GREEN", false));
        fireworks.add(new Firework(BIG, "BLUE", false));
        fireworks.add(new Firework(BIG, "YELLOW", false));
        fireworks.add(new Firework(BIG, "WHITE", false));
        
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());

        Collections.shuffle(fireworks);
        
        for (int i = 0; i < fireworks.size(); i++) {
            Object firework = fireworks.get(i);
            if (firework instanceof Firework) {
                launchFirework((Firework) firework);
            } else {
                System.out.println(((BeesFirework) firework).getBeesExplosionString());
            }
        }
    }

}

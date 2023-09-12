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
class Firework implements LaunchFireWork {

    /**
     * La taille du feu d'artifice.
     */
    ExplosionSize size;

    /**
     * La couleur du feu d'artifice.
     */
    Color color;
    /**
     * Crée une nouvelle instance de Firework.
     *
     * @param size La taille du feu d'artifice.
     * @param color La couleur du feu d'artifice.
     */
    public Firework(ExplosionSize size, Color color) {
        this.size = size;
        this.color = color;
    }
  
    @Override
    public void launchFirework() {
        // On change l'affichage dans la console pour avoir la couleur appropriée.
        switch (this.color) {
            case RED:
                System.out.print("\033[0;31m");
                break;
            case GREEN:
                System.out.print("\033[0;32m");
                break;
            case BLUE:
                System.out.print("\033[0;34m");
                break;
            case YELLOW:
                System.out.print("\033[0;33m");
                break;
            default:
                System.out.print("\033[0;37m");
                break;
        }

        // On affiche le feu d'artifice.
        size.explosionSize();
        // On remet la console dans son état d'origine.
        System.out.println("\033[0m");
    }
}
/**
 * La classe FireworkShow permet de simuler un spectacle de feux d'artifice.
 *
 * @author Romain Wallon
 *
 * @version 0.1.0
 */
public class FireworkShow{
    /**
     * Démarre le programme.
     *
     * @param args Les arguments de la ligne de commande.
     */
    public static void main(String[] args) {
        ArrayList<Object> fireworks = new ArrayList<Object>();

        fireworks.add(new FailedFireworkProxy(new Firework(new FailedExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new FailedExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new FailedExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new FailedExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new FailedExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new FireworkDecorator(new Firework(new FailedExplosion(), Color.RED))));
        fireworks.add(new FailedFireworkProxy(new FireworkDecorator(new Firework(new FailedExplosion(), Color.GREEN))));
        fireworks.add(new FailedFireworkProxy(new FireworkDecorator(new Firework(new FailedExplosion(), Color.BLUE))));
        fireworks.add(new FailedFireworkProxy(new FireworkDecorator(new Firework(new FailedExplosion(), Color.YELLOW))));
        fireworks.add(new FailedFireworkProxy(new FireworkDecorator(new Firework(new FailedExplosion(), Color.WHITE))));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new SmallExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new MediumExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.WHITE)));
        
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.RED)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.GREEN)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.BLUE)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.YELLOW)));
        fireworks.add(new FailedFireworkProxy(new Firework(new BigExplosion(), Color.WHITE)));
        
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());
        fireworks.add(new BeesFirework());

        Collections.shuffle(fireworks);
        
        for (int i = 0; i < fireworks.size(); i++) {
            Object firework = fireworks.get(i);
            if (firework instanceof Firework) {
                ((Firework) firework).launchFirework();
            } else {
                System.out.println(((BeesFirework) firework).getBeesExplosionString());
            }
        }
    }

}
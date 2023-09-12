public class FireworkAdaptater implements LaunchFireWork{

    private static final FireworkAdaptater instance = new FireworkAdaptater();
    private static final BeesFirework beesfirework = new BeesFirework();


    private FireworkAdaptater(){

    }

    public static FireworkAdaptater getInstance(){
        return instance;
    }


    @Override
    public void launchFirework() {
        System.out.println(beesfirework.getBeesExplosionString());
    }
}

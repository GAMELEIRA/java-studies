import models.Tv;

public class App {
    public static void main(String[] args) throws Exception {
        Tv tv = new Tv();
        tv.setTurnOnOrTurnOff();
        tv.changeTopChannel();
        tv.changeTopChannel();
        tv.increaseSound();
        tv.increaseSound();
        tv.turnDownSound();
        tv.changeDownChannel();        
        System.out.println("TV esta ligada? " + tv.getIsOn());
        System.out.println("Canal Atual: " + tv.getChanel());
        System.out.println("Volume Atual: " + tv.getSound());
    }
}

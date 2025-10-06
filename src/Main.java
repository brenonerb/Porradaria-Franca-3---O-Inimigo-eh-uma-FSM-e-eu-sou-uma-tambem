import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Chama os 2 agentes
        Bob bob = new Bob();
        bob.setState(new WatchTV(bob));

        Juca juca = new Juca(bob);
        juca.setState(new Working(juca));

        // Timer baseado nas ações de cada um deles
        while (true) {
            juca.update();
            bob.update();
            try {
                Thread.sleep(3000);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
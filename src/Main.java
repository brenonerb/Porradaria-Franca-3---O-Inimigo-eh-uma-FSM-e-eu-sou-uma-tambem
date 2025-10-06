import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Porradeiro Porradeiro1 = new Porradeiro();
        Porradeiro1.SetupStates(100, 20);
        Porradeiro1.setState(new DoingNothing(Porradeiro1));

        Porradeiro Porradeiro2 = new Porradeiro();
        Porradeiro2.SetupStates(100, 15);
        Porradeiro2.setState(new DoingNothing(Porradeiro2));

        while (true) {
            Porradeiro1.update();
            Porradeiro2.update();

            // Turno de decisão
            Porradeiro1.setState(new ChoosingAction(Porradeiro1, Porradeiro2));
            Porradeiro2.setState(new ChoosingAction(Porradeiro2, Porradeiro1));

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Condição de fim de luta
            if (Porradeiro1.HP <= 0 || Porradeiro2.HP <= 0) {
                System.out.println("Luta acabou!");
                break;
            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Setta o Scanner

        System.out.println("PORRADARIIA FRANCA 3 - O INIMIGO É UMA FSM E EU SOU UMA TAMBÉM");

        Await(1000);

        System.out.println("==================== SETUP DE STATUS ====================");
        // Setup do primeiro porradeiro
        Porradeiro Porradeiro1 = new Porradeiro();

        System.out.println("Insira o nome do primeiro lutador:");
        String Nome1 = scanner.nextLine();

        System.out.println("Agora os status do primeiro lutador:");
        System.out.println("Pontos de vida:");
        int Vida1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Pontos de dano:");
        int Dano1 = Integer.parseInt(scanner.nextLine());
        Porradeiro1.SetupStates(Vida1, Dano1);
        Porradeiro1.setName(Nome1);

        // Setup do segundo porradeiro
        Porradeiro Porradeiro2 = new Porradeiro();

        System.out.println("Insira o nome do segundo lutador:");
        String Nome2 = scanner.nextLine();

        System.out.println("Agora os status do primeiro lutador:");
        System.out.println("Pontos de vida:");
        int Vida2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Pontos de dano:");
        int Dano2 = Integer.parseInt(scanner.nextLine());
        Porradeiro2.SetupStates(Vida2, Dano2);
        Porradeiro2.setName(Nome2);

        System.out.println("SENHORAS E SENHORES, MENINOS, MENINAS E TODO O RESTO...");
        Await(1000);
        System.out.println("QUE A LUTA...");
        Await(1000);
        System.out.println("COMEÇE!");
        Await(1000);

        while (true) {
            // Turno de decisão
            System.out.println("");
            System.out.println("==================== INÍCIO DE TURNO ====================");
            Porradeiro1.setState(new ChoosingAction(Porradeiro1, Porradeiro2));
            Porradeiro2.setState(new ChoosingAction(Porradeiro2, Porradeiro1));

            Await(1000);

            System.out.println("");
            System.out.println("==================== AÇÕES ====================");
            for (int i = 0; i < 2; i++) {
                Porradeiro1.update();
                Porradeiro2.update();
                Await(1000);
            }

            Await(1000);

            System.out.println("");
            System.out.println("==================== FIM DE TURNO ====================");

            // Condição de fim de luta
            if (Porradeiro1.getHP() <= 0 || Porradeiro2.getHP() <= 0) {
                System.out.println("Luta acabou!");
                if (Porradeiro1.getHP() <= 0) System.out.println("O vencedor é " + Porradeiro2.getName() + "!");
                else System.out.println("O vencedor é " + Porradeiro1.getName() + "!");
                break;
            }
            else {
                System.out.println(Porradeiro1.getName() + " está com " + Porradeiro1.getHP() + " pontos de saúde!");
                System.out.println(Porradeiro2.getName() + " está com " + Porradeiro2.getHP() + " pontos de saúde!");
                Await(3000);
            }
        }
    }

    public static void Await(int Time) {
        try {
            Thread.sleep(Time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

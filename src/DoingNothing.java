import java.util.Random;

public class DoingNothing extends AbstractState<Porradeiro> {
    public DoingNothing(Porradeiro character) {
        super(character);
    }

    public void enter() {
        System.out.println(character.getName() + " começou à fazer nada...?");
    }

    public void execute() {
        character.DoNothing();
        Random rand = new Random();
        int choice = rand.nextInt(3); // 0 = Attack, 1 = Block, 2 = DoNothing
        switch (choice) {
            case 0: System.out.println(character.getName() + ": 'Eu estou fazendo nada!'");
            case 1: System.out.println(character.getName() + " está farmando aura!");
            case 2: System.out.println(character.getName() + " provoca o inimigo flexionando os seus músculos! (ou a falta destes!)");
        }

    }

    public void leave() {
        System.out.println(character.getName() + " para de fazer nada!");
    }
}

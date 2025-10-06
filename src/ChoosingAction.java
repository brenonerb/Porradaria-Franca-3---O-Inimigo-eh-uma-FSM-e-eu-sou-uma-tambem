import java.util.Random;

public class ChoosingAction extends AbstractState<Porradeiro> {
    private Porradeiro enemy;

    public ChoosingAction(Porradeiro character, Porradeiro enemy) {
        super(character);
        this.enemy = enemy;
    }

    public void enter() {
        System.out.println(character.getName() + " está decidindo o que fazer...");
    }

    public void execute() {
        Random rand = new Random();
        int choice = rand.nextInt(3); // 0 = Attack, 1 = Block, 2 = DoNothing

        switch (choice) {
            case 0:
                character.setState(new Attacking(character, enemy));
                break;
            case 1:
                character.setState(new Defending(character));
                break;
            default:
                character.setState(new DoingNothing(character));
                break;
        }
    }
    
    public void leave() {
        // nada aqui
    }
}

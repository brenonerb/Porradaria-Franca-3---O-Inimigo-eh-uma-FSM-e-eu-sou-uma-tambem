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
        if (character.getHP() > 0) {
            Random rand = new Random();
            int choice = rand.nextInt(3);

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
        else System.out.println(character.getName() + " foi nocauteado, não consegue decidir o que fazer mais!");

    }

    public void leave() {
        System.out.println(character.getName() + " decidiu!");
    }
}

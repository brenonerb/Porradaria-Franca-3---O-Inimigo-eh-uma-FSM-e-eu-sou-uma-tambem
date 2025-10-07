public class Attacking extends AbstractState<Porradeiro> {
    private Porradeiro target;

    public Attacking(Porradeiro character, Porradeiro target) {
        super(character);
        this.target = target;
    }

    public void enter() {
        System.out.println(character.getName() + " vai bater em " + target.getName() + "!");
    }

    public void execute() {
        System.out.println(character.getName() + " bateu em " + target.getName() + "!");
        character.Attack(target, character.getDamage());
    }

    public void leave() {
        System.out.println(character.getName() + " parou de bater em " + target.getName() + "!");
    }
}

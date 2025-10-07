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
        // oi
    }

    public void leave() {
        character.Attack(target, character.getDamage());
    }
}

public class Attacking extends AbstractState<Porradeiro> {
    private Porradeiro target;

    public Attacking(Porradeiro character, Porradeiro target) {
        super(character);
        this.target = target;
    }

    public void enter() {
        System.out.println(character.getName() + " prepara um ataque!");
    }

    public void execute() {
        character.Attack(target, character.Damage);
        target.TakeDamage(character.Damage);
    }

    public void leave() {
        System.out.println(character.getName() + " termina o ataque!");
    }
}

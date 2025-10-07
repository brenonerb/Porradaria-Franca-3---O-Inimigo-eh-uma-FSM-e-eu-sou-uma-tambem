public class Defending extends AbstractState<Porradeiro> {
    public Defending(Porradeiro character) {
        super(character);
    }

    public void enter() {
        character.Block();
    }

    public void execute() {
        System.out.println(character.getName() + " está defendendo!");
    }

    public void leave() {
        character.Unblock();
    }
}
public class Defending extends AbstractState<Porradeiro> {
    public Defending(Porradeiro character) {
        super(character);
    }

    public void enter() {

        character.Block();
        System.out.println(character.getName() + " está defendendo!");
    }

    public void execute() {
        // nada aqui
    }

    public void leave() {
        character.Unblock();
        System.out.println(character.getName() + " para de se defender, pois o turno acabou!");
    }
}
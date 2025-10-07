public class Defending extends AbstractState<Porradeiro> {
    public Defending(Porradeiro character) {
        super(character);
    }

    public void enter() {
        character.Block();
    }

    public void execute() {
        // Defesa dura só um turno
    }

    public void leave() {
        // Retorna ao estado zero
    }
}
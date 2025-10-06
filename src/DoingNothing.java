public class DoingNothing extends AbstractState<Porradeiro> {
    public DoingNothing(Porradeiro character) {
        super(character);
    }

    public void enter() {
        System.out.println(character.getName() + " começou à fazer nada.");
    }

    public void execute() {
        character.DoNothing();
    }

    public void leave() {
        System.out.println("Fim do turno de " + character.getName() + "!");
    }
}

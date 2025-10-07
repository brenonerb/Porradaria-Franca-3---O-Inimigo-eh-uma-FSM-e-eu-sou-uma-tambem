public class DoingNothing extends AbstractState<Porradeiro> {
    public DoingNothing(Porradeiro character) {
        super(character);
    }

    public void enter() {
        System.out.println(character.getName() + " começou à fazer nada.");
    }

    public void execute() {
        character.DoNothing();
        System.out.println(character.getName() + ": 'Eu estou fazendo nada!'");
    }

    public void leave() {
        System.out.println(character.getName() + ": 'Melhor voltar à luta...'");
    }
}

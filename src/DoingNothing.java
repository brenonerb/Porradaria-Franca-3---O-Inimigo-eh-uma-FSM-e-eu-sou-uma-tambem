public class DoingNothing extends AbstractState<Porradeiro> {
    public DoingNothing(Porradeiro character) {
        super(character);
    }

    public void enter() {
        System.out.println(character.getName() + " começou à fazer nada.");
    }

    public void execute() {
        character.DoNothing();
        System.out.println("Juca está comendo...");
    }

    public void leave() {
        System.out.println("Juca parou de comer. Ele fez uma sujeira!");
    }
}

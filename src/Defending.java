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
        System.out.println(character.getName() + " relaxa a guarda.");
    }
}
public class Defending extends AbstractState<Juca> {
    private Bob bob;
    public Defending(Juca character) {
        super(character);
    }

    public void enter() {
        System.out.println("Juca começou a comer.");
    }

    public void execute() {
        System.out.println("Juca está comendo...");
        character.eat(5);
        character.getBob().eatFood(1);
        if (character.getHunger() <= 0) {
            if (character.getHunger() < 0) character.eat(character.getHunger());
            character.setState(new Working(character));
        }
    }

    public void leave() {
        System.out.println("Juca parou de comer. Ele fez uma sujeira!");
        character.getBob().MakeAMess();
    }
}

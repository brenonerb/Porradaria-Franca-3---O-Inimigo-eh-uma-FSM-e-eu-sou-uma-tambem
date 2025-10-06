import java.util.Random;

public class Porradeiro {
    private String name;
    private int HP = 0;
    private int Damage = 0;
    private boolean Blocking = false;
    private StateMachine<Porradeiro> stateMachine;

    // Setar a state machine
    public Porradeiro() {
        stateMachine = new StateMachine<>();
    }

    public void SetupStates(int vida, int dano) {
        HP = vida;
        Damage = dano;
    }

    // Variáveis que são chamadas
    public String getName() {
        return name;
    }

    // Ações que serão chamadas pelos estados do porradeiro
    public void DoNothing() {
        System.out.println(name + " faz nada durante a luta!");
    }

    public void Attack(Porradeiro target, int damage) {
        // Ação de fato

        // Texto bonitinho
        System.out.println(name + " causa " + damage + " pontos de dano em " + target);
        int RandomPhrase = new Random().nextInt(5);
        switch (RandomPhrase) {
            case 0:
                System.out.println("Receba!");
                break;
            case 1:
                System.out.println("Groovy!");
                break;
            case 2:
                System.out.println("Uma muqueta de direta! Selvagem!");
                break;
            case 3:
                System.out.println("Isso é permitido...?");
                break;
            case 4:
                System.out.println("Uppercut!");
                break;
        }
    }

    public void TakeDamage(int damage) {
        if (HP > damage) {
            if (Blocking) HP -= damage / 2;
            else HP -= damage;
        }
        else HP = 0;
    }

    public void Block() {
        System.out.println(name + " bloqueia, tomando apenas metade do dano!");
        Blocking = true;
    }

    public void FinishTurn() {
        Blocking = false;
        if (HP == 0) {
            System.out.println(name + " foi nocauteado!");
        }
    }

    public void update() {
        stateMachine.update();
        FinishTurn();
        System.out.println(name + " está com " + HP + " pontos de saúde!");
    }

    public void setState(State<Porradeiro> newState) {
        stateMachine.changeState(newState);
    }

}

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

    // Vamos dar um nomezinho pro nosso objeto...
    public void setName(String newName) {
        name = newName;
    }

    // Variáveis que são chamadas
    public String getName() {
        return name;
    }
    public int getDamage() { return Damage; }
    public int getHP() { return HP; }


    // Ações que serão chamadas pelos estados do porradeiro
    public void DoNothing() {
        System.out.println(name + " faz nada durante a luta!");
    }

    public void Attack(Porradeiro target, int damage) {
        System.out.println(name + " estou atacando!");
        // Ação de fato
        target.TakeDamage(damage);

        // Texto bonitinho
        System.out.println(name + " causa " + damage + " pontos de dano em " + target.getName());
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
        System.out.println(name + " está com " + HP + " pontos de saúde!");
        if (HP == 0) {
            System.out.println(name + " foi nocauteado!");
        }
    }

    public void update() {
        stateMachine.update();
        FinishTurn();
    }

    public void setState(State<Porradeiro> newState) {
        stateMachine.changeState(newState);
    }

}

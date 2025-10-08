PORRADARIA FRANCA 3 - O INIMIGO É UMA FSM E EU SOU UMA TAMBÉM

Visão Geral
Porradaria Franca 3 é uma arena de batalha criada para 2 inteligências artificiais caírem na porrada, e então decidir entre elas qual será o vencedor. O usuário pode customizar os 2 lutadores, com nomes e status, antes da batalha começar, e então, duas máquinas de estados finitas lutam até uma delas ser nocauteadas, podendo ter alguma estratégia… ou não! É algo que depende de sorte.

Agente e suas variáveis
Os dois componentes são o PORRADEIRO, um lutador que possui um string de nome, duas ints de status (vida e dano), e uma boolean de Blocking. Os agentes começam no estado de escolher ação (ChoosingAction), onde eles vão decidir aleatoriamente entre 3 ações:
- Fazer nada (DoingNothing): Autoexplicativo
- Atacar (Attacking): Causa dano ao Porradeiro adversário baseado no status de dano, podendo este ser dividido por 2 se o adversário estiver bloqueando
- Defender (Defending): Como explicado acima, evita metade do dano adversário

Como Rodar
Basta rodar o arquivo Main.java para começar.

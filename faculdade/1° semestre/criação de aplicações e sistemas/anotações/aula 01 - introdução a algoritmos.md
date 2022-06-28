# introdução a algoritmos
## introdução
- passos necessários para resolver um problema:
    1. conhecer as regras (o que pode e o que não pode);
    2. entender o problema proposto (conhecer bem cada detalhe);
    3. indicar o que deve ser feito e em que ordem (ter uma sequência e uma ordem lógica);
    4. executar a sequência de passos e verificar se estes passos realmente resolvem o problema proposto.
- *exemplo: atravessar a rua*
    - regras para atravessar a rua: passar de uma calçada para a outra sem atropelado;
    - sequência de ações para resolver o problema:
        1. olhar para a esquerda;
        2. olhar para a direita;
        3. se estiver vindo algum carro - espere;
        4. repita os passos 1 e 2;
        5. se não estiver vindo carro - atravesse.
## algoritmos
- é uma sequência de instruções que resolve determinado problema;
    - uma receita de bolo pode ser considerada um algoritmo.
### lógica
- ciência dos princípios formais do raciocínio;
- é muito importante no desenvolvimento de algoritmos;
- presente em diversas áreas da computação;
- **lógica de programação**: conjunto de raciocínios utilizados para criar um algoritmo;
- **algoritmo**: sequência de passos para resolver um determinado problema;
- **programa**: algoritmo escrito em uma linguagem de programação específica;
    - algoritmo que pode ser executado em um computador.
### formas de representar algoritmos 
#### descrição narrativa 
- forma de linguagem natural;
- é pouco usada na prática porque dá margem para interpretações erradas;
- *exemplo*: atravessar uma rua.
#### fluxograma
- representação gráfica do algoritmo;
- formas geométricas diferentes mostram ações distintas;
- o objetivo é facilitar o entendimento de uma ideia.
#### diagrama de Chapin
- criado por Ned Chapin a partir de trabalhos de Nassi-Shneiderman;
- ideia de substituir o fluxograma;
- representa a visão hierárquica e estruturada da lógica e um programa;
- torna-se mais simples de codificá-lo futuramente em pseudocódigo.
#### pseudocódigo
- também conhecido como português estruturado ou portugol;
- ponto intermediário entre o entendimento humano e de uma linguagem de programação;
- pode ser facilmente traduzido para uma linguagem de programação.
~~~~portugol
algoritmo media
var n1, n2, media: real
inicio
    leia n1, n2
    media (n1 + n2)/2
    se media >= então
        escreva "aprovado"
    se não
        escreva "reprovado"
    fim
fimdoalgoritmo
~~~~
## exemplos
- faça um algoritmo para mostrar seu nome na tela:
~~~~portugol
algoritmo "nome"

var
//seção de declarações dos variáveis

inicio

//seção de comandos, procedimento, funções, operadores, etc.
escreva ("Débora")

fimalgoritmo
~~~~
# algoritmos
## *conceitos básicos*
### <ins>*o que é um algoritmo?*</ins>
- é uma série ordenada de passos não ambíguos, executáveis;
- é uma sequência de instruções ou comandos realizados de maneira sistemática com o objetivo de resolver um problema ou executar um tarefa

****************************************algoritmos clássicos****************************************

- cubo mágico
- torre de hanoi

**************************************************************o que estudamos com algoritmos?**************************************************************

- execução
- comunicação
- representação
- delineamento
- análise
- limitações

*******exemplo*******: troca de lâmpada

1. pegar uma escada
2. posicionar a escada embaixo da lâmpada
3. buscar uma lâmpada nova
4. subir na escada
5. retirar a lâmpada velha
6. colocar a lâmpada

****************************************como representar os algoritmos?****************************************

*******************narração descritiva*******************: consiste em escrever um texto simples, uma narrativa do que deve ser realizado para que o problema proposto seja solucionado

- pouco utilizada pois pode ser aberta a várias interpretações, é bastante suscetível a erros:
    1. pare o carro (… desligo o motor?)
    2. abra a porta (… qual?)
    3. retire o estepe (… estava onde?)

*******exemplo*******: criar uma rotina para receber login e senha do usuário em um sistema

1. apresentar tela de login
2. usuário digita o login
3. usuário digita a senha
4. se login e senha corretos, usuário acessa sistema

**********fluxograma**********: utiliza-se de gráficos para representar os passos que devem ser executados pelo algoritmo

- hoje são utilizados para representações específicas ou modelagens
- esta representação pode se tornar muito trabalhosa para algoritmos complexos

*******exemplo*******:

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f2c21b32-5efe-493e-807f-6d8893e8d883/Untitled.png)

************pseudocódigo************: utiliza formatação e regras que se assemelham a da maioria das linguagens de programação

- o portugol é uma das mais conhecidas e utiliza palavras em português como comandos de linguagem

*******exemplo*******: 

```visual-basic
// declaração de variáveis
real: N1, N2, N3, N4 // notas bimestrais
	MA; //média anual

// entrada de dados
leia (N1, N2, N3, N4);

// processamento
MA <- (N1 + N2 + N3 + N4)/4;

//saída de dados
```

---

### *********************diferentes estruturas*********************

**********************************************************como funcionam as estruturas?**********************************************************

- em um algoritmo ou mesmo um programa de computador, são várias as estruturas que utilizamos para controlar o fluxo de execução dos comandos e funções
- essas estruturas determinam o que será executado, como e quando será executado

**********************se <> então … senão**********************: é uma estrutura de seleção comum em diversas linguagens

- utiliza-se de expressões booleanas (do tipo lógica verdadeiro/falso) para desviar a execução do código para um determinado fluxo ou outro, dependendo  do valor avaliado ser verdadeiro ou falso

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/d1bccc4b-4af9-4bf8-979a-a80f38ad03b6/Untitled.png)

******para (número de repetições pré-definido)******:

```visual-basic
para j <- valor inicial até valor final faça
	início
		comando1;
		comando2;
	fim
```

********enquanto********: esta estrutura repete uma sequência de comandos enquanto uma determinada condição, expressão lógica, for satisfeita

- esta expressão que é avaliada antes de cada repetição do laço
- quando seu resultado for verdadeiro, <sequência-de-comandos> é executada

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b6d51487-4514-4bc8-a77e-d66e4795c3b0/Untitled.png)

******repita******: é utilizada quando um conjunto de comandos deve ser executado repetidamente, até que uma condição (expressão lógica) seja verdadeira

- os comandos do laço são executados pelo menos uma vez

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/55224840-84c9-435c-be84-1602841d58a8/Untitled.png)

---

### ******eficiência dos algoritmos******

******************************************algoritmos eficientes******************************************

- a análise de algoritmo fornece uma medida objetiva de desempenho proporcional ao tempo de execução do algoritmo
    1. facilidade de compreensão, codificação e depuração
    2. eficiência na utilização dos recursos do computador e rapidez, através de seu tempo de execução

************************busca sequencial************************

- é um algoritmo pouco eficiente para encontrar um item em uma lista grande de elementos
    - no pior caso, todos os elementos devem ser visitados

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6bdb717d-51a0-4072-b111-7490414f6455/Untitled.png)

****************************busca binária****************************

- é um eficiente algoritmo para encontrar um item em uma lista ordenada de itens
    - ela funciona dividindo repetidamente pela metade a porção da lista que deve conter o item, até reduzir as localizações possíveis a apenas uma
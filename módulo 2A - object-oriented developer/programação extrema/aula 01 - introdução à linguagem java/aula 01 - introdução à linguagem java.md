# introdução à linguagem de programação java
## *por que java?*
- base para aprender qualquer outra linguagem;
- linguagem mais utilizada;
- java é multiplataforma;
- baseada no desenvolvimento no paradigma orientado a objetos;
- oportunidade de emprego;
- composta por três pilares:
  - a máquina virtual java (JVM);
  - um completo conjunto de APIs (bibliotecas);
  - a linguagem java.
- está presente nos principais sistemas operacionais existentes, entre eles: windows, linux, unix, mac e solaris;
- é uma tecnologia independente de sistema operacional e hardware;
- é arquitetonicamente neutro, o que significa que você pode usar o Java para escrever um programa que será executado em qualquer plataforma ou dispositivo (sistema operacional);
- o programa java pode ser executado em uma ampla variedade de computadores porque não executa instruções diretamente no computador;
  - é executado em uma java virtual machine (JVM).

### <ins>*como acontece a mágica?*</ins>
- criar código java (você pode usar qualquer editor de texto ou IDE para fazer isso);
- compilar código java (pode ser feito por linha de comando ou a própria IDE faz isso);
- leitura do código java (isso feito pela JVM com base na JRE). 

### <ins>*terminologias usadas*</ins>
***JDK (java development kit)***: contém o JRE, juntamente com várias ferramentas de desenvolvimento, como bibliotecas, compiladores, depuradores, ferramentas de empacotamento e implementação;

***JRE (java runtime environment)***: faz parte do JDK, mas pode ser usado independentemente para executar qualquer código de bytes (programa java compilado);

***JVM (java virtual machine)***: é um software que pode ser portado para várias plataformas de hardware;
- se tornará uma instância do JRE no tempo de execução do programa java;
- os códigos de bytes são o idioma da máquina para a JVM;
- possui um conjunto de instruções que manipula várias áreas da memória em tempo de execução; 
- para diferentes plataformas de hardware, corresponde à implementação da JVM disponível como JREs fornecidos pelo fornecedor.

***API java (application programming interface)***: conjunto de classes escritas usando java que é executada na JVM;
- essas classes ajudarão os programadores, fornecendo métodos padrão, como ler no console, gravar no console, salvar objetos na estrutura de dados etc.

### <ins>*vantagens da linguagem de programação java*</ins>
- suporte interno para multithreading, comunicação de soquete e gerenciamento de memória (coleta automática de lixo);
- orientada a objetos;
- suporte a aplicativos baseados na web (applet, servlet e JSP), aplicativos distribuídos (soquetes, RMI, EJB etc.) e protocolos de rede (HTTP, JRMP etc.) com a ajuda de extensas APIs padronizadas (application programming interfaces).

## *estrutura da classe java*
### <ins>*estrutura do programa java*</ins>
```java
package br.com.java.aula;
public class helloWorld {
    /* comentários */
    public static void main(String[] args){
        // comentário: imprimindo resultados no console
        System.out.println("oi mundo!");
    }
}
```

***pacote br.com.java.aula***: é uma declaração de pacote;
- a instrução package define um espaço para nome no qual as classes são armazenadas;
- o pacote é usado para organizar as classes com base na funcionalidade;
- se você omitir a instrução do pacote, os nomes das classes serão colocados no pacote padrão, que não tem nome;
- a declaração do pacote não pode aparecer em nenhum lugar do programa;
- deve ser a primeira linha do seu programa ou você pode omiti-lo.

***public class helloWorld***: o public é a palavra-chave modificadora de acesso que informa o acesso do compilador à classe;
- vários valores de modificadores de acesso podem ser públicos, protegidos, privados ou padrão (sem valor);
- o class é a palavra-chave usada para declarar uma classe;
- o nome da classe (helloWorld) seguido por esta palavra-chave.

***public static void main (String [] args)***: é o seu método (função) chamando main com array de strings como argumento;
- public é o modificador de acesso;
- static é uma palavra-chave reservada, o que significa que um método é acessível e utilizável, mesmo que não exista nenhum objeto da classe;
- void é a palavra-chave declara que nada seria retornado do método;
  - o método pode retornar qualquer primitivo ou objeto.

***System.out.println("oi mundo!")***: System é o nome da classe de utilitários java;
- out é um objeto que pertence à classe System;
- println é o nome do método utilitário que é usado para enviar qualquer String para o console;
- "oi mundo!" é a String definido como argumento para o método println.

## *diretrizes de programação*
- os identificadores Java devem começar com uma letra, um caractere de moeda ($) ou um caractere de conexão, como o sublinhado (_);
- não podem começar com um número;
- após o primeiro caractere, os identificadores podem conter qualquer combinação de letras, caracteres monetários, caracteres de conexão ou números;
```java
int variavel1 = 10; // isso é válido
int 4var = 10; // isso é inválido, o identificador não pode começar com um dígito
```

- identificadores, nomes de métodos e nomes de classes diferenciam maiúsculas de minúsculas;
- você não pode usar palavras-chave java como identificadores:

|          |           |         |              |          |           |
|----------|-----------|---------|--------------|----------|-----------|
| abstract | boolean   | break   | byte         | case     | catch     |
| char     | class     | const   | continue     | default  | do        |
| double   | clse      | extends | final        | finally  | float     |
| for      | goto      | if      | implements   | import   | intanceof |
| int      | interface | long    | native       | new      | package   |
| private  | protected | public  | return       | short    | static    |
| strictfp | super     | switch  | synchronized | this     | throw     |
| throws   | transient | try     | void         | volatile | while     |
| assert   | enum      |         |              |          |           |

- para classes e interfaces a primeira letra deve ser maiúscula e, se várias palavras estiverem vinculadas para formar o nome, a primeira letra das palavras internas deverá estar em maiúsculas;
- para os métodos a primeira letra deve estar em minúscula e, em seguida, devem ser usadas camelCase:
  - getBalance;
  - doCalculation;
  - setCustomerName.

- para as variáveis o formato camelCase deve ser usado, começando com uma letra minúscula:
  - buttonWidth;
  - saldoDaConta;
  - empName.

- para definir uma constante é criada uma variável ​​estática e final;
- devem ser nomeadas usando letras maiúsculas com caracteres sublinhados como separadores:
  - MIN_HEIGHT.

## *tipos de dados primitivos*
***inteiros***: esse grupo inclui byte, short, int e long que são para números assinados com valor inteiro;

***números de pontos flutuante***: esse grupo inclui float e double, que representam números com precisão fracionária;

***caracteres***: esse grupo inclui caracteres (char), que representam símbolos em um conjunto de caracteres, como letras e números;

***booleano***: este grupo inclui booleano (boolean), que é um tipo especial para representar valores verdadeiros ou falsos.

- é bom escolher o tipo primitivo certo para economizar memória já que as variáveis ​​alocam espaço na memória do computador;
```java
int intVariavel = 24; // usa 32 bits de memória
long longVariavel = 24L; // usa 64 bits de memória
byte byteVariavel = 24; // usa 8 bits de memória
```

***byte***: o menor tipo inteiro é byte;
- tem um valor mínimo de -128 e um valor máximo de 127;
- pode ser útil para economizar memória em matrizes grandes, onde a economia de memória realmente importa;
- as variáveis ​​de bytes são declaradas pelo uso da palavra-chave byte:

```java
byte b = 100;
```

***short***: é um inteiro de complemento de dois de 16 bits e assinado;
- tem um valor mínimo de -32.768 e um valor máximo de 32.767;
- também economiza memória em matrizes grandes, em situações em que a economia de memória realmente importa:

```java
short s = 123;
```

***int***: tipo inteiro mais comumente usado;
- é assinado de 32 bits que tem um intervalo de –2.147.483.648 a 2.147.483.647;
- são comumente empregadas para controlar loops e indexar matrizes;
- provavelmente será grande o suficiente para os números que seu programa usará, mas se você precisar de um intervalo maior de valores, use long:

```java
int v = 123543;
int calc = -9876345;
```

***long***: é um tipo assinado de 64 bits e é útil para aquelas ocasiões em que um tipo int não é grande o suficiente para armazenar o valor desejado;
- possui um valor mínimo de -9.223.372.036.854.775.808 e um valor máximo de 9.223.372.036.854.775.807;
- o uso desse tipo de dados pode estar no aplicativo bancário quando uma quantidade grande deve ser calculada e armazenada:

```java
long longVal = 1234567891;
```

***float***: são usados ​​ao avaliar expressões que requerem precisão fracionária;
- especifica um valor de precisão único que usa 32 bits de armazenamento;
- a precisão única é mais rápida em alguns processadores e ocupa metade do espaço da precisão dupla:

```java
float taxaJuros = 12.25f;
```

***double***: usa 64 bits para armazenar um valor;
- é realmente mais rápida do que a precisão única em alguns processadores modernos que foram otimizados para cálculos matemáticos de alta velocidade;
- todas as funções matemáticas transcendentais, como sin (), cos () e sqrt (), retornam valores duplos:

```java
double duplo = 12345.234d;
```

***boolean***: possui apenas dois valores possíveis (verdadeiro e falso);
- é o tipo retornado por todos os operadores relacionais, como no caso de a < b;
- também é o tipo exigido pelas expressões condicionais que governam as instruções de controle, como if ou while:

```java
boolean val = false;
```

***caracteres***: é um único caractere unicode de 16 bits;
- tem um valor mínimo de ‘\ u0000’ (ou 0) e um valor máximo de ‘\ uffff’;
- não há caracteres negativos:

```java
char ch1 = 88; // código para x
char ch2 = 'Y';
```
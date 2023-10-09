# distribuições de probabilidade
## *o que é probabilidade?*
### <ins>*definição de probabilidade*</ins>
- é um ramo da matemática que estuda eventos ou fenômenos aleatórios;
- cuja preocupação está na medição e quantificação da incerteza ou aleatoriedade.

#### <ins>*exemplos de probabilidade*</ins>
- qual a chance de sair "coroa" no lançamento de uma moeda?
- qual a probabilidade de um ativo ter um retorno de 10% no intervalo de um ano?

### <ins>*elementos fundamentais*</ins>
#### <ins>*o que precisamos levar em consideração?*</ins>
***eventos***: definir os resultados possíveis;

***repetições***:estabelecer a frequência de testes;

***experimento***: garantir que o processo seja "honesto".

### <ins>*distribuições de probabilidade*</ins>
#### <ins>*quais as principais?*</ins>
***normal***: a mais utilizada de todas as distribuições;

***binomial***: em situações com dois resultados possíveis;

***multinomial***: extensão da distribuição binomial;

***poisson***: muito utilizada em "processos de chegada";

***exponencial negativa***: muito utilizada em "processos de saída".

### <ins>*utilidade das distribuições*</ins>
#### <ins>*para que precisamos?*</ins>
- compreensão dos dados;
- conhecimento.

## *espaço amostral, amostra e eventos*
### <ins>*o espaço amostral*</ins>
#### <ins>*conjunto dos resultados possíveis*</ins>
***espaço amostral do lançamento de uma moeda***: $\\{'cara', 'coroa'\\}$;

***espaço amostral do lançamento de um dado***: $\\{1, 2, 3, 4, 5, 6\\}$.

### <ins>*amostra*</ins>
#### <ins>*conjunto do espaço amostral associado a uma origem*</ins>
***coleta de dados com quantidade de falhas de equipamentos por fabricante***:
| fabricante | quantidade de falhas |
|------------|----------------------|
| 1          | 10                   |
| 2          | 15                   |
| 3          | 5                    |
| 4          | 7                    |

### <ins>*eventos*</ins>
#### <ins>*subconjunto do espaço amostral*</ins>
***resultado possível do lançamento de uma moeda***: $\\{'cara'\\}$;

<<<<<<< HEAD
***resultados possíveis do lançamento de um dado***: ${1, 3, 5} \ números \ ímpares$.
=======
***resultados possíveis do lançamento de um dado***: $\\{1, 3, 5\\} \ números \ ímpares$.
>>>>>>> de21a28c2fffeb732bfde3954c837051a683cc5c

### <ins>*a importância das definições*</ins>
#### <ins>*como tomar decisões sem saber o que se quer medir?*</ins>
- é fundamental estabelecer desde o início do processo de análise o que queremos obter e definir os conjuntos e etapas que vão nos guiar.

## *variáveis aleatórias: contínuas e discretas*
### <ins>*variável aleatória*</ins>
#### <ins>*variável cujos valores possíveis dependem do resultado de um experimento probabilístico*</ins>
***discretas***: pode assumir valores finitos ou contáveis;

***contínuas***: pode assumir qualquer valor dentro de um intervalo.

### <ins>*variável aleatória discreta*</ins>
#### <ins>*variáveis que podem assumir valores finitos ou contáveis*</ins>
***lançamento de uma moeda***: qual o número de vezes que apareceu uma face "cara"?;

***lançamento de um dado***: qual o número de vezes que apareceu um número "ímpar"?.

### <ins>*variável aleatória contínua*</ins>
#### <ins>*podem assumir qualquer valor dentro de um determinado intervalo*</ins>
***estudo de fenômenos naturais***: qual o índice pluviométrico de uma determinada região?;

***estudo de confiabilidade de equipamentos***: qual a vida média dos motores dos caminhos de um determinado fabricante?.

### <ins>*a importância das variáveis aleatórias*</ins>
#### <ins>*qual o primeiro passo para melhorarmos um processo?*</ins>
- desenvolver métodos de medição;
- neste sentido, as variáveis aleatórias são um importante instrumento para alcançarmos esse objetivo.

## *exemplo prático de distribuições de probabilidade*
### <ins>*a distribuição binomial*</ins>
- fórmula para a função de probabilidade binomial dada por:
$P(x;p;n)=(\frac{n}{x})p^x(1-p)^{(n-x)},\ sendo \ que \ x \in \\{0,...,n\\}$

- sendo que:
$(\frac{n}{x})= \frac{n!}{x!(n-x)!}$

- a distribuição binomial é usada para obter a probabilidade de observar:
  - $x$ sucessos em $n$ tentativas, com a probabilidade de sucesso em uma única tentativa dada por $p$.

### <ins>*exemplo conceitual*</ins>
- vamos supor que queiramos saber a probabilidade específica de que o lado "cara" aparecerá exatamente 10 vezes depois de 20 lançamentos de moeda;
- temos que calcular a expressão dada por: 
$P(10;0,5;20)=(\frac{20}{10}) 0,5^{10}(1-0,5)^{(20-10)}$

- ao calcular a expressão, obtemos que:
$P(10;0,5;20)=0,176$

### <ins>*exemplo no python*</ins>
````python
import matplotlib.pyplot as plt
import numpy as np
from scipy.stats import binom

n = 20
p = 0.5
x = np.arange(0, n + 1)
binomial = binom.pmf(k = x, n = n, p = p)

plt.bar(x, binomial)
plt.xlabel("x", 
  fontsize = 12)
plt.ylabel("probabilidade", 
  fontsize = 12)
plt.xlim([-1, n + 1])
plt.title("distribuição binomial, n = {0}, p = {1}".format(n, p), 
  fontsize = 15)
plt.show()
````

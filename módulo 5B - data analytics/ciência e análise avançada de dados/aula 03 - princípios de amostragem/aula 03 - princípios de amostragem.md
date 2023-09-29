# princípios de amostragem
## *o que é amostragem?*
### <ins>*definição de amostragem*</ins>
- é um instrumento que utilizamos para selecionar um subconjunto dos dados de uma população (amostra) de tal forma que sejam representativos;
- ao analisarmos uma amostra, podemos constatar as características de toda a população.

#### <ins>*exemplo de amostragem*</ins>
***qual a análise de sentimentos das pessoas sobre um filme?***: quais são os fatores que podem influenciar na opinião das pessoas?;

***quais são as intenções de votos dos eleitores em um determinado político?***: como o processo de coleta de dados foi realizado?.

### <ins>*princípios de amostragem*</ins>
#### <ins>*tentativas de representar comportamentos*</ins>
***regularidade estatística***: seleção de muitos itens de forma aleatória;

***lei dos grandes números***: seleção de grandes amostras.

### <ins>*consequências práticas*</ins>
***boas consequências***: aumentar as chances de sucesso de uma estratégia de investimentos;
- aumentar engajamento de um determinado público.

***más consequências***: tomar decisões erradas;
- não priorizar ações preventivas.

### <ins>*utilidade da amostragem*</ins>
#### <ins>*para quê precisamos da amostragem prática?*</ins>
- para fazermos inferências sobre os dados de uma população a partir de um subconjunto relevante.

## *tipos de amostras*
### <ins>*distribuição amostral da média*</ins>
- é o tipo mais comum de distribuição amostral;
- é focada no cálculo da média de cada grupo de amostra que escolhemos dentro da população;
- por fim, precisamos exibir essas médias em um gráfico do tipo histograma.

### <ins>*distribuição amostral de proporção*</ins>
- tem foco no cálculo das proporções de uma população;
- selecionamos uma amostra e calculamos suas proporções;
- por fim, as médias das proporções da amostra de cada grupo representam a proporção de toda a população.

### <ins>*distribuição T*</ins>
- é uma distribuição amostral que envolve uma população pequena ou sobre a qual não sabemos muito sobre ela;
- nós a utilizamos para estimar a média da população e outras estatísticas, como intervalos de confiança, diferenças estatísticas e regressão linear;
- a fórmula para o t-score é: $t=\frac{x-\mu}{\frac{s}{\sqrt{n}}}$
- onde $x$ é a média da amostra, $\mu$ é a média da população e $s$ significa desvio padrão.

### <ins>*a importância dos tipos de distribuições*</ins>
#### <ins>*por que existem tantos tipos de distribuições?*</ins>
- pois cada uma delas é mais útil em um determinado contexto.

## *distribuições amostrais*
### <ins>*histogramas*</ins>
- um histograma é uma representação gráfica da distribuição de dados numéricos.

### <ins>*um exemplo para analisarmos*</ins>
***cenário***: uma grande quantidade de mudas de árvores da mesma espécie é entregue para serem plantadas;

***expectativa***: é que produzam frutos no mesmo período;

***pergunta***: como podemos garantir que alcancemos o resultado esperado?;

- podemos analisar uma distribuição amostral através da seleção de diversos grupos de amostras e calcular as suas respectivas médias.

### <ins>*a importância das distribuições amostrais*</ins>
#### <ins>*como podemos fazer inferências sobre uma população?*</ins>
- através do estudo das distribuições amostrais;
- assim, maximizamos o uso dos recursos financeiros, mão-de-obra e qualidade dos resultados.

## *exemplo prático de amostragem*
### <ins>*princípios de amostragem*</ins>
````python
import numpy as np
import matplotlib.pyplot as plt
%matplotlib inline

# geração de dados da população
tamanho_populacao = 10000
np.random.seed(2006)
dados_populacao = np.random.normal(loc =100, scale = 10, size = tamanho_populacao)

plt.hist(dados_populacao);
plt.xlabel("altura da árvore");
plt.ylabel("quantidade de árvores");
````

### <ins>*amostragem*</ins>
````python
tamanho_amostra = 50
qtd_simulacoes = 10
medias_amostras = []

for x in range (qtd_simulacoes):
  media_amostra = np.random.choice(dados_populacao, size = tamanho_amostra).mean()
  medias_amostras.append(media_amostra)
medias_amostras = np.array(medias_amostras)
````

### <ins>*gráfico*</ins>
````python
plt.hist(x = medias_amostras, bins = 'auto', color = '#0705ba', alpha = 0.7, rwidth = 0.85, density = True)
plt.grid(axis = 'y', alpha = 0.80)
plt.xlabel("médias das alturas das amostras")
plt.ylabel("frequência de ocorrência")
plt.title("histograma das médias das amostras")
````
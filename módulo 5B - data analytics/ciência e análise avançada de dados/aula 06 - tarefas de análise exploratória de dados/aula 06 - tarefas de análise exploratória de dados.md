# tarefas de análise exploratória de dados
## *o que é análise exploratória dos dados?*
### <ins>*conceitos sobre AED*</ins>
- a análise exploratória de dados faz análise e resumo dos conjuntos de dados com o objetivo de descobrir padrões, relacionamentos e anomalias;
- também tem o objetivo de obter uma compreensão dos dados através da visualização, descrição e resumo das principais características deles deles.

### <ins>*algumas funções estatísticas da AED*</ins>
- técnicas de redução de dimensão;
- visualizações de dados com estatísticas resumidas;
- agrupamento de dados;
- modelos preditivos para estimar resultados.

### <ins>*etapas da AED*</ins>
- preparar os dados; 
- visualizar os dados através de gráficos;
- tentar identificar padrões relevantes nos gráficos;
- buscar por identificar situações atípicas (outliers);
- identificar, caso existam, dados ausentes;
- buscar por características interessantes.

## *reduzir dimensões*
### <ins>*conceitos sobre a redução de dimensões*</ins>
- a redução de dimensionalidade significa diminuir o número de características ou variáveis em um conjunto de dados;
- o objetivo é focar nas informações mais importantes.

### <ins>*principais abordagens*</ins>
***seleção de características***: devemos selecionar um subconjunto das características originais mais relevantes para a análise;

***extração de características***: ela transforma as características originais em um conjunto menor de novas características;
- essas novas características capturam as informações importantes sobre a forma como os dados se relacionam.

### <ins>*algumas utilidades práticas*</ins>
- visualizar dados de alta dimensão em duas ou três dimensões;
- identificar características importantes que contribuem para a variação nos dados;
- reduzir o ruído nos dados removendo características irrelevantes;
- organizar os dados de modo que possam ser úteis no desenvolvimento de modelos para análise posterior.

## *metodologias de construção de indicadores*
### <ins>*conceitos sobre os indicadores*</ins>
- os indicadores representam uma medida de um processo a partir de dados existentes em relação a uma determinada área de interesse;
- na AED, a construção de indicadores é útil para identificar padrões e relacionamentos nos dados que não são trivialmente aparentes.

### <ins>*etapas para a construção de indicadores*</ins>
- estabelecer o foco do que queremos medir;
- identificar as fontes de dados relevantes;
- desenvolver os indicadores que se encaixam no foco que queremos alcançar com base nos dados que temos;
- avaliar os indicadores;
- aperfeiçoar e remover indicadores;
- aplicar os indicadores para produzir análises detalhadas.

## *exemplo prático de AED*
### <ins>*descrição do cenário*</ins>
- vamos estudar os dados do naufrágio do návio titanic através de um programa em python;
- os dados estão disponíveis em: https://web.stanford.edu/class/archive/cs/cs109/cs109.1166/stuff/titanic.csv

### <ins>*carregar dados - desastre do titanic*</ins>
```python
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

url='https://web.stanford.edu/class/archive/cs/cs109/cs109.1166/stuff/titanic.csv'
df = pd.read_csv(url)
df.head()
```

### <ins>*análise exploratória inicial*</ins>
```python
df.describe().round(1)
```

### <ins>*remover dados faltantes*</ins>
```python
df = df.dropna()
```

### <ins>*visualização dos sobreviventes*</ins>
```python
plt.hist(df[‘Sex’]);
plt.xlabel(“categorias”)
plt.ylabel(“quantidade”)
plt.hist(x=df[‘Sex’],
         bins=‘auto’,
         color=‘#0867aa’,
         alpha=0.7, 
         rwidth=0.35,
         density=True)
plt.grid(axis=‘y’,
         alpha=0.80)
plt.xlabel(‘categorias’)
plt.ylabel(‘quantidade’)
plt.title(‘histograma de pessoas sobreviventes’)
```
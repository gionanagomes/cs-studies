# técnicas de agrupamento
## *o que são agrupamentos?*
### <ins>*conceitos sobre agrupamentos*</ins>
- os algoritmos de agrupamentos são técnicas de aprendizados de máquina não supervisionadas que agrupam objetos ou pontos de dados semelhantes em clusters;
- o objetivo do agrupamento é encontrar padrões nos dados sem conhecimento prévio de quaisquer rótulos ou categorias.

### <ins>*métodos de agrupamentos*</ins>
***k-means***: os elementos são separados em grupos (clusters);

***hierárquicos***: utiliza uma hierarquia de clusters combinando repetidamente clusters menores com base em sua similaridade.

## *algoritmos de distâncias e ligamentos*
- utilizam uma medida de semelhança para agrupar os elementos em grupos;
- as distâncias mais comuns são:
  - euclidiana;
  - de manhattan.

### <ins>*distância euclidiana*</ins>
- é a medida de distância mais comum usada em nos algoritmos de agrupamento:
- 
$d(x,y)= \sqrt{\sum_{i=1}^{n}(x_i-y_i)^2}$

- por exemplo, vamos supor que $x=[1,2,3]$ e $y=[8,2,3]$ então, temos:

$d(x,y)=\sqrt{(1-8)^2+(2-2)^2+(3-3)^2}=\sqrt{(-7)^2+(0)^2+(0)^2}=7$

### <ins>*distância de manhattan*</ins>
- calcula a distância entre dois pontos somando as diferenças absolutas entre suas coordenadas:

$d(x,y)=\sum^{n}_{i=1}(|x_i-y_i|)$

- temos que:

$d(x,y)=|1-8|+|2-2|+|3-3|=|-7|=7$

## *o método k-means*
- o algoritmo vai tentar produzir “k” grupos (clusters) utilizando uma medida de distância;
- possui os seguintes passos:
  - escolher a quantidade k de clusters e gerar um agrupamento aleatório dos elementos entre esses grupos;
  - associar cada ponto de dados ao centro do cluster mais próximo com base na distância euclidiana entre o ponto de dados e o centro do cluster;
  - procurar a que centros os pontos estão mais próximos;
  - repetir as etapas 2 e 3 até que estejamos satisfeitos com os resultados dos grupos.

```python
from sklearn.cluster import KMeans
import numpy as np

x = [6, 5, 4, 5, 11, 9, 10, 6, 
     4, 3, 11, 14 , 6, 10, 12]
y = [21, 20, 19, 24, 22, 17, 
     23, 16, 23, 25, 25, 24, 22, 21, 21]
dados = list(zip(x, y))
kmeans = KMeans(n_clusters=3, 
                random_state=0)
kmeans.fit(dados)

plt.xlabel(‘x’)
plt.ylabel(‘y’)
plt.title(“kmeans com 3 clusters”)
plt.scatter(x, y, c=kmeans.labels_)
plt.show()
```

## introdução ao algoritmo expectation-maximization
- é um método iterativo que tem como objetivo estimar a distribuição de probabilidade dos dados e usar essa estimativa para distribuir os dados para diferentes clusters;
- o algoritmo segue as seguintes etapas:
  - etapa de expectativa (através dos dados disponíveis observados do conjunto de dados, devemos estimar os valores dos dados ausentes);
  - etapa de maximização (os dados completos gerados após a etapa de expectativa são usados para atualizar os parâmetros);
  - repetir os passos até que estejamos satisfeitos com o resultado.

```python
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from pandas import DataFrame
from sklearn import datasets
from sklearn.sixture import GaussianMixture

iris = datasets.load_iris()
X = iris.data[:, :2]
d = pd.DataFrame(X)
plt.scatter(d[0], d[1])

gmm = GaussianMixture(n_components = 3)
gmm.fit(d)
labels = gmm.predict(d)
d['labels'] = labels
d0 = d[d['labels']== 0]
d1 = d[d['labels']== 1]
d2 = d[d['labels']== 2]
plt.scatter(d0[0], d0[1], c = 'r')
plt.scatter(d1[0], d1[1], c = 'yellow')
plt.scatter(d2[0], d2[1], c = 'g')
```
# teste de hipóteses
## *conceitos básicos*
### <ins>*definição de teste de hipóteses*</ins>
- é uma técnica de estatística na qual testamos uma suposição em relação a um parâmetro populacional;
- o principal motivo de utilizarmos o teste de hipótese é devido à inviabilidade de analisar grandes volumes de dados.

### <ins>*alguns exemplos*</ins>
- testar a confiabilidade de um sistema em relação a outros;
- avaliar a padronização de um processo de produção;
- uma equipe de marketing deseja determinar se uma nova campanha publicitária é mais eficaz do que a antiga;
- uma instituição educacional deseja testar se um novo método de ensino é mais eficaz do que o método antigo.

### <ins>*hipótese nula*</ins>
- é representada pelo símbolo $H_0$;
- é o padrão ou suposição inicial de que não há diferença ou nenhum efeito.

### <ins>*hipótese alternativa*</ins>
- é representada ou por $H_1$ ou $H_a$;
- é a declaração que contradiz a hipótese nula e sugere que há uma diferença ou um efeito.

### <ins>*exemplo*</ins>
- uma equipe de marketing deseja determinar se uma nova campanha publicitária é mais eficaz do que a antiga:
- a hipótese nula é que não há diferenças na taxa média de resposta entre as duas campanhas, enquanto a hipótese alternativa é que a nova campanha tem uma taxa de resposta maior;
- a equipe pode coletar dados sobre as taxas de resposta de uma amostra de clientes e realizar um teste de hipótese para determinar se a diferença é estatísticamente significativa.

## *erro tipo I e tipo II*
### <ins>*tipos de erros de estimação*</ins>
***erro tipo I***: ocorre quando os resultados da amostra rejeitam a hipótese nula, apesar dela ser verdadeira;

***erro tipo II***: nesse caso, a hipótese nula não é rejeitada mas ela é falsa.

### <ins>*exemplo*</ins>
- em uma fábrica, existem inspetores que são responsáveis para verificar a qualidade dos produtos antes que possam ser distribuídos e repassados para os consumidores:
- a situação ideal é que só saiam da fábrica os produtos de boa qualidade;
  - no entanto, sabemos que erros podem ser cometidos nesse processo.
- o produto possui boa qualidade, mas foi reprovado pelo inspetor;
  - nesse caso, temos um exemplo de erro do tipo I.
- a outra situação é que o inspetor aprove um produto de má qualidade, quando, na verdade, ele deveria ser reprovado;
  - esse é um erro do tipo II.

### <ins>*nível de significância e p-valor*</ins>
***nível de significância***: normalmente, é representado pela letra grega alpha ($\alpha$);
- ele funciona como um critério para determinar se uma estatística de teste é, de fato, significativa;

***p-valor***: é uma métrica utilizada para expressar a probabilidade de que algo diferente do esperado tenha ocorrido por acaso;
- se o p-valor foi muito baixo, então devemos rejeitar a hipótese nula.

![](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1688651815522-TLLUYbtOaJ.png)

## *testes para média, variância e proporção*
### <ins>*teste de hipótese para média*</ins>
- supomos que a quantidade média de chamadas por hora em uma central de atendimento ao consumidor de uma grande empresa seja de: $\mu = 100 \ chamadas/hora$;
- em termos de um teste de hipótese, temos que: $H_0: \mu = 100, \ H_1: \mu \neq 100$;
- caso a média amostral $x$ seja próxima da média populacional $\mu = 100$, podemos supor que ela é a verdadeira média populacional ($H_0$);
- por exemplo, se ela estiver entre $98 \leq x \leq 105$, aceitamos $H_0$;
- por outro lado, caso seja um valor muito diferente desse, então $\mu \neq 100$ e, portanto, temos que rejeitá-la.

### <ins>*teste de hipótese para proporção*</ins>
- um determinado programa tem uma confiabilidade de 60%;
- o gestor da fábrica decidiu adquirir um novo software que, teoricamente, tem um nível de confiabilidade superior;
- para realizar a comparação, foram realizados 50 testes;
- formalmente, temos que: $H_0:p=60 \%, H_1:\mu > 60 \%$;
- a probabilidade do novo software ter um desempenho similar ao já existente no caso da hipótese nula, ou ser superior no caso da hipótese alternativa;
- precisamos estabelecer o nível de significância ($\alpha$) que representa a incerteza de aceitar ou rejeitar a hipótese nula em um teste de hipótese;
- os níveis de significância típicos são: $\alpha =0,10(10 \%), \alpha = 0,05(5 \%)$ e $\alpha = 0,010$;
- no nosso caso, vamos trabalhar com $\alpha = 0,05(5 \%)$;
- agora, precisamos estabelecer a região crítica que vai nos indicar pela aceitação ou não da hipótese nula;
- formalmente, temos que: $região \ crítica= P(\hat{p} \geq x, \ sendo \ que \ p=0,60)=\alpha$;
- fazendo os cálculos, temos que: $região \ crítica =P \big(Z \geq \frac{x-0,60}{\sqrt{\frac{0,24}{50}}} \big)$;
- novamente, precisamos consultar a tabela normal Z para 0,95 e obtemos que: $x - 0,714$;
- portanto, obtemos a seguinte região crítica: $região \ crítica= \\{\hat{p} \geq 0,714 \\}$;
- no teste realizado, o gestor observou que o resultado foi $\hat{p}_{obs}-0,80$;
- portanto concluímos que a hipótese nula deve ser rejeitada levando em consideração um nível de significância de 5%.

### <ins>*teste de hipótese para variância*</ins>
- é um método estatístico usado para testar se a variância de uma população é igual a um valor específico ou não;
- no teste de hipótese de variância, a hipótese nula assume que a variância da população é igual a um valor especificado, enquanto a hipótese alternativa assume que a variância da população não é igual ao valor especificado.

## *exemplo prático de teste de hipóteses*
### <ins>*geração dos dados*</ins>
```python
import numpy as np
import matplotlib.pyplot as plt
%matplotlib inline

# geração de dados da população
tamanho_populacao = 10000
np.random.seed(2020)
```

### <ins>*gráfico*</ins>
```python
lst_dados = []
for i in range(2):
    dados = np.random.normal(loc = 100,
      scale = 10,
      size = tamanho_populacao)
plt.hist(dados)
plt.xlabel("categorias")
plt.ylabel("quantidade")
plt.hist(x = dados,
  bins = 'auto',
  color = '#0805aa',
  alpha = 0.7,
  rwidth = 0.85,
  density = True)
plt.grid(axis = 'y',
  alpha = 0.80)
plt.xlabel("categorias")
plt.ylabel("quantidades")
plt.title("histograma das amostras")
lst_dados.append(dados)
```

### <ins>*teste de hipóteses*</ins>
```python
from scipy.stats import ttest_ind
dados1 = lst_dados[0]
dados2 = lst_dados[1]
estatistica, p_valor = ttest_ind(dados1, dados2)

print('estatistica = %.3f, p_valor = %.3f' % (estatistica, p_valor))

if p_valor > 0.05:
  print('aceita H0')
else:
  print('rejeita H0')
```
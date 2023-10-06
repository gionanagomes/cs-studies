# estimação de parâmetros
## *o que são parâmetros estatísticos*
### <ins>*definição de parâmetros estatísticos*</ins>
- é um componente que utilizamos para descrever uma característica específica de toda a população;
- através deles, podemos fazer inferências sobre a população, através de cálculo sobre amostras da população.

### <ins>*parâmetro média*</ins>
- usamos para descrever a distribuição de dados tantos de proporções, como de intervalos;
- vamos considerar os seguintes dados:

$3, 5, 2, 2, 3, 1, 2, 1, 3 \ e \ 2$

- cálculo da média:

$\frac{(3+5+2+2+3+1+2+1+3+2)}{10}=\frac{24}{10}=2,4$

$media=2,4$

### <ins>*parâmetro mediana*</ins>
- usamos para calcular variáveis que são medidas com escalas ordinais, de intervalo ou de proporção;
- vamos considerar os seguintes dados:

$17, 17, 17, 18, 18, 19, 19, 19, 20, 21, 25, 28, 32, 50, 63, 65, 66, 70$

- cálculo da mediana:

$\frac{(20+21)}{2}=20,5$

$mediana=20,5$

- a quantidade de dados é par, portanto calculamos a média dos dois valores centrais.

### <ins>*parâmetro moda*</ins>
- obtém o número que mais ocorre dentro de uma distribuição de dados;
- vamos considerar os seguintes dados:

$grupo \ 1=2; \ grupo \ 2=4; \ conjunto \ 3=20; \ conjunto \ 4=22; \ grupo \ 5=2$

- cálculo da moda:

$moda \ =4$

- o grupo 4 é o que possui a maior quantidade de estudantes.

## *erros de estimação*
### <ins>*definição de erros de estimação*</ins>
- são as diferenças entre os valores reais de um parâmetro e os valores estimados por meio de um modelo estatístico ou matemático;
- eles podem surgir devido a vários fatores, como:
  - erros de medição;
  - erros de amostragem;
  - especificação incorreta do modelo;
  - variação aleatória nos dados.

### <ins>*real x estimado*</ins>
- vamos considerar os seguintes dados:

$\theta =20 \ e \ \hat{\theta}=10$

$\theta$: representa o valor do parâmetro estatístico real;

$\hat{\theta}$: representa a estimativa do parâmetro estatístico.

### <ins>*medida de erro clássico*</ins>
- lembrar que:

$\theta =20 \ e \ \hat{\theta}=10$

- cálculo:

$erro=\hat{\theta}-\theta =10-20$

$erro=-10$

### <ins>*medida de erro absoluto*</ins>
- lembrar que:

$\theta =20 \ e \ \hat{\theta}=10$

- cálculo:

$erro=|\hat{\theta}-\theta |=|10-20|$

$erro=10$

### <ins>*medida de erro quadrado*</ins>
- lembrar que:

$\theta =20 \ e \ \hat{\theta}=10$

- cálculo:

$erro=(\hat{\theta}-\theta)^2=(10-20)^2$

$erro=100$

## *intervalos de confiança*
### <ins>*definição de intervalos de confiança*</ins>
- são uma ferramenta estatística usada para estimar o intervalo de valores em que um parâmetro populacional, provavelmente, estará com um certo nível de confiança;
- nós construímos um intervalo de confiança através de uma amostra da população e um nível de confiança especificado, normalmente 95% ou 99%.

!()[]

### <ins>*tipos de intervalo de confiança*</ins>
***estimativas pontuais***: é um parâmetro que é um valor numérico (média amostral, proporção amostral);

***estimativas de intervalo***: as estimativas de intervalo fornecem um intervalo como a estimativa de um parâmetro.

### <ins>*fórmula*</ins>
$P \big(\overline{X}-Z_{\frac{\alpha}{2}} \frac{s}{\sqrt{n}} \leq \mu \leq \overline{X}-Z_{\frac{\alpha}{2}} \frac{s}{\sqrt{n}} \big)=1-\alpha$

- sendo que:

$\overline{X}$ é a média amostral;

$Z$ é o valor associado à probabilidade desejada;

$\frac{s}{\sqrt{n}}$ é o desvio padrão amostral da média;

$\mu$ é a média populacional desconhecida;

$\alpha$ é o nível de significância que é dado por: $\alpha =1-\ nível \ de \ confianca$

#### <ins>*exemplo*</ins>
- suponha que estamos analisando o comportamento associado a um determinado ativo nos últimos 60 dias;
- o retorno médio é de 1% com desvio-padrão de 2%;
- nosso objetivo é construir um intervalo de confiança levando em consideração um nível de confiança de 95%:

***passo 1***: encontrar o nível de significância que é dado por:

$\alpha =1-0,95=0,05$

***passo 2***: obter $Z_\frac{\alpha}{2}$ através da tabela $Z$ da distribuição normal:

$Z_{0,025}=1,96$

***passo 3***: cálculo de intervalo superior:

$\overline{X}+Z_{\frac{\alpha}{2}} \frac{s}{\sqrt{n}}=0.01+1,96 \big(\frac{0,02}{\sqrt{60}} \big)=0,0151$

***passo 4***: cálculo de intervalo inferior:

$\overline{X}-Z_{\frac{\alpha}{2}} \frac{s}{\sqrt{n}}=0.01-1,96 \big(\frac{0,02}{\sqrt{60}} \big)=0,005$

- o intervalo de confiança é dado por:

$(0,01-0,005;0,01+0,0151)=(0,005;1,015)$

- o intervalo de confiança de 95% para a média de retorno do ativo é de:

$0,005 \% \leq \mu \leq 1,015 \%$

## *exemplo prático de estimação de parâmetros*
### <ins>*estimação de parâmetros*</ins>
```python
import scipy.stats as st

nivel_de_confianca = 0.95
nivel_de_significancia = 1 - nivel_de_confianca
Z = abs(st.norm.ppf(nivel_de_significancia/2))

print(f'Z={Z}')
```

### <ins>*intervalo de confiança*</ins>
```python
import math

tamanho_populacao = 60
desvio_padrao = 0.020
desvio_padrao_amostral = desvio_padrao/math.sqrt(tamanho_população)
media_amostral = 0.01
lim_sup = media_amostral + desvio_padrao_amostral
lim_inf = media_amostral - desvio_padrao_amostral
intervalo_de_confianca = (media_amostral - lim_inf, media_amostral + lim_sup)

print(f'intervalo de confianca = {intervalo_de_confianca}')
```
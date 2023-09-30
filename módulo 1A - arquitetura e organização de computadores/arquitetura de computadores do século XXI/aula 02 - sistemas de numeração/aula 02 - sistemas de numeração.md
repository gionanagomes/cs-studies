# sistemas de numeração
***bit*** = “0” ou “1”

***byte*** = 8 x bit

A = 10010010
a = 11001100

| sistema binário | sistema decimal |
| --- | --- |
| 00000000 | 0 |
| 00000001 | 1 |
| 00000010 | 2 |
| 00000011 | 3 |
| 00000100 | 4 |
| … | … |
| 11111111 | 255 |

### <ins> *grandezas de armazenamento de informações* </ins>

| espaço | unidade de medida | número de caracteres |
| --- | --- | --- |
| 8 bits | 1 byte | 1 |
| 1024 bytes | 1 kilobyte | 1024 |
| 1024 kilobytes | 1 megabyte | 1 048 576 |
| 1024 megabytes | 1 gigabyte | 1 073 741 824 |
| 1024 gigabytes | 1 terabyte | 1.099511628 x 12 |
- a quantidade de algarismos disponíveis num sistema de numeração denomina-se base.

### <ins> *alguns sistemas de numeração* </ins>

***decimal (base 10)***: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9;

***binário (base 2)***: 0, 1;

***octal (base 8)***: 0, 1, 2, 3, 4, 5, 6, 7;

***hexadecimal (base 16)***: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, A, B, C, D, E, F.

### <ins>*sistema decimal*</ins>
- é o sistema mais utilizado pelos seres humanos;
- constituído por 10 algarismos;
- cada algarismo tem um valor posicional
  - cada algarismo tem um peso de acordo com a sua posição na representação do valor.

![](img/img-1.png)

### <ins>*sistema binário*</ins>
- é o sistema mais utilizado por máquinas, uma vez que os sistemas digitais trabalham internamente com dois estados (ligado/desligado, verdadeiro/falso, aberto/fechado);
- utiliza os símbolos: 0 e 1;
  - cada símbolo é designado por bit (binary digit).

### <ins>*sistema octal*</ins>
- é um sistema de numeração de base 8;
  - recorre a oito símbolos (0, 1, 2, 3, 4, 5, 6, 7) para a representação de um determinado valor.

### <ins>*sistema hexadecimal*</ins>
- muito utilizada na programação de microprocessadores, especialmente nos equipamentos de estudo e sistemas de desenvolvimento;
- utiliza os símbolos: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 do sistema decimal e as letras A, B, C, D, E, F.

***equivalências***: A = 10, B = 11, C = 12, D = 13, E = 14, F = 15

## *conversões de base decimal*

### <ins>*decimal para binário*</ins>

- dividir sucessivamente por 2 o número decimal e os quocientes que vão sendo obtidos, até que o quociente de uma das divisões seja 0;
- o resultado é a sequência de baixo para cima de todos os restos obtidos:

![](img/img-2.png)

| decimal | binário |  | decimal | binário |
| --- | --- | --- | --- | --- |
| 0 | 0 |  | 11 | 1011 |
| 1 | 1 |  | 12 | 1100 |
| 2 | 10 |  | 13 | 1101 |
| 3 | 11 |  | 14 | 1110 |
| 4 | 100 |  | 15 | 1111 |
| 5 | 101 |  | 16 | 10000 |
| 6 | 110 |  | 17 | 10001 |
| 7 | 111 |  | 18 | 10010 |
| 8 | 1000 |  | 19 | 10011 |
| 9 | 1001 |  | 20 | 10100 |
| 10 | 1010 |  | … | … |

### <ins>*decimal para octal*</ins>

- divisões sucessivas por 8;
- o resultado é a sequência de baixo para cima de todos os restos obtidos:

![](img/img-3.png)

### <ins>*decimal para hexadecimal*</ins>

- divisões sucessivas por 16:

![](img/img-4.png)

| decimal | hexa |  | decimal | hexa |  | decimal | hexa |
| --- | --- | --- | --- | --- | --- | --- | --- |
| 0 | 0 |  | 11 | B |  | 22 | 16 |
| 1 | 1 |  | 12 | C |  | 23 | 17 |
| 2 | 2 |  | 13 | D |  | 24 | 18 |
| 3 | 3 |  | 14 | E |  | 25 | 19 |
| 4 | 4 |  | 15 | F |  | 26 | 1A |
| 5 | 5 |  | 16 | 10 |  | 27 | 1B |
| 6 | 6 |  | 17 | 11 |  | 28 | 1C |
| 7 | 7 |  | 18 | 12 |  | 29 | 1D |
| 8 | 8 |  | 19 | 13 |  | 30 | 1E |
| 9 | 9 |  | 20 | 14 |  | 31 | 1F |
| 10 | A |  | 21 | 15 |  | 32 | 20 |

---

## *conversões de base binária, octal e hexadecimal*

### <ins>*binário para decimal*</ins>

- basta calcular a soma de cada um dos dígitos do número binário multiplicado por 2 (que é a sua base) elevado à posição colunar do número, que, da direita para a esquerda começa em 0:

![](img/img-5.png)

### <ins>*binário para octal*</ins>

- separa-se os dígitos do número binário em grupos de 3 bits da esquerda para a direita;
  - em seguida transforma-se cada grupo em octal;
  - ao final une-se os resultados.
- caso o número de dígitos do número binário não seja múltiplo de 3, completa-se os dígitos a esquerda com zeros.

### <ins>*binário para hexadecimal*</ins>

- separa-se o número binário em grupos de 4 bits, da direita para a esquerda;
  - em seguida, transforma-se cada grupo de 4 bits em hexadecimal;
  - ao final, simplesmente une-se os resultados em um só.
- caso o número de dígitos do número binário não seja múltiplo de 4, completa-se os dígitos à esquerda com 0:

![](img/img-6.png)

### <ins>*octal para decimal*</ins>

- obtida através da soma dos dígitos do número octal multiplicados pela base 8 elevada à posição colunar do dígito, começando em 0 da direita para esquerda:

![](img/img-7.png)

### <ins>*octal para binário*</ins>

- decompõe-se o número octal diretamente em binários de 3 dígitos;
  - os zeros mais à esquerda do resultado binário podem ser omitidos.

### <ins>*octal para hexadecimal*</ins>

- transforma-se primeiro o octal em binário e em seguida o binário em hexadecimal:

![](img/img-8.png)

### <ins>*hexadecimal para decimal*</ins>

- realizada através da soma dos dígitos hexadecimal multiplicados pela base 16 elevada à posição colunar contando da direita para a esquerda, começando em 0:

![](img/img-9.png)

### <ins>*hexadecimal para binário*</ins>

- decompõe-se o número hexadecimal diretamente em binários de 4 dígitos;
  - os zeros mais à esquerda podem ser omitidos.

![](img/img-10.png)

### <ins>*hexadecimal para octal*</ins>

- transforma-se primeiro o hexadecimal em binário e em seguida o binário em octal:

![](img/img-11.png)
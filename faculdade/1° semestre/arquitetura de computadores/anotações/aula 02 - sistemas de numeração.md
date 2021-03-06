# sistemas de numeração
- **bit**: menor porção de memória na máquina;
    - "0" (aberto) ou "1" (fechado).
- **byte**: 8 x bit;
    - A = 10010010
      a = 11001100

| **sistema binário** | **sistema decimal** |
|:-------------------:|:-------------------:|
| 00000000            | 0                   |
| 00000001            | 1                   |
| 00000010            | 2                   |
| 00000011            | 3                   |
| 00000100            | 4                   |
|                     |                     |
| 11111111            | 255                 |
### grandezas de armazenamento de informação
| **espaço**     | **unidade de medida** | **número de caracteres** |
|:--------------:|:---------------------:|:------------------------:|
| 8 bits         | 1 byte                | 1                        |
| 1024 bytes     | 1 kilobyte            | 1.024                    |
| 1024 kilobytes | 1 megabyte            | 1.048.576                |
| 1024 megabytes | 1 gigabyte            | 1.073.741.824            |
| 1024 gigabytes | 1 terabyte            | 1.099511628 x el 12      |
### sistema decimal
- é o sistema mais utilizado pelos seres humanos, normalmente para indicar quantidades;
    - é constituído por dez algarismos.
- cada algarismo tem um valor posicional;
    - cada um tem um peso de acordo com a sua posição na representação do valor:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683279088-FKnmBCBbm7.png)

### sistema binário
- é o sistema mais utilizado por máquinas, uma vez que os sistemas digitais trabalham internamente com dois estados (ligado/desligado, verdadeiro/falso, aberto/fechado);
- utiliza os símbolos 0 e 1;
    - cada símbolo é designado por bit (binary digit).
### sistema octal
- é um sistema de numeração de base 8;
    - recorre a 8 símbolos (0, 1, 2, 3, 4, 5, 6, 7) para a representação de um determinado valor.
### sistema hexadecimal
- é muito utilizado na programação de microprocessadores (equipamentos de estudo, sistemas de desenvolvimento);
- utiliza os símbolos 0, 1, 2, 3, 4, 5, 6, 7, 8 e 9 do sistema decimal e as letras A, B, C, D, E e F;
- **equivalências**: A = 10, B = 11, C = 12, D = 13, E = 14 E F = 15.
## conversões de base decimal
### decimal para binário
- dividir sucessivamente por 2 o número decimal e os quocientes que vão sendo obtidos, até que o quociente de uma das divisões seja 0;
- o resultado é a sequência de baixo para cima de todos os restos obtidos.

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683308459-IMNZE7f6Ml.png)

| **decimal** | **binário** |  | **decimal** | **binário** |
|:-----------:|:-----------:|:----:|:-----------:|:-----------:|
| 0           | 0           |      | 11          | 1011        |
| 1           | 1           |      | 12          | 1100        |
| 2           | 10          |      | 13          | 1101        |
| 3           | 11          |      | 14          | 1110        |
| 4           | 100         |      | 15          | 1111        |
| 5           | 101         |      | 16          | 10000       |
| 6           | 110         |      | 17          | 10001       |
| 7           | 111         |      | 18          | 10010       |
| 8           | 1000        |      | 19          | 10011       |
| 9           | 1001        |      | 20          | 10100       |
| 10          | 1010        |      |             |             |

### decimal para octal
- divisões sucessivas por 8;
- o resultado é a sequência de baixo para cima de todos os restos obtidos.

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683357698-DJXdOEZ5Ks.png)

### decimal para hexadecimal
- divisões sucessivas por 16.

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683381682-5xWMmC15GH.png)

| **decimal** | **hexa** |  | **decimal** | **hexa** |  | **decimal** | **hexa** |
|-------------|----------|---------------|-------------|----------|---------------|-------------|----------|
| 0           | 0        |               | 11          | B        |               | 22          | 16       |
| 1           | 1        |               | 12          | C        |               | 23          | 17       |
| 2           | 2        |               | 13          | D        |               | 24          | 18       |
| 3           | 3        |               | 14          | E        |               | 25          | 19       |
| 4           | 4        |               | 15          | F        |               | 26          | 1A       |
| 5           | 5        |               | 16          | 10       |               | 27          | 1B       |
| 6           | 6        |               | 17          | 11       |               | 28          | 1C       |
| 7           | 7        |               | 18          | 12       |               | 29          | 1D       |
| 8           | 8        |               | 19          | 13       |               | 30          | 1E       |
| 9           | 9        |               | 20          | 14       |               | 31          | 1F       |
| 10          | A        |               | 21          | 15       |               | 32          | 20       |

## conversões de base binária
### binário para decimal
- basta calcular a soma de cada um dos dígitos do número binário multiplicado por 2 (que é a sua base) elevado à posição colunar do número, que, da direita para a esquerda começa em 0:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683462149-lb83KugUbU.png)

### binário para octal 
- separa-se os dígitos do número binário em grupos de 3 bits da direita para a esquerda;
    - em seguida transforma-se cada grupo individual de 3 bits em octal;
    - ao final, une-se os resultados.
- caso o número de dígitos do número binário não seja múltiplo de 3, completa-se os dígitos à esquerda com zeros:

[imagem](https://prnt.sc/ZJcBcR-TKiZH)

### binário para hexadecimal
- separa-se o número binário em grupos de 4 bits, da direita para a esquerda;
    - em seguida, transforma-se cada grupo de 4 bits em hexadecimal;
    - ao final, simplesmente une-se os resultados em um só.
- caso o número de dígitos do número binário não seja múltiplo de 4, completa-se os dígitos à esquerda com zeros:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683503099-pr9k7WDhAZ.png)

## conversões de base octal
### octal para decimal
- obtida através da soma dos dígitos do número octal multiplicados pela base 8 elevada à posição colunar do dígito, começando em 0 da direita para a esquerda:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683534329-YGiz40ODDs.png)

### octal para binário
- decompõem-se o número octal diretamente em binários de 3 dígitos:
    - os zeros mais à esquerda do resultado binário podem ser omitidos.

![imagem]()

### octal para hexadecimal
- transforma-se primeiro o octal em binário e em seguida o binário em hexadecimal:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683553074-2Z1UYxrxpN.png)

## conversões de base hexadecimal
### hexadecimal para decimal
- realizada através da soma dos dígitos hexadecimais multiplicados pela base 16 elevada à posição colunar contando da direita para a esquerda, começando em 0:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683577490-OFbl460t4b.png)

- note que os caracteres que definem os dígitos hexadecimais A, B e C foram substituídos pelos valores equivalentes em decimais 10, 11 e 12.

### hexadecimal para binário
- decompõe-se o número hexadecimal diretamente em binários de 4 dígitos:
    - os zeros mais à esquerda do resultado binário podem ser omitidos.

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683605200-aX8zhpQaNm.png)

### hexadecimal para octal
- transforma-se primeiro o hexadecimal em binário e em seguida o binário em octal:

![imagem](https://paperx-dex-assets.s3.sa-east-1.amazonaws.com/images/1648683610593-3AJSXaAwD2.png)
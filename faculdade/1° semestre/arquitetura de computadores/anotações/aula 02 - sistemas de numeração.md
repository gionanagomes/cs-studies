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

    número 237
    
    10² = 2

    10¹ = 3

    10⁰ = 7

    2 x 10² + 3 x 10¹ + 7 x 10⁰ = 237
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

25 / 2

 1   12 / 2

      0   6 / 2
         
          0   3 / 2
             
              1   1 / 2

                  1   0
= 11001

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

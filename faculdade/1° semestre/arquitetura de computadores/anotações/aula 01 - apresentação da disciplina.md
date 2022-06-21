# apresentação da disciplina
## o que aborda essa disciplina?
- arquitetura se refere a um projeto de uma construção;
    - ela vai adotar uma série de ações para organizar e criar espaços que possam dar condições a diferentes atividades humanas.
- quando migramos o termo para a área da tecnologia da informação, temos a arquitetura da computação;
    - é um projeto que define os parâmetros e o modo em que os diversos componentes de um computador devem ser organizados para entrar em operação e alcançar a qualidade e o desempenho necessários.
## por que estudar arquitetura de computadores?
- é essencial que tenhamos pelo menos conhecimentos básicos de arquitetura de computadores;
- saber como o computador funciona nos permitirá entender:
    - sua capacidade (e incapacidade) de resolver problemas;
    - como programá-los da melhor forma possível;
    - como deixar o computador e os dados contidos neles mais seguros;
    - como ganhar desempenho;
    - o que faz ele ficar tão lento.
- é necessário aprender:
    - quais são os componentes de um computador;
    - como eles funcionam;
    - como trabalham em conjunto formando um sistema.
## um pouco da história dos computadores
- não podemos afirmar que exista um inventor do computador;
    - ideias e tecnologias foram aproveitadas sucessivamente, em diferentes lugares e épocas.
- entre os cientistas pioneiros estão:
    - Blaise Pascal (1646-1716);
    - Gottfried W. Leibniz (1646-1716);
    - Charles Babbage (1792-1871).
- nas primeiras máquinas, a ideia era representar dados por meio do posicionamento de engrenagens;
    - as respostas dos cálculos seriam dadas pela posição final das engrenagens.
- os dispositivos automatos vieram antes dessas máquinas;
    - tentavam imitar o comportamento humano;
    - o objetivo estava mais para entreter e divertir do que para grandes projetos.
- para aumentar a produção em fábricas de tecelagem, Jacques Vaucanson (1709-1782) criou uma máquina de tear que praticamente não precisava de ação humana para funcionar;
    - o padrão de tecelagem não dependia da habilidade manual dos operadores.
- o tear era programado para que a máquina produzisse mais rápido, com menos erros e praticamente sozinha;
    - produziria estampas de padrões diferentes, de acordo com a programação instalada em um papelão perfurado com o padrão de tecelagem.
- enquanto os autômatos só conseguiriam realizar o mesmo conjunto de ações na mesma sequência, a máquina programável poderia produzir diferentes tecidos e estampas;
- um dos projetos de Charles Babbage, a máquina analítica foi projetada para ler instruções de cartões perfurados;
    - era uma máquina programável, de acordo com o conjunto de perfurações que a alimentasse.
- Herman Hollerith (1860-1929) desenvolveu máquinas que ajudaram no cálculo do senso americano;
    - foi ele quem patenteou o uso de cartões perfurados na construção de máquinas de calcular e ordenar;
    - anos depois, fundou a International Business Machines (IBM).
- a partir da virada do século XIX para o XX, os avanços da eletrônica permitiriam o desenvolvimento de máquinas de calcular e ordenar (computar) cada vez mais complexas;
- o caminho para o desenvolvimento de computadores estava aberto à produção de máquinas cada vez mais rápidas, menores e funcionais
### MARK - 1944
- criado pela Universidade de Harvard em parceria com a IBM;
- fazia farto uso de relés mecânicos controlados eletronicamente;
- foi o primeiro computador eletromecânico;
### ENIAC - 1946
- foi o primeiro computador digital eletrônico;
- pesava 30 toneladas, media 5,50 m de altura e 25 m de comprimento e ocupava 180 m² de área construída;
- contava com 70 mil resistores e entre 17.468 e 18.000 válvulas a vácuo;
- a construção foi concluída após a Segunda Guerra Mundial.
### COLOSSUS - 1943
- foi construído na Inglaterra para decodificar mensagens alemãs durante a Segunda Guerra Mundial;
- contribuiu para a vitória dos aliados na guerra, poupando a vida de milhares de pessoas;
- após a guerra os engenheiros e cientistas da computação envolvidos tiveram seus nomes apagados ou esquecidos e a documentação do projeto destruída.
### computadores de mesa
- o desenvolvimento do computador de mesa ocorreu graças a algumas pessoas que construíram computadores em casa;
- o interesse comercial nesses equipamentos só ocorreu no final da década de 1970;
- alguns dos construtores de computadores caseiros são:
    - Steve Jobs;
    - Bill Gates;
    - Steve Wozniak;
    - Paul Allen.
## a história da internet e de grandes empresas que dominam o mercado
- em 1981, a IBM apresentou ao mundo o primeiro computador pessoal;
    - seu software básico foi desenvolvido pela Microsoft.
- inaugurou o uso dos computadores de mesa em escritórios e casas;
- atualmente, computadores minúsculos são incorporados a vários dispositivos que carregamos na bolsa e no bolso;
    - contínua ampliação da capacidade de emissão e recepção de dados dos smartphones.
### primórdios da internet
- Tim Berners-Lee propôs um sistema pelo qual documentos armazenados ao longo da internet podiam ser unidos;
    - ele chamou isso de world wide web, ou web.
- para tornar a informação na web acessível, foram criados motores de busca;
    - peneiram a web, categorizam as informações e então auxiliam os usuários.
- as grandes empresas nessa área são a Google e a Microsoft.
## principais partes de um computador
### modelo de Von Neumann
- se constitui por:
    - **unidade de controle**: que busca cada instrução dos programas na memória e executa sobre os dados de entrada;
    - unidade lógica e aritmética (ULA): parte da unidade central de processamento;
    - **memória**: para armazenar dados e programas.
- os dispositivos de entrada e saída interagem com o modelo, mas não fazem parte dos componentes principais;
- a ULA realiza operações aritméticas e operações lógicas sobre um ou mais operandos como:
    - soma de dois operandos; 
    - negação de um operando; 
    - inversão de um operando;
    - AND (“E” lógico) de dois operandos; 
    - OR (“OU” lógico) de dois operandos;
    - deslocamento de um operando para a esquerda ou para a direita;
    - rotação de um operando para a esquerda ou para a direita.
#### memória
- tem a função de armazenar dados e instruções; 
- é organizada em posições, que podem ser visualizadas como elementos em uma matriz;
- cada elemento da memória tem um endereço;
- pode-se falar de uma memória que tenha x posições;
    - cada posição pode ser referenciada diretamente de acordo com a sua colocação na sequência.
###### exemplos
- se uma memória tem 4096 posições, existem posições de memória 0, 1, 2, 3,...., 4094 e 4095.
#### entrada e saída
- teclado e mouse são dispositivos de entrada;
- tela e impressora são dispositivos de saída.
Atividade 01 - Parte 2 
Altere sua implementação do programa Labirinto para apresentar o tabuleiro com as posições de início e destino, como mostrado nesta parte da aula. Tente não copiar o código mostrado, mas fazer sem olhar o material da aula. Relate se você conseguiu fazer a implementação sem copiar, se você fez algo de diferente em termos de implementação ou se a sua implementação ficou igual à mostrada na aula.
<br>
As variaveis do código foram colocadas de forma diferente, com nome diferente. 
<br>
Execute várias vezes o programa Labirinto e relate se houve mudanças na posição dos pontos de início e destino do labirinto.
<br>
Sim, houve mudança na posição a qual eles se localizam toda vez que inicio o código.
<br>
Teste o uso de outros caracteres para as constantes de INICIO e DESTINO usadas no programa e indique se você encontrou valores mais adequados (para deixar o tabuleiro mais bonito, mais simples de ser visualizado etc. que os mostrados na aula).
<br>
Coloquei como valores novos para os caracteres que aparecerão o C, Representando o Começo e F representando Fim, referente de onde deve partir e onde deve chegar.
<br>
Altere a função "inicializarMatriz()" para posicionar o caractere de início na parte inferior à esquerda do tabuleiro, e para posicionar o caractere de destino na parte superior à direita do tabuleiro. Execute e confira se sua implementação está correta.
<br>
Para que ficasse da forma desejada segundo o enunciado, ficou da seguinte forma:
<br>
linhaInicio = gerarNumero(Tamanho/2, Tamanho /2-1  );<br>
colunaInicio = gerarNumero(Tamanho/2, Tamanho/ 2-1  );<br>
contagem[linhaInicio][colunaInicio] = Começo;<br>
int linhaDestino = gerarNumero(1,  Tamanho -2  );<br>
int colunaDestino = gerarNumero(1, Tamanho -2  );<br>
contagem[linhaDestino][colunaDestino] = Fim;
<br>

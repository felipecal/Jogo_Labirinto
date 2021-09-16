Atividade 02
Altere sua implementação do programa Labirinto para ele procurar e mostrar um caminho válido, como mostrado nesta última parte da aula. Tente não copiar o código mostrado, mas fazer sem olhar o material da aula. Relate se você conseguiu fazer a implementação sem copiar, se você fez algo de diferente em termos de implementação ou se a sua implementação ficou igual à mostrada na aula.
<br>
Foram alterados nomes de variaveis, textos dentre outros.
<br>
Execute várias vezes o programa Labirinto e relate se houve mudanças na posição dos pontos de início e destino e nos caminhos encontrados. Eles foram os menores caminhos possíveis dentro do tabuleiro? Sempre foi possível encontrar caminhos válidos?
<br>
De acordo com minha visualização haviam caminhos menores que podiam ser realizados, poupando tempo e rota para o mesmo, e nem sempre ele irá achar uma rota, pois temos chances de não ter rota no tabuleiro gerado o que ira retornar o printl informando o usuario.
<br>
Teste o uso de outros caracteres para as constantes de CAMINHO e SEM_SAIDA usadas no programa e indique se você encontrou valores mais adequados (para deixar o tabuleiro mais bonito, mais simples de ser visualizado etc.) que os mostrados na aula.
<br>
Foram implementados dois novos caracteres o qual ficam de mais facil visualização, quando não há caminho possivel por ali ele da o caracter _ que fica mais facil a visualização como um bloqueio e quando há rota ou caminho o qual está seguindo ele da o " indicando o caminho que está sendo realizado
<br>
Altere o tempo em "milissegundo"s do comando "Thread.sleep()" para mais e para menos. Relate o que acontece com essas mudanças, e qual seria o melhor valor para você poder acompanhar a execução do algoritmo de busca.
<br>
Quando alteramos o tempo para mais ele mostara a rota que está sendo tentada no terminal com mais tempo para o usuario visualizar e entender o que está acontecendo, quando abaixamos a rota aparece mais rapida no terminal dando o resutlado consequentemente mais rapido.
<br>
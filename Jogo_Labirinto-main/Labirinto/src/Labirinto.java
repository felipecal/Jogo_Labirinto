public class Labirinto {
    private static final char Tamanho = 10;
    private static final char Horizontal = '_';
    private static final char Vertical = '|';
    private static final char campo_vazio = ' ';
    private static final char Interna = '%';
    private static final double Probabilidade = 0.7;
    private static final char Começo = 'C';
    private static final char Fim = 'F';
    private static int linhaInicio;
    private static int colunaInicio;
    private static final char Rota = '"';
    private static final char Rota_sem_saida = '_';
    private static char[][] contagem;
    public static void Matriz() {
        int i =0;
        while (i < Tamanho){
            contagem[i][0] = Vertical;

            contagem[i][Tamanho - 1] = Vertical;

            contagem[0][i] = Horizontal;

            contagem[Tamanho - 1][i] = Horizontal;
            i++;
        }
        for (i = 1; i < Tamanho - 1; i++) {
            for (int j = 1; j < Tamanho - 1; j++) {
                if (Math.random() > Probabilidade) {
                    contagem[i][j] = Interna;
                }
                else {
                    contagem[i][j] = campo_vazio;
                }

            }
        }
        linhaInicio = gerarNumero(Tamanho/2, Tamanho /2-1   );
        colunaInicio = gerarNumero(Tamanho/2, Tamanho/2-1   );
        contagem[linhaInicio][colunaInicio] = Começo;
        int linhaDestino = gerarNumero(1,  Tamanho/2  );
        int colunaDestino = gerarNumero(1, Tamanho -2  );
        contagem[linhaDestino][colunaDestino] = Fim;
    }
    public static void imprimir() {

        for (int i = 0; i < Tamanho; i++) {

            for (int j = 0; j < Tamanho; j++) {

                System.out.print(contagem[i][j]);
            }
            System.out.println();
        }
        try {
            Thread.sleep(400);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int gerarNumero(int minimo, int maximo) {
        int valor = (int) Math.round(Math.random()  * (maximo - minimo));
        return minimo + valor;
    }
    public static boolean procurarCaminho(int linhaAtual, int colunaAtual) {
        int proxLinha;
        int proxColuna;
        boolean achou = false;
        proxLinha = linhaAtual - 1;
        proxColuna = colunaAtual;
        achou = tentarCaminho(proxLinha, proxColuna);
        if (!achou) {
            proxLinha = linhaAtual + 1;
            proxColuna = colunaAtual;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        if (!achou) {
            proxLinha = linhaAtual;
            proxColuna = colunaAtual - 1;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        if (!achou) {
            proxLinha = linhaAtual;
            proxColuna = colunaAtual + 1;
            achou = tentarCaminho(proxLinha, proxColuna);
        }
        return achou;
    }

    private static boolean tentarCaminho(int proxLinha, int proxColuna) {
        boolean achou = false;
        if (contagem[proxLinha][proxColuna] == Fim) {
            achou = true;
        }
        else if (posicaoVazia(proxLinha, proxColuna)) {
            contagem[proxLinha][proxColuna] = Rota;
            imprimir();
            achou = procurarCaminho(proxLinha, proxColuna);
            if (!achou) {
                contagem[proxLinha][proxColuna] = Rota_sem_saida;
                imprimir();
            }
        }
        return achou;
    }
    public static boolean posicaoVazia(int linha, int coluna) {
        boolean vazio = false;
        if (linha >= 0 && coluna >= 0 && linha < Tamanho && coluna < Tamanho) {
            vazio = (contagem[linha][coluna] == campo_vazio);
        }
        return vazio;
    }
    public static void main(String Arg[]) {
            contagem = new char[Tamanho][Tamanho];
            Matriz();
            imprimir();
            System.out.println("\n Procurando caminho possivel \n");
            boolean achou = procurarCaminho(linhaInicio, colunaInicio);
            if (achou) {
            System.out.println("CAMINHO ENCONTRADO!");
            }
            else {
                System.out.println("\n Infelizmente não existe caminho possivel para chegar ao destino \n");
        }
    }
    }


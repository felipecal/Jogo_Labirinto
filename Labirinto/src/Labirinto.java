public class Labirinto {
    private static final char Tamanho = 10;
    private static final char Horizontal = '_';
    private static final char Vertical = '|';
    private static final char campo_vazio = ' ';
    private static final char Interna = '@';
    private static final double Probabilidade = 0.7;
    private static char[][] contagem;
    public static void Matriz() {
        int i =0;

//Na linha 11 tinha um for criado pelo professor, substitui por um while que também pode ser utilizado como um contador.
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
                } else {
                    contagem[i][j] = campo_vazio;

                }

            }
        }
    }
        public static void imprimir() {

            for (int i = 0; i < Tamanho; i++) {

                for (int j = 0; j < Tamanho; j++) {

                    System.out.print(contagem[i][j]);

                }

                System.out.println();

            }

        }

        public static void main(String Arg[]) {

            contagem = new char[Tamanho][Tamanho];

            Matriz();

            imprimir();
        }
    }

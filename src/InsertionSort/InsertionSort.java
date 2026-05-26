package InsertionSort;
/* O Insertion Sort (ordenação por inserção) é um algoritmo simples que constrói uma lista ordenada elemento por elemento.
Ele funciona como organizar cartas de baralho na mão: você pega uma carta e a insere na posição correta em relação às cartas.
Como Funciona:
    A primeira carta: O primeiro elemento do array é considerado naturalmente "ordenado" por si só.
Avaliação: O algoritmo pega o segundo elemento (chamado de chave ou valor atual) e o compara com os elementos à sua esquerda.
Inserção: Se o elemento atual for menor que o anterior, os elementos maiores são deslocados uma posição para a direita para
abrir espaço, e o atual é encaixado na vaga correta.
Repetição: O processo se repete para cada um dos elementos restantes até que todo o vetor esteja ordenado.

Lista desordenada: [5, 2, 4, 6, 1, 3]
Passo 1: Pega o 2. Compara com 5. O 5 é maior, então vai para a direita: [2, 5, 4, 6, 1, 3]
Passo 2: Pega o 4. Compara com 5. O 5 é maior, desloca. Compara com 2. O 2 é menor, então encaixa entre eles: [2, 4, 5, 6, 1, 3]
Passo 3: O 6 já é maior que o 5. Continua na mesma: [2, 4, 5, 6, 1, 3]
Passo 4: Pega o 1. Como é o menor de todos, ele "empurra" todos os outros para a direita,
indo para a primeira posição: [1, 2, 4, 5, 6, 3]
Passo 5: Insere o 3 na sua posição correta: [1, 2, 3, 4, 5, 6]
Características e Complexidade:
Melhor Caso: O(N)- Ocorre quando o vetor já está ordenado;
Médio Caso:O(n^2)- Os elementos do array estão em uma ordem aleatória;
Metade dos elementos à esquerda é verificada e deslocada para cada nova inserção;
Pior Caso: O(N^2)- Ocorre quando o vetor está em ordem inversa (decrescente).Estável:
Não altera a ordem de elementos iguais.Uso ideal:
É excelente para conjuntos de dados pequenos ou listas que já estão quase ordenada */

public class InsertionSort {
    public static void main(String[] args) {
        int [] array = {5, 2, 4, 6, 1, 3};
        for(int num:array){
            System.out.print(num+ "|");
        }
        System.out.println();
        for(int i=1; i <array.length;i++){
            int key = array[i];
            int j = i-1;
            while (j>=0 && array[j]>key ){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        for(int j:array){
            System.out.print(j+ "|");
        }
    }
}

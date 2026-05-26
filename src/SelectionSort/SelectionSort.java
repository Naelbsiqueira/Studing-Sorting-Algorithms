package SelectionSort;
/* O Selection Sort (Ordenação por Seleção) é um algoritmo simples de ordenação in-place.
Ele divide a lista em duas partes (uma ordenada e outra não) e, a cada passo,
encontra o menor valor da parte não ordenada e o move para o final da parte ordenada.
Para colocar os elementos em ordem crescente, o algoritmo executa a seguinte rotina:
Percorre toda a lista para encontrar o menor elemento. Troca esse menor elemento com o que está na
primeira posição da lista.Repete o processo para o restante da lista (a partir da segunda posição),
encontrando o segundo menor e o trocando pela segunda posição.
Esse ciclo continua até que toda a lista esteja ordenada.

    Desempenho e Complexidade: Embora seja fácil de entender e implementar,
o Selection Sort não é eficiente para listas grandes:
Complexidade de tempo: O(n^2) para os casos melhor, médio e pior.
Complexidade de espaço: O(1), pois não requer memória extra para ordenar a lista.
Exemplo visual com array desordenado:[7, 3, 5, 2, 1]
Passo 1: O algoritmo analisa todo o array, encontra o menor número (que é o '1') e o troca com o primeiro elemento ''.
Array atual: [1], [3, 5, 2, 7]
Passo 2: Agora ele ignora o [1] e procura o menor número entre os restantes. O menor é o [2].
Ele é trocado com o segundo elemento [3].
Array atual: [1, 2], [5, 3, 7]
Passo 3: O processo se repete com a porção restante. O menor número agora é o [3].
Ele é trocado pelo terceiro elemento [5].
Array atual: [1, 2, 3], [5, 7]
Passo 4: Por fim, o menor entre os restantes é o [5].
Como ele já está na posição correta, a troca não é necessária.
Array ordenado: [1, 2, 3, 5, 7] */

public class SelectionSort {
    public static void main(String[] args) {
        int [] array = {7, 3, 5, 2, 1};
        for (int i = 0; i < array.length-1; i++) {
            int minor = array[i];
            int indexOfMin = i;
            for (int j = i+1 ; j < array.length; j++) {
                if (array[j] < minor) {
                    minor = array[j];
                    indexOfMin = j;
                }
            }
            array[indexOfMin] = array[i];
            array[i] = minor;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }


    }
}

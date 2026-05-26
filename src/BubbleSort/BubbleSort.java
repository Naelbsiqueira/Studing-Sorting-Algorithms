package BubbleSort;
/*O Bubble Sort (ou ordenação por flutuação/bolha) é um dos algoritmos de ordenação mais simples e clássicos da computação.
Ele funciona percorrendo repetidamente uma lista de elementos, comparando pares adjacentes (lado a lado) e trocando-os
de lugar caso estejam na ordem errada. O processo se repete até que nenhuma troca seja necessária, indicando que a lista está ordenada.
Como funciona?
Imagine que você quer ordenar uma lista de números em ordem crescente:
O algoritmo compara o primeiro número com o segundo.
Se o primeiro for maior, eles trocam de posição.Em seguida,
compara o segundo com o terceiro. Faz a troca se necessário.
Esse processo continua até o final da lista.
A cada "passagem", o maior valor da lista "borbulha" (daí o nome Bubble) para a sua posição correta no final.
O algoritmo repete essa varredura para os elementos restantes até que a lista inteira esteja organizada.
Exemplo visual deuma array desordenado : [5, 3, 8, 4, 2]
Passagem 1: Compara 5 e 3. Troca? Sim. -> [3, 5, 8, 4, 2]
Compara 5 e 8. Troca? Não. -> [3, 5, 8, 4, 2]
Compara 8 e 4. Troca? Sim. -> [3, 5, 4, 8, 2]
Compara 8 e 2. Troca? Sim. -> [3, 5, 4, 2, 8]
(O 8 chegou ao topo)
Passagem 2: O processo é repetido para os quatro primeiros elementos, e assim por diante, até a lista ficar [2, 3, 4, 5, 8].
Desempenho e Complexidade:
Apesar de ser extremamente fácil de entender e implementar, o Bubble Sort não é eficiente para grandes volumes de dados.
Melhor Caso (lista já ordenada): O(n);
Caso Médio e Pior Caso: O(n^2)
Espaço de Memória: O(1)
É um algoritmo in-place, ou seja, ordena os dados dentro da própria estrutura sem precisar de listas auxiliares.*/

public class BubbleSort {
    public static void main(String[] args) {
        int [] array = {3, 5, 8, 4, 2};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }

    }






}

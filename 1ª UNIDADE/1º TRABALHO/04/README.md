## Fibonacci complexidade do pior caso

A complexidade no pior caso é O(n) = n, pois ele fará n iterações para realizar o somatório da sequência de fibonacci.

## Complexidade recursiva x iterativa

O código da versão recursiva é muito mais simples, porém não é muito eficiente, onde cada chamada da função chama ela mesma recursivamente duas vezes, tendo uma complexidade de O(2^n) onde n é a posição passada como parâmetro.

Já a versão iterativa te uma complexidade de O(n) já que irá executar apenas n vezes sem recursão.

## Forma recursiva mais eficiente

Sim, é possível, podemos salvar a sequencia de fibonacci em uma estrutura de dados e sempre que a função for chamada só haverá calculo se o 'n' atual for maior que o anterior, mas a mesma abordagem pode ser realizada no algorítmo iterativo então não faz sentido usar isso com o algorítmo recursivo.

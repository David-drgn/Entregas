***

# ALGORITMO 2

***

1.         Function BuscaLinerarEmOrdem(A,n,x)
1.             i=1
1.             enquanto i <= e x >= A[i] faça
1.                 SeA[i]== x então
1.                     Devolva i
1.                 i = i = 1
1.             Devolva -1

### Markdown:

| Linha          | Instrução                           | Vezes  |
| -------------- | ----------------------------------- | ------ |
| 1              | Function BuscaLinerarEmOrdem(A,n,x) | 0      |
| 2              | i = 1                               | T      |
| 3              | enquanto i <= e x >= A[i] faça      | px     |
| 4              | SeA[i]== x então                    | px     |
| 5              | Devolva i                           | 1      |
| 8              | i = i = 1                           | px - 1 |
| 9              | Devolva - 1                         | T      |
| T              | T + Tpx + 2Tpx + 2t(px - 1) + T     | 5tpx   |
| 1° posição: 5T | ultima posição: 5Tn                 | 5tpx   |

***

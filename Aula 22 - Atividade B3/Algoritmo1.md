***

# ALGORITMO 1

***

1.       Function BuscaLinerar(A,n,x){
1.            i = 1
1.            Enquanto i <= n faça
1.                Se A[i]== x
1.                então
1.                    Devolva i
1.                i = i = 1
1.            Devolva-1
1.        }

### Markdown:

| Linha          | Instrução                       | Vezes  |
| -------------- | ------------------------------- | ------ |
| 1              | Function BuscaLinerar(A,n,x){   | 0      |
| 2              | i = 1                           | T      |
| 3              | Enquanto i <= n faça            | px     |
| 4              | Se A[i]== x                     | px     |
| 5              | Devolva i                       | 1      |
| 8              | i = i = 1                       | px - 1 |
| 9              | Devolva-1                       | T      |
| 10             | }                               | 0      |
| T              | T + Tpx + 2Tpx + 2t(px - 1) + T | 5tpx   |
| 1° posição: 5T | ultima posição: 5Tn             | 5tpx   |

***
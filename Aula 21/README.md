# ALGORITMO 1

1.     Function BuscaLinerar(K){
1.       i = 1
1.       for (i < n; i++){
1.         se A[i] == k{
1.         devolve i
1.        }
1.       }
1.       devolve i
1.     }

### Markdown:

| Linha | Instrução | Contagem |
|-------|-----------|----------|
| 1 | Declara função passando parâmetro | 2 | 
| 2 | Cria a variável i | 1 |
| 3 | Declara um loop que lê o valor o de i e n, compara ambas as variáveis, acrescenta 1 ao i | 5 | 
| 4 | Lê o array A, na determinada posição, lê i e verifica se é igual a K, lendo K | 4 |
| 5 | Retorna o valor que foi identificado em i | 2 |
| 8 | Retorna o valor que foi identificado em i | 2 |
| ? | O total de instruções é indeterminado, dependendo do tamanho do array, mas caso tenha apenas uma posição podemos retratar como: | 16 |

***

# ALGORITMO 2

1.     Function BuscaLinerarEmOrdem(K){
1.       i = 1 
1.       enquanto i <= n e K >=A[i] {
1.         se A[i] == k entao 
1.         devolve i
1.       }
1.       i = i + 1 7 
1.     }
1.     devolve -1
1.     }

### Markdown:

| Linha | Instrução | Contagem |
|-------|-----------|----------|
| 1 | Declara função passando parâmetro | 2 instruções |
| 3 | Cria e declara o valor da variável “i” e determina que se “k” for menor que o array de “a”, e busca o valor de “i” | 6 |
| 5 | Se o array de “a” for igual a “k”, então ele devolve valor de “i”. | 8 | 
| 7 | Declara um novo valor de i, está lendo o valor de i e depois soma com 17 | 3 |
| 9 | Retorna o valor | 1 |

***

# ALGORITMO 3

1.      Function BuscaBinaria(x){
1.        esq = 1 
1.        dir = n
1.        enquanto esq <= dir faca{
1.          meio = (( esq +dir ) /2) 
1.          se A[meio] == x entao 
1.            devolve meio 
1.          senao se x > A[ meio ] entao 
1.            esq = meio + 1 
1.          senao 
1.            dir = meio -1 
1.        }
1.        devolve -1
1.      }

### Markdown:

| Linha | Instrução | Contagem |
|-------|-----------|----------|
| 1 | Cria a função e passa o parâmetro | 2 |
| 2 | Cria e determina um valor para a variável “esq” que será “1” | 2 |
| 3 | Cria e determina um valor para a variável “dir” que será “n” | 2 |
| 4 | Determina que se, “esq” for menor ou igual a “dir” faça | 5 |
| 5 | Cria e determina a variável “meio”, pega as outras variáveis e faz a  soma de das 2 variáveis “esq” e  “dir”, depois de soma, divide por 2 | 5 | 
| 6 | Se o array de “A” for igual a “x” então | 6 |
| 7 | Retorna o meio | 2 |
| 8 | Caso não siga as intruções da linha  ,pede para averiguar “X” maior que o Array de “A” então | 5 |
| 9 | Redefine a variável “esq”, le a variável meio adicionando mais 1 | 3 |
| 10 | Caso não ocorra, faça isso | 1 |
| 11 | Redefine a variável “dir”, le a variável meio adicionando menor 1 | 3 |
| 12 | Retorna o valor | 2 |

***

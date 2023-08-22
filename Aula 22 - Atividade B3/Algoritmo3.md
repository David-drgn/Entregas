---
# ALGORITMO 3
---

1.                 Esq = 1
1.                 Dir = 1
1.                 Enquanto Esq <= Dir faça
1.                     Meio = (Esq + Dir) / 2
1.                     Se A[Meio] == x então
1.                         Devolve Meio
1.                     Senao se x> A[meio] então
1.                         Esq = meio + 1
1.                     Senao
1.                         Dir = meio + 1
1.                 Devolva -1

### Markdown:

| Linha | Instrução                                                         | Vezes      |
| ----- | ----------------------------------------------------------------- | ---------- |
| 1     | Esq = 1                                                           | T          |
| 2     | Dir = 1                                                           | T          |
| 3     | Enquanto Esq <= Dir faça                                          | px         |
| 4     | Meio = (Esq + Dir) / 2                                            | px         |
| 5     | Se A[Meio] == x então                                             | px         |
| 8     | Devolve Meio                                                      | T          |
| ?     | Senao se x> A[meio] então                                         | px         |
| ?     | Esq = meio + 1                                                    | px - 1     |
| ?     | Senao                                                             | px         |
| ?     | Dir = meio + 1                                                    | px - 1     |
| T     | T + T + Tpx + Tpx + Tpx + T + Tpx + 2t(px - 1) + Tpx + 2t(px - 1) | -1T + 8Tpx |

---

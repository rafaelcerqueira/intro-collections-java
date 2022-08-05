# Trabalhando com Collections em Java

### Collection

- Collection é um objeto que agrupa múltiplos elementos (variáveis primitivas ou objetos) dentro de uma única unidade.
- Serve para armazenar e processar conjuntos de dados de forma eficiente.
- Antes do Java 2 (JDK 1.2), a implementação de coleções na linguagem Java incluía poucas classes e não tinha a organização de um framework.

### Composição das Collections
- Interfaces: É um contrato que quando assumido por uma classe deve ser implementado.
- Implementação ou Classes: são as materializações, a codificação das interfaces.
- Algoritmos: É uma sequência lógica, finita e definida de instruções que devem ser seguidas para resolver um problema.

### Interface List
#### java.util.List
- Elementos duplicados e garante ordem de inserção

> ArrayList - Vector - LinkedList

- ArrayList deve ser usado onde mais operações de pesquisa são necessárias, enquanto LinkedList deve ser usado onde mais operações de inserção e exclusão são necessárias.

> interface Comparable* para comparar itens dentro da lista

### Coleções singulares: Set
#### java.util.Set

- Não permite elementos duplicados
- Não possui índice
  - HashSet
  - LinkedHashSet
  - TreetSet





----------------------------------
#### Conteúdo retirado do Curso Introdutório Collections Java
- Conteúdo original no repositório do GitHub da Camila:
  https://github.com/cami-la/curso-dio-intro-collections
- Curso na plataforma DIO: https://web.dio.me/

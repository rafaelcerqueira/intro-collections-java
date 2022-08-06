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

- Não permite elementos duplicados;
- Não possui índice.
  - HashSet;
  - LinkedHashSet;
  - TreetSet;

### Coleções de Pares: Map
#### java.util.Map
- Elementos únicos (key) para cada valor (value).
  - Hashtable
  - TreeMap
  - Hashmap
  - LinkedHashMap

### Java Stream
1. Classe Anônima
2. Functional Interface
3. Lambda
4. Reference Method
5. Stream API


1. **Classe anônima** em Java é uma classe que não recebeu um nome e é declarada e instanciada em uma única instrução. Deve-se considerar o uso de uma classe anônima sempre que precisar criar uma classe que será instanciada apenas uma vez.
2. **Functional Interface** é qualquer _interface_ com um SAM (_Single Abstract Method_) e sua implementação pode ser tratada como expressões lambda.
3. **Lambda** é uma função sem declaração, isto é, não é necessário colocar um nome, um tipo de retorno e o modificador de acesso. A ideia é que o método seja declarado no mesmo lugar em que será usado. As funções lambda em Java tem a sintaxe definida como `(argumento) -> (corpo)`.
4. **Reference Method** é um novo recurso do Java 8 que permite fazer referência a um método ou construtor de uma classe (de forma funcional) e assim indicar que ele deve ser utilizado num ponto específico do código, deixando-o mais simples e legível. Para utilizá-lo, basta informar uma classe ou referência seguida do símbolo `::` e o nome do método sem os parênteses no final.
5. **Stream API** traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Combinada com as expressões lambda, ela proporciona uma forma diferente de lidar ocm conjuntos de elementos, oferecendo ao desenvolvedor uma maneira simples e concisa de escrever código que resulta em facilidade de manutenção e paralelização sem efeitos indesejados em tempo de execução.
----------------------------------
#### Conteúdo retirado do Curso Introdutório Collections Java
- Conteúdo original no repositório do GitHub da Camila:
  https://github.com/cami-la/curso-dio-intro-collections
- Curso na plataforma DIO: https://web.dio.me/

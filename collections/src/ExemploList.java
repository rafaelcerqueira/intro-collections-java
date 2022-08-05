import java.util.*;

public class ExemploList {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        //Uma lista e adicione as sete notas.
        List<Double> notas = new ArrayList<>();
        notas.add(7.0); // A notação double pode ser feita 7.0 ou 7d
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        //Exibir a posição da nota 5.0.
        System.out.println("A posição da nota 5.0 é: " + notas.indexOf(5d));

        //Adicionar na lista a nota 8.0 na posição 4.
        notas.add(4, 8d);
        System.out.println(notas);

        //Substituir a nota 5.0 pela nota 6.0.
        notas.set(notas.indexOf(5d), 6d);
        System.out.println(notas);

        //Conferir se a nota 5.0 está na lista.
        System.out.println(notas.contains(5d));

        //Exibir a terceira nota adicionada.
        System.out.println("A terceira nota adicionada foi: " + notas.get(2));

        //Exibir a menor nota.
        //Para este caso, devemos utilizar o método Collections.min() porque a classe Double implementa a interface Comparable, na qual compara os valores.
        System.out.println("A menor nota é " + Collections.min(notas));

        //Exibir a maior nota.
        //Collections.max()
        System.out.println("A maior nota é: " + Collections.max(notas));

        //Exibir a soma dos valores.
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("A soma dos valores é: " + soma);

    }
}

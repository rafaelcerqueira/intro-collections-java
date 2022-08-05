import java.util.ArrayList;
import java.util.List;

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

    }
}

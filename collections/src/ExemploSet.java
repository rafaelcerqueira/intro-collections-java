import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        // Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7, 8.5, 9.3, 5, 7, 0, 3.6)); //corrigir erro.

        System.out.println(notas.toString());
    }
}

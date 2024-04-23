import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        List<String> candidatos = Arrays.asList("Felipe", "Marcia", "Thaís");

        candidatos.stream()
                .forEach(candidato -> entrandoContato(candidato));
    }

    private static void entrandoContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando;
        boolean atendeu;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;

            if (continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato realizado com sucesso! N° " + tentativasRealizadas);
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com o ".concat(candidato));
    }

    private static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    private static void imprimirSelecionados() {
        List<String> candidatos = Arrays.asList("Felipe", "Marcia", "Thaís");
        System.out.println("Imprimindo a lista de candidatos...");

        candidatos.stream().forEach(candidato -> System.out.println( "Candidatos: ".concat(candidato)));
    }

    private static void selecaoDeCandidatos() {
        List<String> candidatos = Arrays.asList("Felipe", "Marcia", "Julia", "Thís", "João");
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 3 && candidatosAtual < candidatos.size()) {
            String candidato = candidatos.get(candidatosAtual);
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato ".concat(candidato).concat(" Solicitou este valor de salário ") + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato ".concat(candidato).concat(" foi selecionado para a vaga"));
                candidatosSelecionados++;
            }

            candidatosAtual++;
        }
    }

    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    private static void analisarCandidatura(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido)
            System.out.println("Ligar para o candidato.");
        else if (salarioBase == salarioPretendido)
            System.out.println("Vamos te ligar.");
        else
            System.out.println("Aguardando o resultado os demais candidatos. Volte mais tarde!");
    }
}
package condicionais;
import java.util.Scanner;
public class Condicionais_TempoJogo {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hora inicial do jogo ?");
        int horaInicial = input.nextInt();
        System.out.println("Hora final do jogo?");
        int horaFinal = input.nextInt();
        int duracao;
        if(horaInicial < horaFinal){
            duracao = horaFinal - horaInicial;
        }else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("Duração do jogo: " + duracao + " horas");
    }
}

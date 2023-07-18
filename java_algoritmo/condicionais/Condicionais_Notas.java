package condicionais;
import java.util.Scanner;
public class Condicionais_Notas {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Informe a sua primeira nota");
        float nota01 = input.nextFloat();
        System.out.println("Informe a sua segunda nota");
        float nota02 = input.nextFloat();
        System.out.println("Sua Nota Final : " + somatorioNotas(nota01,nota02));
        System.out.println("Seu resultado é : " + mensagem(somatorioNotas(nota01,nota02)));

    }
    public static float somatorioNotas(float nota01,float nota02){
        float notaFinal;
        return notaFinal = nota01 + nota02;

    }
    public static String mensagem(float notaFinal){
        String resultado;
        return resultado = (notaFinal < 60.0 ) ? "Reprovado" : "Aprovado";
    }
}

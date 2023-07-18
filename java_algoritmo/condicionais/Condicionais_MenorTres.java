
import java.util.Scanner;
public class Condicionais_MenorTres {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        receberDados();
    }
    public static String receberDados(){
        System.out.println("Informe o primeiro valor: ");
        int primeiroValor = input.nextInt();
        System.out.println("Informe o segundo valor: ");
        int segundoValor = input.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int terceiroValor = input.nextInt();

        System.out.println("MENOR VALOR = " + condicao(primeiroValor,segundoValor,terceiroValor));
        return null;
    }
    public static int condicao(int valor01,int valor02, int valor03){
        if((valor01 < valor02) && (valor01 < valor03)){
            return valor01;
        }
        else if((valor02 < valor01) && (valor02 < valor03)){
            return valor02;
        }
        else{
            return valor03;
        }
    }
}
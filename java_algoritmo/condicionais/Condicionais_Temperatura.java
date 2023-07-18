package condicionais;
import java.util.Scanner;
public class Condicionais_Temperatura {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Qual temperatura você deseja [C] -> Celsios [F] -> Fahrenheit");
        char opcao = input.next().charAt(0);

        if (opcao == 'C' || opcao == 'c') {
            System.out.println("Digite a temperatura em Celsius: ");
            double c = input.nextDouble();
            double F = (c * 9 / 5) + 32;
            System.out.println("Temperatura equivalente em Fahrenheit : " + F);

        } else if (opcao == 'F' || opcao == 'f') {
            System.out.println("Digite a temperatura em Fahrenheit: ");
            double f = input.nextDouble();
            double C = (f - 32) * 5 / 9;
            System.out.println("Temperatura equivalente em Ceslsius: " + C);
        } else {
            System.out.println("informação errado ! opcão incorreta!");
        }
    }
}
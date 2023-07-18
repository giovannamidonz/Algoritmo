package condicionais;

import java.util.Scanner;
public class Condicionais_Multiplos {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o primeiro numero ");
        int num1 = input.nextInt();
        System.out.println("Informe o segundo numero ");
        int num2 = input.nextInt();
        String resultado = num1 % num2 == 0 || num2 % num1 == 0 ? "são multiplos" : "Não são multiplos ";
        System.out.println(resultado);
    }
}

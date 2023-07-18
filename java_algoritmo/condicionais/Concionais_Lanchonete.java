package condicionais;

import java.util.Scanner;

public class Concionais_Lanchonete {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o codigo do produto");
        int codigo = input.nextInt();
        System.out.println("Informe a quantidade comprada do produto");
        int quant = input.nextInt();

        switch(codigo) {
            case 1:
                double valorPagar = 5 * quant;
                System.out.println("Valor a pagar: R$" + valorPagar);
                break;
            case 2:
                valorPagar = 3.50 * quant;
                System.out.println("Valor a pagar: R$" + valorPagar);
                break;
            case 3:
                valorPagar = 4.80 * quant;
                System.out.println("Valor a pagar: R$" + valorPagar);
                break;
            case 4:
                valorPagar = 8.90 * quant;
                System.out.println("Valor a pagar: R$" + valorPagar);
                break;
            case 5:
                valorPagar = 7.32 * quant;
                System.out.println("Valor a pagar: R$" + valorPagar);
                break;

        }
    }
}

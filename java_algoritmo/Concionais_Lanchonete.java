import java.util.Scanner;

public class Concionais_Lanchonete {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe o codigo do produto");
        int codigo = input.nextInt();
        System.out.println("Informe a quantidade do produto");
        int quant = input.nextInt();

        switch(codigo) {
            case 1:
                System.out.println("COMO TUA MÃE");
                break;
            case 2:
                System.out.println("te arromba");
                break;
        }
    }
}

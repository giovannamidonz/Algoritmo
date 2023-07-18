package condicionais;
import java.util.Scanner;
public class Condicionais_Coordenadas {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("valor de X");
        double x = input.nextDouble();
        System.out.println("valor de Y");
        double y = input.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

    }
}

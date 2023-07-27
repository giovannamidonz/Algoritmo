package repeticao;
import java.util.Scanner;
public class repeticao_ValidacaoNota {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;

        do{
            System.out.println("digite a primeira nota ");
            nota1 = input.nextDouble();
            if(nota1 > 10 || nota1 < 0){
                System.out.println("tente novamente!");
            }else{
                System.out.println("digite a segunda nota ");
                nota2 = input.nextDouble();
                if(nota2 > 10 || nota2 < 0){
                    System.out.println("tente novamente!");
                }
            }
        }while(nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10);

    }
}

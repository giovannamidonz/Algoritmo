package repeticao;
import java.util.Scanner;
public class repeticao_MediaIdade {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int num;
        int soma = 0;
        int cont = 0;
        double media= 0;
        do{
            System.out.println("digite o valor da idade");
            num = input.nextInt();
            cont++;
            if(num < 0 ){
                System.out.println("Impossivel Calcular");
                break;
            }else{
                soma += num;
                media = soma / cont;

            }
        }while(num > 0);
        System.out.println(media);
    }
}

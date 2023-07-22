package repeticao;
import java.util.Scanner;
public class Crescente {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x,y;
        do {

            System.out.println("Digite o valor x: ");
             x = input.nextInt();
            System.out.println("Digite o valor y: ");
            y = input.nextInt();
            if(x < y){
            System.out.println("Crescente");
            }else if(y < x){
                System.out.println("Descrecente");
            }
        }while(x != y);

    }
}

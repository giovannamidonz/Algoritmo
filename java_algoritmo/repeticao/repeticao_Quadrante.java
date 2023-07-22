package repeticao;
import java.util.Scanner;
public class repeticao_Quadrante {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        int y;
        do{
            System.out.println("Digite os valores das coordenadas X e Y :");
            x = input.nextInt();
            y = input.nextInt();
            if(x > 0 && y > 0){
                System.out.println("Q1");
            }else if(x > 0 && y < 0){
                System.out.println("Q4");
            }else if (x < 0 && y < 0){
                System.out.println("Q3");
            }else{
                System.out.println("Q2");
            }
        }while(x != 0 && y != 0);

    }
}

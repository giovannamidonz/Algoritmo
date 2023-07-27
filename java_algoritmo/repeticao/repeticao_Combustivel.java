package repeticao;
import java.util.Scanner;
public class repeticao_Combustivel {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int codigo ;
        int contAl = 0;
        int contGa = 0;
        int contDi = 0;
        do{
            System.out.println("Informe um codigo (1, 2, 3) ou 4 para parar: ");
            codigo = input.nextInt();
            if(codigo == 1){
                contAl++;
            }else if(codigo == 2 ){
                contGa++;
            } else if (codigo == 3) {
                contDi++;
            }
        }while(codigo != 4);
        System.out.println("Muito Obrigado! ");
        System.out.println("Alcool = " + contAl + "\nGasolina = "+ contGa + "\nDiesiel = " + contDi);
    }
}

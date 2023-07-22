package repeticao;
import java.util.Scanner;
public class repeticao_SenhaFixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int senhaValida = 2312;
        int senha ;
        do{
            System.out.println("Digite a sneha :");
            senha = input.nextInt();
            if(senha == senhaValida){
                System.out.println("Acesso Permitido!");
            }else{
                System.out.println("Senha Invalida! Tente novamente:");
            }
        }while(senha != senhaValida);
    }
}

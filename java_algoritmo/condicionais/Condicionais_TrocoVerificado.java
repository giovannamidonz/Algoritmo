package condicionais;
import java.util.Scanner;
public class Condicionais_TrocoVerificado {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        caixa();
    }

    public static void caixa(){
        System.out.println("Informe o valor unitário do produto : ");
        double valorProduto = input.nextDouble();
        System.out.println("Informe a quantidade de unidade comprodas : ");
        int quantidade = input.nextInt();
        System.out.println("Valor dado pelo cliente : ");
        double dinheiro = input.nextDouble();
        System.out.println(troco(valorProduto,quantidade,dinheiro));


    }

    public static double troco(double valorProduto,int quant, double dinheiro){
        double troco;
        double valorTotalProduto = valorProduto * quant ;
        troco = dinheiro - valorTotalProduto;
        if(dinheiro < valorTotalProduto ){
            System.out.println("DINHEIRO INSUFICIENTE. FALTAM " + troco + "Reais" );
        }
        return troco;
    }
}

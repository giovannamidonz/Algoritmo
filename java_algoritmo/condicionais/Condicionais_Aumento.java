package condicionais;

import java.util.Scanner;
public class Condicionais_Aumento {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("digite o salario da pessoa");
        double salario = input.nextDouble();

        double novo_salario;
        double aumento;
        double porcetagemAumento;

        if(salario <= 1000){
            porcetagemAumento=20;
        }else if(salario <= 3000){
            porcetagemAumento=15;
        }else if (salario <= 8000){
            porcetagemAumento=10;
        }else{
            porcetagemAumento=5;
        }
        aumento = (porcetagemAumento /100) * salario;
        novo_salario = salario + aumento;

        System.out.println("Novo salario=" + novo_salario +
                "\naumento=" + aumento + "\nporcentagem=" + porcetagemAumento);

    }
}

package Q7;

import java.util.Scanner;

public class q7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] mes = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

        float maior = Float.MIN_VALUE,  menor = Float.MAX_VALUE;
        int C = 0,               P = 0;

        for(int i = 0; i < 12; i++){
            System.out.print("Digite a temperatura do mês " + (i+1) + " (" + mes[i] + "): ");
            float temp = sc.nextFloat();

            if(temp > maior){
                maior = temp;
                C = i;
            }

            if(temp < menor){
                menor = temp;
                P = i;
            }
        }

        System.out.println("\nMAIOR TEMPERATURA: " + maior + " no mês de " + mes[C]);
        System.out.println("MENOR TEMPERATURA: " + menor + " no mês de " + mes[P]);
    }
}
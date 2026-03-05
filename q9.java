package Q9;

import java.util.Scanner;

public class q9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] n = new int [6];

        int somap=0;


        int qtdi=0;


        for(int i =0; i<6;i++){
            System.out.println("Digite um valor: ");
            n[i] = sc.nextInt();

            if(n[i]%2==0){
                somap+=n[i];
            }

        }

        System.out.println("Relatorio:");
        System.out.println("Os numeros pares sao: ");



        for(int i = 0;i<6;i++){
            if(n[i]%2==0){
                System.out.println("numero "+n[i]+" na posicao "+i);

            }
        }
        System.out.println("Soma dos pares: "+somap);


        System.out.println("Os numeros impares sao: ");

        for(int i = 0;i<6;i++){
            if(n[i]%2!=0){
                System.out.println("numero "+n[i]+" na posicao "+i);
                qtdi++;

            }
        }

        System.out.println("Quantidade dos impares: "+qtdi);



    }
}

package Q1;

import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int x;

    System.out.println("Digite um numero para descobrir o fatorial");
    x=sc.nextInt();

    int z=x;

    for(int i =x-1;i>=1;i--){
        x*=i;
    }

        System.out.println("Fatoria de "+z+" e = "+x);


    }

}
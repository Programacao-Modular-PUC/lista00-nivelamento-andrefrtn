package Q2;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] v = new int[3];

        System.out.print("Digite o valor de x: ");
        v[0] = sc.nextInt();

        System.out.print("Digite o valor de y: ");
        v[1] = sc.nextInt();

        System.out.print("Digite o valor de z: ");
        v[2] = sc.nextInt();

        int x = v[0];
        int y = v[1];
        int z = v[2];

        int maior = v[0];
        for (int i = 1; i < 3; i++) {
            if (v[i] > maior) {
                maior = v[i];
            }
        }

        int menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);

        int inicio = Math.min(y, z);
        int fim = Math.max(y, z);

        if (x >= inicio && x <= fim) {
            System.out.println("x esta dentro do intervalo [" + inicio + ", " + fim + "]");
        } else {
            System.out.println("x esta fora do intervalo [" + inicio + ", " + fim + "]");
        }

        if (y != 0 && z != 0) {
            if (x % y == 0 && x % z == 0) {
                System.out.println("x e divisivel por y e por z.");
            } else {
                System.out.println("x NAO e divisivel por y e por z.");
            }
        } else {
            System.out.println("Não e possivel verificar divisibilidade por zero.");
        }



    }

}


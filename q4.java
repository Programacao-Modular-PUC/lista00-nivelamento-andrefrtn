package Q4;

import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Elementos de X: ");
        n = sc.nextInt();
        System.out.println("Elementos de Y: ");
        m = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite valor de X em " + i);
            x[i] = sc.nextInt();
        }
        for (int j = 0; j < m; j++) {

            System.out.println("Digite valor de Y em " + j);
            y[j] = sc.nextInt();
        }
        int[] z = new int[n + m];
        int tamanhoZ = 0;
        for (int i = 0; i < n; i++) {
            z[tamanhoZ] = x[i];
            tamanhoZ++;
        }
        for (int i = 0; i < m; i++) {
            boolean existe = false;
            for (int j = 0; j < tamanhoZ; j++) {
                if (y[i] == z[j]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                z[tamanhoZ] = y[i];
                tamanhoZ++;
            }
        }
        System.out.println("Vetor união Z:");
        for (int i = 0; i < tamanhoZ; i++) {
            System.out.print(z[i] + " ");
        }
        sc.close();
    }
}
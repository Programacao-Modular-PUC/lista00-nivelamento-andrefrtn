package Q6;

import java.util.Scanner;

public class q6 {

    public static void main(String[] args) {

        String[] gb = new String[8];

        int a;
        String[] gbA = new String[8];

        int numapv=0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de alunos: ");
        a = sc.nextInt();

        sc.nextLine(); // limpa buffer

        int[] nota = new int[a];
        int[] num = new int[a];

        int[] alu = new int[a];

        for (int i = 0; i < 8; i++) {
            System.out.print("\nResposta da questao " + i+1);
            gb[i] = sc.nextLine();

        }

        for (int i = 0; i < a; i++) {

            System.out.println("\nDigite seu numero aluno " + i + 1);
            num[i] = sc.nextInt();

            sc.nextLine(); // limpa buffer

            for (int j = 0; j < 8; j++) {
                System.out.println("Aluno " + i + 1 + "Digite sua alternativa da questao " + j + 1);

                gbA[j] = sc.nextLine();
                if (gbA[j].equalsIgnoreCase(gb[j])) {
                    nota[i]++;
                }
            }

        }

        for (int i = 0; i < a; i++){
            System.out.print("\n Numero: "+num[i]+"\tNota: "+nota[i]);


        }


        for (int i = 0; i < a; i++){
        if(nota[i]>=6){
            numapv++;
        }

        }

        double porc = ((double) numapv / a) * 100;
        System.out.print("\nPorcentagem de aprovados: "+porc+"%");



        }
    }


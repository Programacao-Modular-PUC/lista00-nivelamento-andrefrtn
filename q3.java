package Q3;

import java.util.Scanner;
public class q3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero de alunos em PM: ");
        int pm = sc.nextInt();
        System.out.println("Digite o numero de alunos em Modelagem: ");
        int mod = sc.nextInt();
        int [] vpm = new int[pm];
        int [] vmod = new int[mod];
        for(int i = 0;i<pm;i++){
            System.out.println("Informe a matricula do aluno: "+ i +
                    "de PM");
            vpm[i]=sc.nextInt();
        }
        for(int j = 0;j<mod;j++){
            System.out.println("Informe a matricula do aluno: "+ j +
                    "de MODELAGEM");
            vmod[j]=sc.nextInt();
        }
        for(int i = 0;i<pm;i++ ){
            for(int j=0;j<mod;j++){
                if(vpm[i]==vmod[j]){
                    System.out.println("Aluno "+vpm[i]+" esta matriculado em ambas materias");
                }
            }

        }

    }

}
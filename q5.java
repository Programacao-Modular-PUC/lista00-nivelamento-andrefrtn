package Q5;

import java.util.Scanner;

public class q5 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        String sx, ol,cb;
    int idd=0;
    int cf=0;
    int maior=0;
    int menor = Integer.MAX_VALUE;


    do{
        System.out.println("Idade:");
        idd = sc.nextInt();
        if(idd==-1){
            break;}

        sc.nextLine(); // limpa o \n que sobrou no buffer   chat explicou


        System.out.println("Sexo:");
        sx = sc.nextLine(); //

        System.out.println("Cor do cabelo:");
        cb = sc.nextLine();

        System.out.println("Cor do olho:");
        ol = sc.nextLine();

        if(idd>maior){
            maior=idd;
        }


        if (idd < menor) {
            menor = idd;
        }

        if ((idd >= 18 && idd <= 35)
                && (sx.equalsIgnoreCase("Feminino"))
                && (cb.equalsIgnoreCase("Loiro"))
                && (ol.equalsIgnoreCase("Verde"))) {

        cf++;
        }





    }while(idd!=-1);


    System.out.println("Maior idade: "+maior);
        System.out.println("Menor idade: "+menor);
        System.out.println("Mulheres entre 18 e 35, loiras e cin olho verde: "+cf);




    }
}

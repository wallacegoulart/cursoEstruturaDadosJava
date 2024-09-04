package application;

import java.util.Scanner;

import entities.Numero;

/*
 * 
 * @author prof. Marcio Porto Feitosa
 * @copia Wallace Goulart
 * data 04/09/2024
 */
public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Numero numero = new Numero();

        while(true){
            System.out.println("========================================");
            System.out.println("            Estudo de caso TAD          ");
            System.out.println("========================================");
            System.out.println("0 - encerrar");
            System.out.println("1 - ler valor");
            System.out.println("2 - atribuir valor");

            System.out.print("Qual a sua opcao?  ");
            int opcao = sc.nextInt();

            if(opcao==0){
                break;
            }
            else if(opcao==1){
                System.out.println();
                System.out.println(" " +numero.getValor()+" ");

            }
            else if(opcao==2){
                System.out.print("Forneca o novo valor: ");
                float novoValor = sc.nextFloat();
                numero.setValor(novoValor);
            }

        }

        System.out.println("  FIM ");
    }
}

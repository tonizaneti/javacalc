package org.example;
import java.util.Scanner;

public class Main4 {
    public static void main(String[]     args){
        // TODO code application logic here
        Scanner reader =new Scanner(System.in);

        System.out.println("Digite o numero da operacao a ser realizada: \n 1- Adicao \n2-Subtracao \n3-Divisao \n4-Multiplicacao");
        String op= reader.nextLine();
        switch(op){
            case "1":{

                System.out.println("Digite o primeiro numero");

                int num1 = reader.nextInt();

                System.out.println("Digite o segundo numero");
                int num2 = reader.nextInt();
                int soma = num1+num2;
                System.out.printf ("A somatoria de %d e %d é %d %n", num1, num2, soma);
                break;
            }
            case "2": {
                System.out.println("Digite o número inicial");
                int num1 = reader.nextInt();
                System.out.println("Digite o numero a ser subtraido");
                int num2 = reader.nextInt();
                int subtracao = num1 - num2;
                System.out.printf("A subtracao de %d - %d é %d %n", num1, num2, subtracao);
                break;
            }
            case "3":{
                System.out.println("Digite o número a ser dividido");
                int dividendo =reader.nextInt();
                System.out.println("Digite por qual número ele será dividido");
                int divisor = reader.nextInt();
                int quociente = dividendo / divisor;
                System.out.printf("O resultado de %d dividido por %d é %d", dividendo, divisor, quociente);
            }
            case "4":{
                System.out.println("Digite o número a ser multiplicado");
                int num1 = reader.nextInt();
                System.out.println("Digite o segundo número a ser multiplicado");
                int num2 = reader.nextInt();
                int resultado = num1 * num2;
                System.out.println("O resultado de %d multiplicado por %d é %d", num1, num2, resultado);
            }
            default:
                System.out.println("Opcao Invalida!");
        }
        reader.close();
    }
}

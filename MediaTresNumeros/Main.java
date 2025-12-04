import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //criação do objeto scanner para ler os dados
        Scanner entrada = new Scanner(System.in);

        //solicitar os três numeros ao usuario
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double num3 = entrada.nextDouble();

        
        //calcular media
        double media = (num1 + num2 + num3) /3;

        //exibir resultado formatado
        System.out.printf("A média dos três número é: %.2f%n ", media);

        //fechamento do Scanner para evitar vazamento de recursos
        entrada.close();  
    }
}
package AtividadeDePesquisaLPP;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            
            int triplo = numero * 3;
            System.out.println("O número é par. Seu triplo é: " + triplo);
        } else {
            
            int quadrado = numero * numero;
            System.out.println("O número é ímpar. Seu quadrado é: " + quadrado);
        }
        
        scanner.close();
    }

}


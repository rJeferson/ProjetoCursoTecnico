package AtividadeDePesquisaLPP;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota (A): ");
        double notaA = scanner.nextDouble();
        
        System.out.print("Digite a segunda nota (B): ");
        double notaB = scanner.nextDouble();
        
        // Peso das notas
        double pesoNotaA = 2.0;
        double pesoNotaB = 3.0;
        
        // Calculando a média ponderada
        double media = (notaA * pesoNotaA + notaB * pesoNotaB) / (pesoNotaA + pesoNotaB);
        
        System.out.printf("Média do aluno: %.1f%n", media);
        
        scanner.close();
    }


}
